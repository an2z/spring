# 📌똥피하기 게임

import pygame  # 파이썬 라이브러리인 pygame을 이용
import random  # 똥의 위치를 랜덤으로 하기 위함

#############################################################################################

## 기본 초기화 (반드시 해야 하는 것들)

pygame.init()

# 화면 크기 설정
screen_width = 480    # 가로크기
screen_height = 640   # 세로크기
screen = pygame.display.set_mode((screen_width, screen_height))  # 지정해준 크기로 화면 크기설정

# 화면 타이틀 설정
pygame.display.set_caption("똥 피하기")

# FPS
clock = pygame.time.Clock()

#############################################################################################

## 1. 사용자 게임 초기화 (배경화면, 게임이미지, 좌표, 속도, 폰트 등)
# 배경 만들기
background = pygame.image.load('C:\\Users\\anneu\\Desktop\\study\\clonecoding\\오락실게임\\pygame_basic\\background.png')

# 캐릭터(dog) 만들기
dog = pygame.image.load('C:\\Users\\anneu\\Desktop\\study\\clonecoding\\오락실게임\\pygame_basic\\dog.png')
dog_size = dog.get_rect().size
dog_width = dog.get_rect().size[0]
dog_height = dog.get_rect().size[1]
dog_x_pos = (screen_width/2) - (dog_width/2)
dog_y_pos = screen_height - dog_height

to_x = 0  # 캐릭터 이동
dog_speed = 10  # 캐릭터 이동속도

# 똥 만들기
ddong = pygame.image.load('C:\\Users\\anneu\\Desktop\\study\\clonecoding\\오락실게임\\pygame_basic\\ddong.png')
ddong_size = ddong.get_rect().size
ddong_width = ddong.get_rect().size[0]
ddong_height = ddong.get_rect().size[1]
ddong_x_pos = random.randint(0, screen_width-ddong_width)  # 똥의 위치는 랜덤/ randint(): 시작값과 끝값을 모두 포함하는 값 중 랜덤값을 출력
ddong_y_pos = 0

ddong_speed = 10  # 똥 이동속도


running = True
while running:
    dt = clock.tick(60)
    
    ## 2. 이벤트 처리 (키보드, 마우스 등)
    for event in pygame.event.get():
        # 마우스
        if event.type == pygame.QUIT:
            running = False

        # 키보드
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_LEFT:
                to_x -= dog_speed
            elif event.key == pygame.K_RIGHT:
                to_x += dog_speed

        if event.type == pygame.KEYUP:
            if event.type == pygame.K_LEFT or pygame.K_RIGHT:
                to_x = 0


    ## 3. 게임 캐릭터 위치 정의
    dog_x_pos += to_x  # 방향키에 따른 캐릭터 위치 변화
    ddong_y_pos += ddong_speed  # 똥의 위치 변화

    if dog_x_pos < 0:  # 캐릭터의 이동범위 지정 (화면밖으로 나가지 않도록)
        dog_x_pos = 0
    elif dog_x_pos > (screen_width - dog_width):
        dog_x_pos = (screen_width - dog_width)

    if ddong_y_pos > screen_height:  # 똥의 이동범위 지정
        ddong_y_pos = 0
        ddong_x_pos = random.randint(0, screen_width-ddong_width)
    

    ## 4. 충돌 처리
    dog_rect = dog.get_rect()  # 캐릭터 rect정보 가져오기
    dog_rect.left = dog_x_pos
    dog_rect.top = dog_y_pos

    ddong_rect = ddong.get_rect()  # 똥 rect정보 가져요기
    ddong_rect.left = ddong_x_pos
    ddong_rect.top = ddong_y_pos

    if dog_rect.colliderect(ddong_rect):  # 캐릭터와 똥과 충돌하면 게임종료
        print('충돌했어요')
        running = False


    ## 5. 화면에 그리기
    screen.blit(background, (0,0))
    screen.blit(dog, (dog_x_pos,dog_y_pos))

    screen.blit(ddong, (ddong_x_pos,ddong_y_pos))
    

    # 게임화면 업데이트
    pygame.display.update()


## 게임 종료
pygame.quit()

#############################################################################################
