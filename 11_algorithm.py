# 21.12.07

# >> 피보나치 수열 <<

# 문제
# 계단은 한번에 1칸 혹은 최대 2칸까지 뛸 수 있다.
# 계단이 N개가 주어질때 꼭대기까지 오를 수 있는 총 방법 수를 구하는 slution(N)을 작성하라


# answer -----------------------------------------------------------------------------------
# def fibo(N):
#     list = []
#     for i in range(N):  # i = 0,1,2,3,4,....,N
#         print(i)
#         if i < 1 :
#             list.append(1)
#         else:
#             list.append(list[i-2]+list[i-1])  # i=1일때 list[-1]+list[0]
#     print(list)
#     return list[-1]


# answer develop ---------------------------------------------------------------------------
# else구문을 쓰지 않는 방법

def fibo(N):
    list = []
    for i in range(N):  # i = 0,1,2,3,4,....,N
        # print(i)
        if i < 1 :
            list.append(1)
            continue
        list.append(list[i-2]+list[i-1])  # i=1일때 list[-1]+list[0]
    # print(list)
    return list[-1]

# test
# print(fibo(10))
# print(fibo(5))