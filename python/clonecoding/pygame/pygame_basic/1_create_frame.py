# 📌추억의 오락실 게임 만들기
import pygame  # 파이썬 라이브러리인 pygame을 이용

pygame.init()  # 초기화 (반드시 필요)


# 화면 크기 설정
screen_width = 480    # 가로크기
screen_height = 640   # 세로크기
screen = pygame.display.set_mode((screen_width, screen_height))   # 화면 크기설정한 것을 변수로 받아옴


# 화면 타이틀 설정
pygame.display.set_caption("Nado Game")   # 게임이름 설정


# 이벤트 루프
# 프로그램이 종료되지 않도록 동작을 계속 검사하는 이벤트루프를 만들어줘야 한다
running = True   # 게임이 진행중인가를 확인하는 변수 (True:게임 진행중을 의미)
while running:   
    for event in pygame.event.get():    # pygame을 쓰기 위해서는 반드시 필요/ 어떤 이벤트가 발생하는 경우
        if event.type == pygame.QUIT:   # 여러 이벤트 중 창닫기 버튼을 누르는 이벤트가 발생하는 경우 ➡ 게임 종료
            running = False             # False:게임 진행중 아님을 의미


# pygame 종료
# running = False가 되면 게임을 종료한다
pygame.quit()