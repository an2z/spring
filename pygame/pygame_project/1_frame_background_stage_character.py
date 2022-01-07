# 📌ppang 게임

import pygame  # 파이썬 라이브러리인 pygame을 이용
import os  # 파일위치를 반환해주기 위해 필요

#############################################################################################

## 기본 초기화 (반드시 해야 하는 것들)

pygame.init()

# 🔹화면 크기 설정
screen_width = 640    # 가로크기
screen_height = 480   # 세로크기
screen = pygame.display.set_mode((screen_width, screen_height))  # 지정해준 크기로 화면 크기설정

# 🔹화면 타이틀 설정
pygame.display.set_caption("ppang game")

# FPS
clock = pygame.time.Clock()

#############################################################################################

## 1. 사용자 게임 초기화 (배경화면, 게임이미지, 좌표, 속도, 폰트 등)

# 🔹이미지 경로 지정
current_path = os.path.dirname(__file__)  # 현재파일 위치 반환
image_path = os.path.join(current_path, "images")  # images 폴더 위치 반환

# 🔹배경 만들기
background = pygame.image.load(os.path.join(image_path, "background.png"))

# 🔹스테이지 만들기
stage = pygame.image.load(os.path.join(image_path, "stage.png"))
stage_size = stage.get_rect().size
stage_height = stage_size[1]  # 스테이지의 높이 위에 캐릭터를 두기 위함

# 🔹캐릭터 만들기
character = pygame.image.load(os.path.join(image_path, "character.png"))
character_size = character.get_rect().size
character_width = character_size[0]
character_height = character_size[1]
character_x_pos = (screen_width/2) - (character_width/2)
character_y_pos = screen_height - stage_height - character_height


running = True
while running:
    dt = clock.tick(30)
    
    ## 2. 이벤트 처리 (키보드, 마우스 등)
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False


    ## 3. 게임 캐릭터 위치 정의


    ## 4. 충돌 처리
    
    ## 🔹5. 화면에 그리기
    screen.blit(background, (0,0))  # 배경 그리기
    screen.blit(stage, (0,screen_height-stage_height))  # 스테이지 그리기
    screen.blit(character, (character_x_pos,character_y_pos))  # 캐릭터 그리기
    
    # 게임화면 업데이트
    pygame.display.update()

# game 종료
pygame.quit()

#############################################################################################