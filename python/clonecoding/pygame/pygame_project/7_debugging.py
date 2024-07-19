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

# 공 만들기 (4개 크기에 대해 따로 처리)
ball_images = [
    pygame.image.load(os.path.join(image_path, "balloon1.png")),
    pygame.image.load(os.path.join(image_path, "balloon2.png")),
    pygame.image.load(os.path.join(image_path, "balloon3.png")),
    pygame.image.load(os.path.join(image_path, "balloon4.png"))
]

# 공 크기에 따른 최초 속도
ball_speed_y = [-18, -15, -12, -9]  # index 0,1,2,3에 해당하는 속도값

# 공 정보
balls = []

# 처음 만들어지는 큰 공 추가
balls.append({
    "pos_x" : 50,  # 공의 x좌표 
    "pos_y" : 50,  # 공의 y좌표
    "img_idx" : 0,  # ball_image 인덱스
    "to_x": 3,  # 공의 x축 이동방향 (-3이면 왼쪽으로, 3이면 오른쪽으로 이동)
    "to_y": -6, # 공의 y축 이동방향
    "init_spd_y" : ball_speed_y[0]  # y축으로의 공의 최초속도
})

# 사라질 공, 무기 정보 저장변수
weapon_to_remove = -1  # ❔여기서 왜 -1로 설정을 해두지?/ 아 공 종류는 4개고 그 공에 해당하는 인덱스 값은 0,1,2,3 밖에 없음
ball_to_remove = -1

# 게임폰트 정의
game_font = pygame.font.Font(None, 40)

# 게임시간 정의
total_time = 100
start_tics = pygame.time.get_ticks()  # 시작 시간 정의

# 게임 종료 메세지 
# Mission Complete(성공), Game Over(살패 - 캐릭터 공에 맞음), Time Over(실패 - 시간초과)
game_result = "Game Over"


running = True
while running:
    dt = clock.tick(30)
    
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
                weapon_x_pos = character_x_pos + (character_width/2) - (weapon_width/2)  # 무기의 위치를 캐릭터 중앙에 위치하도록 계산하여 지정
                weapon_y_pos = character_y_pos
                weapons.append([weapon_x_pos,weapon_y_pos])        

        if event.type == pygame.KEYUP:
            if event.key == pygame.K_LEFT or event.key == pygame.K_RIGHT:  # 좌우키를 떼면 캐릭터 이동 안함
                character_to_x = 0


    ## 3. 게임 캐릭터 위치 정의
    character_x_pos += character_to_x

    if character_x_pos < 0:  # 경계처리(화면을 벗어나지 않도록)
        character_x_pos = 0
    elif character_x_pos > screen_width - character_width:
        character_x_pos = screen_width - character_width
    
    # 무기 위치 정의
    # 반복문을 돌려 weapons에 담긴 리스트들을 w로 하나씩 가져오고,
    # w의 0번째값(즉 weapon_x_pos)과 1번째값(즉 weapon_y_pos)을 가져와 처리를 한 뒤 다시 리스트로 감싸 weapons라는 변수에 넣어줌
    # 이때 무기는 위로 쏴지므로 weapon_y_pos에서 weapon_speed만큼 빼주는 처리가 필요
    weapons = [ [w[0], w[1] - weapon_speed] for w in weapons]

    # 천장에 닿으면 무기 없애기
    weapons = [ [w[0], w[1]] for w in weapons if w[1] > 0]

    # 공 위치 정의
    # enumerate(): balls 리스트에 있는 값을 하나씩 가져오면서,
    # 몇번째 인덱스인지(ball_idx) 그 인덱스에 해당하는 값(ball_val)을 출력한다
    for ball_idx, ball_val in enumerate(balls):
        ball_x_pos = ball_val["pos_x"]
        ball_y_pos = ball_val["pos_y"]
        ball_img_idx = ball_val["img_idx"]

        ball_size = ball_images[ball_img_idx].get_rect().size
        ball_width = ball_size[0]
        ball_height = ball_size[1]

        # 가로 위치
        # 공이 가로벽에 닿았을 때 가로 이동방향 변경 (튕겨 나오는 효과)
        if ball_x_pos < 0 or ball_x_pos > screen_width - ball_width:  
            ball_val["to_x"] = ball_val["to_x"] * -1  # -1을 곱해줘 이동방향을 반대로 바꿔줌 
        
        # 세로 위치
        # 공이 스테이지에 닿았을 때 튕겨 올라가는 처리
        if ball_y_pos >= screen_height - stage_height - ball_height:  # 공이 처음 스테이지에 닿아 튕겨져 올라간 경우 최초속도 정의
            ball_val["to_y"] = ball_val["init_spd_y"]  
        else:  # 그 외의 모든 경우 공의 속도를 증가
            ball_val["to_y"] += 0.5 

        ball_val["pos_x"] += ball_val["to_x"]
        ball_val["pos_y"] += ball_val["to_y"]


    ## 4. 충돌 처리
    # 캐릭터 rect 정보 가져오기
    character_rect = character.get_rect()
    character_rect.left = character_x_pos
    character_rect.top = character_y_pos
    
    # 🔹공과 캐릭터 충돌 처리
    for ball_idx, ball_val in enumerate(balls):
        ball_x_pos = ball_val["pos_x"]
        ball_y_pos = ball_val["pos_y"]
        ball_img_idx = ball_val["img_idx"]

        # 공 rect 정보 가져오기
        ball_rect = ball_images[ball_img_idx].get_rect()
        ball_rect.left = ball_x_pos
        ball_rect.top = ball_y_pos

        # 공과 캐릭터 충돌 체크
        if character_rect.colliderect(ball_rect):
            running = False  # 충돌시 게임종료
            break  # 게임이 종료되면서 for문 탈출

        # 공과 무기 충돌 처리
        for weapon_idx, weapon_val in enumerate(weapons):
            weapon_x_pos = weapon_val[0]
            weapon_y_pos = weapon_val[1]

            # 무기 rect 정보 가져오기
            weapon_rect = weapon.get_rect()
            weapon_rect.left = weapon_x_pos
            weapon_rect.top = weapon_y_pos

            # 공과 무기 충돌 체크
            if weapon_rect.colliderect(ball_rect):
                weapon_to_remove = weapon_idx  # 해당무기를 없애기 위한 값 설정/ ❔여기서 왜 인덱스 값을 넣어주나?
                ball_to_remove = ball_idx  # 해당공을 없애기 위한 값 설정/ ❔ball_img_idx를 가져와야하는거 아닌가?
                
                # 가장 작은 공이 아니라면 충돌 시 다음 단계의 공으로 나눠주기
                if ball_img_idx < 3:
                    # 현재의 공크기 정보 가져옴
                    ball_width = ball_rect.size[0]
                    ball_height = ball_rect.size[1]

                    # 나눠진 공 정보
                    small_ball_rect = ball_images[ball_img_idx +1].get_rect()  # 현재공크기보다 한단계 더 작아진 공크기의 rect정보를 가져옴
                    small_ball_width = small_ball_rect.size[0]
                    small_ball_height = small_ball_rect.size[1]

                    # 왼쪽으로 튕겨나가는 작은 공
                    balls.append({
                        "pos_x" : ball_x_pos + (ball_width/2) - (small_ball_width/2),
                        "pos_y" : ball_y_pos + (ball_height/2) - (small_ball_height/2), 
                        "img_idx" : ball_img_idx +1,
                        "to_x": -3,  # 공의 x축 이동방향 (-3이면 왼쪽으로, 3이면 오른쪽으로 이동)
                        "to_y": -6, # 공의 y축 이동방향
                        "init_spd_y" : ball_speed_y[ball_img_idx +1]  # y축으로의 공의 최초속도
                    })

                    # 오른쪽으로 튕겨나가는 작은 공
                    balls.append({
                        "pos_x" : ball_x_pos + (ball_width/2) - (small_ball_width/2),
                        "pos_y" : ball_y_pos + (ball_height/2) - (small_ball_height/2), 
                        "img_idx" : ball_img_idx +1,
                        "to_x": 3,  # 공의 x축 이동방향 (-3이면 왼쪽으로, 3이면 오른쪽으로 이동)
                        "to_y": -6, # 공의 y축 이동방향
                        "init_spd_y" : ball_speed_y[ball_img_idx +1]  # y축으로의 공의 최초속도
                    })  
                break  # 안쪽 for문 탈출

        else:  #🔹 안쪽 for문 조건이 맞지 않으면
            continue  # 게임 계속진행 (바깥쪽 for문 계속 수행)
        break  # 안쪽 for문에서 break를 만나면 여기로 진입해 바깥쪽 for문도 탈출

    # for 바깥조건:
    #     바깥동작
    #     for 안쪽조건:
    #         안쪽동작
    #         if 충돌하면:
    #             break
    #     else:
    #         continue
    #     break

    # 충돌된 공 or 무기 없애기
    if ball_to_remove > -1:  # ball_to_remove 값은 0,1,2,3 중 하나 (공 종류 4개)
        del balls[ball_to_remove]  # 해당 인덱스의 공을 없앤다
        ball_to_remove = -1

    if weapon_to_remove > -1:  # weapon_to_remove 값은 0 하나 (무기 종류 1개)
        del weapons[weapon_to_remove]  # 무기를 없앤다
        weapon_to_remove = -1

    # 모든 공을 없앤 경우 게임 종료 (성공)
    if len(balls) == 0:
        game_result = "Mission Complete"
        running = False


    ## 5. 화면에 그리기 (코드 순서대로 그려짐)
    screen.blit(background, (0,0))  # 배경 그리기

    for weapon_x_pos, weapon_y_pos in weapons:  # weapons가 여러번 들어가기 때문에 반복문 사용
        screen.blit(weapon, (weapon_x_pos,weapon_y_pos))

    for idx, val in enumerate(balls):
        ball_x_pos = val["pos_x"]
        ball_y_pos = val["pos_y"]
        ball_img_idx = val["img_idx"]
        screen.blit(ball_images[ball_img_idx], (ball_x_pos,ball_y_pos))  # 공 그리기

    screen.blit(stage, (0,screen_height-stage_height))  # 스테이지 그리기
    screen.blit(character, (character_x_pos,character_y_pos))  # 캐릭터 그리기

    # 타이머 만들기
    elapsed_time = (pygame.time.get_ticks() - start_tics) / 1000  # 경과시간 계산 (ms -> s)
    timer = game_font.render("Time : {}".format(int(total_time-elapsed_time)), True, (255,255,255))
    screen.blit(timer, (10,10))  # 타이머 그리기

    # 시간초과하면 게임종료되는 코드 작성
    if total_time - elapsed_time <= 0:
        game_result = "Time Over"
        running = False

    # 게임화면 업데이트
    pygame.display.update()

# 게임 오버 메세지 출력
msg = game_font.render(game_result, True, (255,0,0))  # 빨간색
msg_rect = msg.get_rect(center = (int(screen_width/2), int(screen_height/2)))

screen.blit(msg, msg_rect)

pygame.display.update()  # 메세지가 나오려면 화면 업데이트 필요
pygame.time.delay(2000)  # 게임종료 전 2초 대기

# pygame 종료
pygame.quit()

#############################################################################################