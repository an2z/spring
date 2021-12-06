# 21.11.23

# >> 백준 1712번 손익분기점 <<
# https://www.acmicpc.net/problem/1712

# 고정비용 : A만원
# 노트북 생산에 드는 가변 비용 : B만원*n대
# n대의 노트북 생산 총 비용 : A+(B*n) 만원
# 노트북 가격 : C만원
# 손익분기점 : 판매비용 >= 고정비용+가변비용, 이익이 발생하는 지점


# my answer ------------------------------------------------------------
# 시도1(실패)
# n = 0
# while True:
#     n += 1
#     if C*n > A + B*n:
#         print(n)
#         break
#     else:        
#         print('-1')
#     # break

# 시도2(실패)
# n = 0
# while True:  # 무한 loop
#     n += 1
#     if C*n > A + B*n:
#         try:
#             print(n)
#             break
#         except Exception as ex:
#             print('-1')

# 아....뭔가 예외처리를 써서 풀어야되는거 같은데 모르겠다


# 풀이 ----------------------------------------------------------------
# 손익분기점 : 판매비용 >= 고정비용+가변비용
# E = C*n - B*n - A
# E = (C-B)n대 - A
# E = 0 이 되는 경우 손익분기점
# C-B가 음수면 절대로 이익이 날 수 없음 -> 예외처리

A,B,C = map(int, input().split())  
if B >= C:
    print('-1')
else:
    print(int(A/(C-B))+1)