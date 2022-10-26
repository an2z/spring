# 21.11.26

# >> 구름레벨 큐 <<
# https://level.goorm.io/exam/43246/%ED%81%90-queue/quiz/1

# 문제
# 큐는 먼저 집어 넣은 데이터가 먼저 나오는 FIFO구조로 저장하는 형식을 말한다
# EnQueue(입력), DeQueue(출력)을 통해 자료 입출력이 구현된다.
# 큐가 꽉 차서 더 이상 자료를 넣을 수 없는 경우를 overflow,
# 큐가 비어있어 자료를 꺼낼 수 없는 경우를 underflow라고 한다.
# 아래 입/출력 조건에 맞게 프로그램을 작성하라

# 조건
# 큐는 최대 10개 자료가 들어갈 수 있고, 10개를 넘으면 overflow를 출력
# 큐가 비어있는 상태에서 Dequeue를 실행하면 underflow를 출력

# 입력
# 첫 줄에 입출력의 횟수를 입력한다
# 다음 줄 부터 입력(e 또는 E) 또는 출력 여부 (d 또는 D)를 입력하고,
# 입력일 경우 자료 내용까지 입력한다.
# e(E) 또는 d(D) 이외의 입력이 들어올 경우 큐의 최종 상태를 출력하며 종료됨

# 출력
# 입출력 횟수가 끝나거나, 중간에 종료되면 큐의 최종 상태를 출력한다.


# answer ---------------------------------------------------------------------------------
count = int(input())  # 입력횟수
data = []
state = True

for i in range(count):
    if state == True:
        select_que = str(input())  # 입/출력 여부

        if select_que == 'e' or select_que == 'E':
            if len(data) > 9:
                print('overflow')
                state = False
            else:
                data_in = int(input())
                data.append(data_in)
        elif select_que == 'd' or select_que == 'D':
            if len(data) < 1:
                print('underflow')
                state = False
            else:
                data.pop(0)
        else:
            state = False
    else:
        break
for f in data:
    print(f, end='')