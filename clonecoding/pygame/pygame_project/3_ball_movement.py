# 📌ppang 게임

import pygame  # 파이썬 라이브러리인 pygame을 이용
import os  # 파일위치를 반환해주기 위해 필요

#############################################################################################

## 기본 초기화 (반드시 해야 하는 것들)

pygame.init()

# 화면 크기 설정
screen_width = 640    # 가로크기
screen_height = 480   # 세로크기
screen = pygame.display.set_mode((screen_width, screen_height))  # 지정해준 크기로 화면 크기설정

# 화면 타이틀 설정
pygame.display.set_caption("ppang game")

# FPS
clock = pygame.time.Clock()

#############################################################################################

## 1. 사용자 게임 초기화 (배경화면, 게임이미지, 좌표, 속도, 폰트 등)

# 이미지 경로 지정
current_path = os.path.dirname(__file__)  # 현재파일 위치 반환
image_path = os.path.join(current_path, "images")  # images 폴더 위치 반환

# 배경 만들기
background = pygame.image.load(os.path.join(image_path, "background.png"))

# 스테이지 만들기
stage = pygame.image.load(os.path.join(image_path, "stage.png"))
stage_size = stage.get_rect().size
stage_height = stage_size[1]  # 스테이지의 높이 위에 캐릭터를 두기 위함

# 캐릭터 만들기
character = pygame.image.load(os.path.join(image_path, "character.png"))
character_size = character.get_rect().size
character_width = character_size[0]
character_height = character_size[1]
character_pos_x = (screen_width/2) - (character_width/2)
character_pos_y = screen_height - stage_height - character_height

# 캐릭터 이동방향
character_to_x = 0  # 좌우 이동

# 캐릭터 이동속도
character_speed = 5

# 무기 만들기
weapon =  pygame.image.load(os.path.join(image_path, "weapon.png"))
weapon_size = weapon.get_rect().size
weapon_width = weapon_size[0]  # width값만 가져오는 이유는 캐릭터가 무기를 쏠때 위치를 잡아주기 위해서

# 무기 정보 
weapons = []  # 한번에 여러번 발사 가능하기 때문에 리스트로 관리

# 무기 이동속도
weapon_speed = 10

# 🔹공 만들기 (4개 크기에 대해 따로 처리)
ball_images = [
    pygame.image.load(os.path.join(image_path, "balloon1.png")),
    pygame.image.load(os.path.join(image_path, "balloon2.png")),
    pygame.image.load(os.path.join(image_path, "balloon3.png")),
    pygame.image.load(os.path.join(image_path, "balloon4.png"))
]

# 🔹공 크기에 따른 최초 속도
ball_speed_y = [-18, -15, -12, -9]  # index 0,1,2,3에 해당하는 속도값

# 🔹공 정보
balls = []

# 🔹처음 만들어지는 큰 공 추가
balls.append({
    "pos_x" : 50,  # 공의 x좌표 
    "pos_y" : 50,  # 공의 y좌표
    "img_idx" : 0,  # ball_image 인덱스
    "to_x": 3,  # 공의 x축 이동방향 (-3이면 왼쪽으로, 3이면 오른쪽으로 이동)
    "to_y": -6, # 공의 y축 이동방향
    "init_spd_y" : ball_speed_y[0]  # y축으로의 공의 최초속도
})


running = True
while running:
    dt = clock.tick(60)
    
    ## 2. 이벤트 처리 (키보드, 마우스 등)
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

        # 키보드
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_LEFT:  # 왼쪽키 누르면 캐릭터가 왼쪽으로 이동
                character_to_x -= character_speed
            elif event.key == pygame.K_RIGHT:  # 오른쪽키 누르면 캐릭터가 오른쪽으로 이동
                character_to_x += character_speed
            elif event.key == pygame.K_SPACE:  # 스페이스 누르면 무기발사
                weapon_x_pos = character_pos_x + (character_width/2) - (weapon_width/2)  # 무기의 위치를 캐릭터 중앙에 위치하도록 계산하여 지정
                weapon_y_pos = character_pos_y
                weapons.append([weapon_x_pos,weapon_y_pos])        

        if event.type == pygame.KEYUP:
            if event.key == pygame.K_LEFT or event.key == pygame.K_RIGHT:  # 좌우키를 떼면 캐릭터 이동 안함
                character_to_x = 0


    ## 3. 게임 캐릭터 위치 정의
    character_pos_x += character_to_x

    if character_pos_x < 0:  # 경계처리(화면을 벗어나지 않도록)
        character_pos_x = 0
    elif character_pos_x > screen_width - character_width:
        character_pos_x = screen_width - character_width
    
    # 무기 위치 정의
    # 반복문을 돌려 weapons에 담긴 리스트들을 w로 하나씩 가져오고,
    # w의 0번째값(즉 weapon_x_pos)과 1번째값(즉 weapon_y_pos)을 가져와 처리를 한 뒤 다시 리스트로 감싸 weapons라는 변수에 넣어줌
    # 이때 무기는 위로 쏴지므로 weapon_y_pos에서 weapon_speed만큼 빼주는 처리가 필요
    weapons = [ [w[0], w[1] - weapon_speed] for w in weapons]

    # 천장에 닿으면 무기 없애기
    weapons = [ [w[0], w[1]] for w in weapons if w[1] > 0]

    # 🔹공 위치 정의
    # enumerate(): balls 리스트에 있는 값을 하나씩 가져오면서,
    # 몇번째 인덱스인지(ball_idx) 그 인덱스에 해당하는 값(ball_val)을 출력한다
    for ball_idx, ball_val in enumerate(balls):
        ball_pos_x = ball_val["pos_x"]
        ball_pos_y = ball_val["pos_y"]
        ball_img_idx = ball_val["img_idx"]

        ball_size = ball_images[ball_img_idx].get_rect().size
        ball_width = ball_size[0]
        ball_height = ball_size[1]

        # 가로 위치
        # 공이 가로벽에 닿았을 때 가로 이동방향 변경 (튕겨 나오는 효과)
        if ball_pos_x < 0 or ball_pos_x > screen_width - ball_width:  
            ball_val["to_x"] = ball_val["to_x"] * -1  # -1을 곱해줘 이동방향을 반대로 바꿔줌 
        
        # 세로 위치
        # 공이 스테이지에 닿았을 때 튕겨 올라가는 처리
        if ball_pos_y >= screen_height - stage_height - ball_height:  # 공이 처음 스테이지에 닿아 튕겨져 올라간 경우 최초속도 정의
            ball_val["to_y"] = ball_val["init_spd_y"]  
        else:  # 그 외의 모든 경우 공의 속도를 증가
            ball_val["to_y"] += 0.5 

        ball_val["pos_x"] += ball_val["to_x"]
        ball_val["pos_y"] += ball_val["to_y"]


    ## 4. 충돌 처리
    

    ## 🔹5. 화면에 그리기 (코드 순서대로 그려짐)
    screen.blit(background, (0,0))  # 배경 그리기

    for weapon_x_pos, weapon_y_pos in weapons:  # weapons가 여러번 들어가기 때문에 반복문 사용
        screen.blit(weapon, (weapon_x_pos,weapon_y_pos))

    for idx, val in enumerate(balls):
        ball_pos_x = val["pos_x"]
        ball_pos_y = val["pos_y"]
        ball_img_idx = val["img_idx"]
        screen.blit(ball_images[ball_img_idx], (ball_pos_x,ball_pos_y))  # 공 그리기

    screen.blit(stage, (0,screen_height-stage_height))  # 스테이지 그리기
    screen.blit(character, (character_pos_x,character_pos_y))  # 캐릭터 그리기

    # 게임화면 업데이트
    pygame.display.update()

# pygame 종료
pygame.quit()

#############################################################################################