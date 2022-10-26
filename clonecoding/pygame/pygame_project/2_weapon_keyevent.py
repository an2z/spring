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
character_x_pos = (screen_width/2) - (character_width/2)
character_y_pos = screen_height - stage_height - character_height

# 🔹캐릭터 이동방향
character_to_x = 0  # 좌우 이동

# 🔹캐릭터 이동속도
character_speed = 5

# 🔹무기 만들기
weapon =  pygame.image.load(os.path.join(image_path, "weapon.png"))
weapon_size = weapon.get_rect().size
weapon_width = weapon_size[0]  # width값만 가져오는 이유는 캐릭터가 무기를 쏠때 위치를 잡아주기 위해서

# 🔹무기 한번에 여러번 발사 가능
weapons = []

# 🔹무기 이동속도
weapon_speed = 10


running = True
while running:
    dt = clock.tick(60)
    
    ## 2. 이벤트 처리 (키보드, 마우스 등)
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

        # 🔹키보드
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_LEFT:  # 왼쪽키 누르면 캐릭터가 왼쪽으로 이동
                character_to_x -= character_speed
            elif event.key == pygame.K_RIGHT:  # 오른쪽키 누르면 캐릭터가 오른쪽으로 이동
                character_to_x += character_speed
            elif event.key == pygame.K_SPACE:  # 스페이스 누르면 무기발사
                weapon_x_pos = character_x_pos + (character_width/2) - (weapon_width/2)  # 무기의 위치를 캐릭터 중앙에 위치하도록 계산하여 지정
                weapon_y_pos = character_y_pos
                weapons.append([weapon_x_pos,weapon_y_pos])        

        if event.type == pygame.KEYUP:
            if event.key == pygame.K_LEFT or event.key == pygame.K_RIGHT:  # 좌우키를 떼면 캐릭터 이동 안함
                character_to_x = 0


    ## 🔹3. 게임 캐릭터 위치 정의
    character_x_pos += character_to_x

    if character_x_pos < 0:  # 위치범위 지정 (화면을 벗어나지 않도록)
        character_x_pos = 0
    elif character_x_pos > screen_width - character_width:
        character_x_pos = screen_width - character_width
    
    # 🔹무기 위치조정
    # 반복문을 돌려 weapons에 담긴 리스트들을 w로 하나씩 가져오고,
    # w의 0번째값(즉 weapon_x_pos)과 1번째값(즉 weapon_y_pos)을 가져와 처리를 한 뒤 다시 리스트로 감싸 weapons라는 변수에 넣어줌
    # 이때 무기는 위로 쏴지므로 weapon_y_pos에서 weapon_speed만큼 빼주는 처리가 필요
    weapons = [ [w[0], w[1] - weapon_speed] for w in weapons]

    # 🔹천장에 닿으면 무기 없애기
    weapons = [ [w[0], w[1]] for w in weapons if w[1] > 0]


    ## 4. 충돌 처리
    

    ## 🔹5. 화면에 그리기 (코드 순서대로 그려짐)
    screen.blit(background, (0,0))  # 배경 그리기

    for weapon_x_pos, weapon_y_pos in weapons:  # weapons가 여러번 들어가기 때문에 반복문 사용
        screen.blit(weapon, (weapon_x_pos,weapon_y_pos))

    screen.blit(stage, (0,screen_height-stage_height))  # 스테이지 그리기
    screen.blit(character, (character_x_pos,character_y_pos))  # 캐릭터 그리기
    
    # 게임화면 업데이트
    pygame.display.update()

# pygame 종료
pygame.quit()

#############################################################################################