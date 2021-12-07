# 21.12.06

# >> 프로그래머스 소수만들기 <<
# https://programmers.co.kr/learn/courses/30/lessons/12977

# 문제
# nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때
# 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성하라

# 조건
# nums에 들어있는 숫자의 개수는 3개 이상 50개 이하
# nums의 각 원소는 1이상 1,000이하의 자연수이며, 중복된 숫자가 들어있지 않음


# my answer ----------------------------------------------------------------------------------
# 소수(prime number)란 1과 자기자신 외에는 어떠한 수로도 나누어 떨어지지 않는 수 

# from itertools import combinations as comb

# def solution(nums):
#     answer = 0
#     sum_three_nums = []

#     for three_nums in comb(nums, 3):
#         # print(three_nums)
#         sum_three_nums.append(sum(three_nums))  # 3개 합의 모든 경우의 수
#     # print(sum_three_nums)
#     for n in sum_three_nums:
#         for i in range(2,n): 
#             # print(n,i)
#             if n % i == 0 :  # 소수가 아닐 경우
#                 result = False
#                 break
#             result = True

#         if result == True:
#             answer += 1
#     return answer


# answer develop  ----------------------------------------------------------------------------
from itertools import combinations as comb
import math

def prime_num(num):  # 소수판별 함수
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:  # 소수가 아닐경우
            return False
    return True  # 소수일 경우

def solution(nums):
    answer = 0
    three_nums = list(comb(nums,3))

    for i in three_nums:
        if prime_num(sum(i)):
            answer += 1

    return answer

# test
# print(solution([1,2,3,4]))
# print(solution([1,2,7,6,4]))
