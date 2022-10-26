# 📌추억의 오락실 게임 만들기
import pygame  # 파이썬 라이브러리인 pygame을 이용

pygame.init()  # 초기화 (반드시 필요)


# 화면 크기 설정
screen_width = 480    # 가로크기
screen_height = 640   # 세로크기
screen = pygame.display.set_mode((screen_width, screen_height))   # 화면 크기설정한 것을 변수로 받아옴


# 화면 타이틀 설정
pygame.display.set_caption("Nado Game")   # 게임이름 설정


# FPS
clock = pygame.time.Clock()


# 배경 이미지 불러오기
background = pygame.image.load("C:/Users/anneu/Desktop/study/clonecoding/오락실게임/pygame_basic/background.png")


# 캐릭터(스프라이트) 만들기
character = pygame.image.load("C:/Users/anneu/Desktop/study/clonecoding/오락실게임/pygame_basic/character.png")
# 캐릭터를 움직이기 위한 코드작성
character_size = character.get_rect().size   # 캐릭터이미지의 크기를 가져옴
character_width = character_size[0]   # 캐릭터의 가로크기
character_height = character_size[1]   # 캐릭터의 세로크기
character_x_pos = (screen_width/2) - (character_width/2) # 캐릭터의 가로위치(x position)가 화면 가로크기의 절반에 위치하도록 지정
character_y_pos = screen_height - character_height   # 캐릭터의 세로위치(y position)가 화면 세로크기 가장 아래에 위치하도록 지정


# 캐릭터가 이동할 좌표
to_x = 0
to_y = 0


# 캐릭터 이동 속도
character_speed = 0.6


# 적(enemy) 캐릭터 만들기
enemy = pygame.image.load("C:/Users/anneu/Desktop/study/clonecoding/오락실게임/pygame_basic/enemy.png")
# 적캐릭터를 움직이기 위한 코드작성
enemy_size = enemy.get_rect().size   # 적캐릭터이미지의 크기를 가져옴
enemy_width = enemy_size[0]   # 적캐릭터의 가로크기
enemy_height = enemy_size[1]   # 적캐릭터의 세로크기
enemy_x_pos = (screen_width/2) - (enemy_width/2) # 적캐릭터의 가로위치(x position)가 화면 가로크기의 절반에 위치하도록 지정
enemy_y_pos = (screen_height/2) - (enemy_height/2)   # 적캐릭터의 세로위치(y position)가 화면 세로크기의 절반에 위치하도록 지정


# 🔹폰트 설정
game_font = pygame.font.Font(None, 40)  # 게임폰트 객체 생성 (폰트,크기)/ ❔여기서 객체와 변수의 차이는 무엇?


# 🔹게임 총시간
total_time = 10


# 🔹게임 시작시간
start_ticks = pygame.time.get_ticks()   # 현재 tick(뜻:똑딱거리다)을 가져옴


# 이벤트 루프
# 프로그램이 종료되지 않도록 동작을 계속 검사하는 이벤트루프를 만들어줘야 한다
running = True   # 게임이 진행중인가를 확인하는 변수 (True:게임 진행중을 의미)
while running:
    dt = clock.tick(60)   # 게임화면의 초당 프레임 수를 설정
    # print("fps: "+ str(clock.get_fps()))   # 현재 프레임을 출력

    # 캐릭터가 100만큼 이동 해야함
    # 10fps : 1초 동안에 10번 동작 ➡ 1번에 10만큼 이동 (10*10=100)
    # 20fps : 1초 동안에 20번 동착 ➡ 1번에 5만큼 이동 (5*20=100)
    # 프레임마다 이동하는 속도가 달라지면 안되기 때문에 어떤 조치를 취해야 함

    for event in pygame.event.get():    # pygame을 쓰기 위해서는 반드시 필요/ 어떤 이벤트가 발생하는 경우
        if event.type == pygame.QUIT:   # 여러 이벤트 중 창닫기 버튼을 누르는 이벤트가 발생하는 경우 ➡ 게임 종료
            running = False             # False:게임 진행중 아님을 의미

        if event.type == pygame.KEYDOWN:      # 키가 눌리는 이벤트 발생 (KEYDOWN:키가 눌린상태)
            if event.key == pygame.K_LEFT:    # 왼쪽키가 눌림 ➡ 캐릭터가 왼쪽으로 이동
                to_x -= character_speed
            elif event.key == pygame.K_RIGHT: # 오른쪽키가 눌림 ➡ 캐릭터가 오른쪽으로 이동
                to_x += character_speed
            elif event.key == pygame.K_UP:    # 위키가 눌림 ➡ 캐릭터가 위로 이동
                to_y -= character_speed    # 왜 up이 -지?
            elif event.key == pygame.K_DOWN:  # 아래키가 눌림 ➡ 캐릭터가 아래로 이동
                to_y += character_speed

        if event.type == pygame.KEYUP:        # 키가 떼지는 이벤트 발생 (KEYUP:키가 눌리지 않은상태)
            if event.key == pygame.K_LEFT or event.key  == pygame.K_RIGHT:  # 왼쪽이나 아래키를 떼면
                to_x = 0   # 캐릭터 좌우이동 없음
            elif event.key == pygame.K_UP or event.key  == pygame.K_DOWN:   # 위나 아래키를 떼면
                to_y = 0   # 캐릭터 상하이동 없음

    # 실제 캐릭터의 위치(position)
    # 방향키를 눌렀을때 좌표이동 값을 to_x,y에 담아두고, 현재 캐릭터의 위치(position)에 더해준다
    character_x_pos += to_x * dt   # 좌우 키를 누르면 캐릭터의 좌우 위치가 이동 / (* dt)를 해주는 이유: 프레임마다 캐릭터의 이동속도가 달라지는 것을 보정하기 위함
    character_y_pos += to_y * dt   # 상하 키를 누르면 캐릭터의 상하 위치가 이동

    # 캐릭터의 이동범위 지정
    # 캐릭터가 화면밖으로 나가지 못하게 하는 코드
    # 가로 경계값 처리
    if character_x_pos < 0:                                  # 캐릭터가 왼쪽 화면밖으로 나가는 경우
        character_x_pos = 0                                  # 캐릭터는 왼쪽 끝에서 멈춤
    elif character_x_pos > screen_width - character_width:   # 캐릭터가 오른쪽 화면밖으로 나가는 경우
        character_x_pos = screen_width - character_width     # 캐릭터는 오른쪽 끝에서 멈춤
    # 세로 경계값 처리
    if character_y_pos < 0:                                  # 캐릭터가 위쪽 화면밖으로 나가는 경우
        character_y_pos = 0                                  # 캐릭터는 위쪽 끝에서 멈춤
    elif character_y_pos > screen_height - character_height: # 캐릭터가 아래쪽 화면밖으로 나가는 경우
        character_y_pos = screen_height - character_height   # 캐릭터는 아래쪽 끝에서 멈춤

    # 충돌 처리를 위한 rect정보 업데이트
    character_rect = character.get_rect()   # rect = rectangle(사각형)/ 실제 캐릭터의 사각형 정보를 가져옴?
    character_rect.left = character_x_pos   # 캐릭터 기준 왼쪽  
    character_rect.top = character_y_pos    # 캐릭터 기준 위쪽

    enemy_rect = enemy.get_rect() 
    enemy_rect.left = enemy_x_pos
    enemy_rect.top = enemy_y_pos

    # 충돌 체크
    # colliderect():사각형 기준으로 충돌이 있는지 확인하는 함수
    if character_rect.colliderect(enemy_rect):  # 캐릭터의 사각형과 적의 사각형과 충돌이 있는 경우
        print('충돌했어요')
        running = False  # 충돌하면 게임 종료

    # 배경 그리기
    screen.blit(background, (0,0))    # blit():실제로 그려주는 함수/ (그릴변수, 그리는 위치좌표)

    # 캐릭터 그리기
    screen.blit(character, (character_x_pos,character_y_pos))  # 내캐릭터 그리기
    screen.blit(enemy, (enemy_x_pos,enemy_y_pos))              # 적캐릭터 그리기
    
    # 🔹타이머 만들기
    # 경과시간 계산
    elapsed_time = (pygame.time.get_ticks() - start_ticks) / 1000  # 경과시간(ms)을 1000으로 나눠 초단위(s)로 표시

    # render(): 실제로 글자를 그려주는 함수
    # (출력할 글자, True, 글자색상)
    timer = game_font.render(str(int(total_time-elapsed_time)), True, (255,255,255))
    screen.blit(timer, (10,10))   # 타이머 그리기

    # 🔹시간초과하면 게임종료되는 코드 작성
    if total_time - elapsed_time <= 0:
        print('타임아웃')
        running = False
    # 종료 전 잠시 대기
    pygame.time.delay(2000)  # 2초 정도 대기(2000ms)
    

    # 게임화면 업데이트
    pygame.display.update()  # 게임화면 다시 그리기 ➡ while 반복문을 계속 돌면서 화면을 새로 그려준다


# pygame 종료
# running = False가 되면 게임을 종료한다
pygame.quit()