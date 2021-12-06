# 21.11.25

# >> 구름레벨 스택 <<
# https://level.goorm.io/exam/43218/%EC%8A%A4%ED%83%9D-stack/quiz/1

# 문제
# push와 pop으로 스택에 자료를 넣고 빼는 작업을 진행하고,
# 스택의 마지막 상태를 출력하는 프로그램 작성하라

# 조건
# 스택은 최대 10개 자료가 들어갈 수 있고, 10개를 넘으면 overflow를 출력
# 스택이 비어있는 상태에서 pop을 실행하면 underflow를 출력

# 입력
# 첫 줄에 데이터 입력 횟수가 입력된다.
# 다음 줄 부터 0인 경우 push , 1인 경우 pop이 일어난다.
# 0 또는 1 이외의 것을 입력하면 프로그램 종료
# push인 경우에만 자료의 내용을 다음줄에 입력한다.


# answer ----------------------------------------------------------------
a = int(input())  # 횟수
b = []  # 백업
for i in range(a):
    s = int(input())  # 선택
    if s == 0:
        if len(b) < 10:
            n = int(input())  # 입력
            b.append(n)
        else:
            print('overflow')
    elif s == 1:
        if len(b) > 0:
            b.pop(-1)
        else:
            print('underflow')
    else:
        break
for j in b:
    print(j, end=' ')
