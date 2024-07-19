# 📌추억의 오락실 게임 만들기
import pygame  # 파이썬 라이브러리인 pygame을 이용

pygame.init()  # 초기화 (반드시 필요)


# 화면 크기 설정
screen_width = 480    # 가로크기
screen_height = 640   # 세로크기
screen = pygame.display.set_mode((screen_width, screen_height))   # 화면 크기설정한 것을 변수로 받아옴


# 화면 타이틀 설정
pygame.display.set_caption("Nado Game")   # 게임이름 설정


# 배경 이미지 불러오기
background = pygame.image.load("C:/Users/anneu/Desktop/study/clonecoding/오락실게임/pygame_basic/background.png")


# 캐릭터(스프라이트) 불러오기
character = pygame.image.load("C:/Users/anneu/Desktop/study/clonecoding/오락실게임/pygame_basic/character.png")
# 캐릭터를 움직이기 위한 코드
character_size = character.get_rect().size   # 캐릭터이미지의 크기를 가져옴
character_width = character_size[0]   # 캐릭터의 가로크기
character_height = character_size[1]   # 캐릭터의 세로크기
character_x_pos = (screen_width/2) - (character_width/2) # 캐릭터의 가로위치(x position)가 화면 가로크기의 절반에 위치하도록 지정
character_y_pos = screen_height - character_height   # 캐릭터의 세로위치(y position)가 화면 세로크기 가장 아래에 위치하도록 지정


# 🔹캐릭터가 이동할 좌표
to_x = 0
to_y = 0


# 이벤트 루프
# 프로그램이 종료되지 않도록 동작을 계속 검사하는 이벤트루프를 만들어줘야 한다
running = True   # 게임이 진행중인가를 확인하는 변수 (True:게임 진행중을 의미)
while running:   
    for event in pygame.event.get():    # pygame을 쓰기 위해서는 반드시 필요/ 어떤 이벤트가 발생하는 경우
        if event.type == pygame.QUIT:   # 여러 이벤트 중 창닫기 버튼을 누르는 이벤트가 발생하는 경우 ➡ 게임 종료
            running = False             # False:게임 진행중 아님을 의미

        # 🔹키보드 이벤트
        if event.type == pygame.KEYDOWN:      # 키가 눌리는 이벤트 발생 (KEYDOWN:키가 눌린상태)
            if event.key == pygame.K_LEFT:    # 왼쪽키가 눌림 ➡ 캐릭터가 왼쪽으로 이동
                to_x -= 1
            elif event.key == pygame.K_RIGHT: # 오른쪽키가 눌림 ➡ 캐릭터가 오른쪽으로 이동
                to_x += 1
            elif event.key == pygame.K_UP:    # 위키가 눌림 ➡ 캐릭터가 위로 이동
                to_y -= 1    # 왜 up이 -지?
            elif event.key == pygame.K_DOWN:  # 아래키가 눌림 ➡ 캐릭터가 아래로 이동
                to_y += 1

        if event.type == pygame.KEYUP:        # 키가 떼지는 이벤트 발생 (KEYUP:키가 눌리지 않은상태)
            if event.key == pygame.K_LEFT or event.key  == pygame.K_RIGHT:  # 왼쪽이나 아래키를 떼면
                to_x = 0   # 캐릭터 좌우이동 없음
            elif event.key == pygame.K_UP or event.key  == pygame.K_DOWN:   # 위나 아래키를 떼면
                to_y = 0   # 캐릭터 상하이동 없음

    # 🔹실제 캐릭터의 위치
    # 방향키를 눌렀을때 좌표이동 값을 to_x,y에 담아두고, 현재 캐릭터의 위치(position)에 더해준다
    character_x_pos += to_x   # 좌우 키를 누르면 캐릭터의 좌우 위치가 1씩 이동
    character_y_pos += to_y   # 상하 키를 누르면 캐릭터의 상하 위치가 1씩 이동

    # 🔹캐릭터의 이동범위 지정
    # 캐릭터가 화면밖으로 나가지 못하게 하는 코드
    # 가로 경계값 처리
    if character_x_pos < 0:                                 # 캐릭터가 왼쪽 화면밖으로 나가는 경우
        character_x_pos = 0                                  # 캐릭터는 왼쪽 끝에서 멈춤
    elif character_x_pos > screen_width - character_width:   # 캐릭터가 오른쪽 화면밖으로 나가는 경우
        character_x_pos = screen_width - character_width     # 캐릭터는 오른쪽 끝에서 멈춤
    # 세로 경계값 처리
    if character_y_pos < 0:                                  # 캐릭터가 위쪽 화면밖으로 나가는 경우
        character_y_pos = 0                                  # 캐릭터는 위쪽 끝에서 멈춤
    elif character_y_pos > screen_height - character_height: # 캐릭터가 아래쪽 화면밖으로 나가는 경우
        character_y_pos = screen_height - character_height   # 캐릭터는 아래쪽 끝에서 멈춤

    # 배경 그리기
    screen.blit(background, (0,0))  # blit():실제로 그려주는 함수/ (그릴변수, 그리는 위치좌표)
    # screen.fill((200,191,231))    # 배경이미지를 주는 것이 아니라 RGB값으로 색을 지정해주는 방법

    # 캐릭터 그리기
    screen.blit(character, (character_x_pos,character_y_pos))
    
    
    # 게임화면 업데이트
    pygame.display.update()    # 게임화면 다시 그리기 ➡ while 반복문을 계속 돌면서 화면을 새로 그려준다


# pygame 종료
# running = False가 되면 게임을 종료한다
pygame.quit()