# 21.12.09

# >> 프로그래머스 예산 <<
# https://programmers.co.kr/learn/courses/30/lessons/12982

# 문제
# S사에서 각 부서에 필요한 물품을 지원해 주기 위해
# 부서별로 물품을 구매하는데 필요한 금액을 조사했다.
# 그러나, 전체 예산이 정해져 있기 때문에 모든 부서의 물품을 구매해 줄 수 없다.
# 그래서 최대한 많은 부서의 물품을 구매해 줄 수 있도록 하려고 한다.
# 물픔을 구매해 줄 때는 각 부서가 신청한 금액만큼을 모두 지원 해줘야 한다.
# 부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질때,
# 최대 몇개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성하라

# 조건
# d의 길이는 1이상 100이하
# 부서별 신청 금액은 1이상 100,000이하의 자연수


# my answer --------------------------------------------------------------------------------
# 시도1(시간 초과)
from itertools import combinations as comb

def solution(d, budget):
    answer = []

    # 모든부서를 다 지원할 수 있는지 없는지?
    # 모든부서 지원가능
    if sum(d) <= budget:  
        return len(d)
        
    # 모든부서 지원 불가능
    if sum(d) > budget:
        # 최대 몇개의 부서 지원 가능한지?
        for i in range(1,len(d)):  # 1,2,3,4,5,6,7,8
            comb_list = list(comb(d, len(d)-i))
            for a in comb_list:
                if sum(a) <= budget:
                    answer.append(len(a))
        return max(answer)

# another answer ---------------------------------------------------------------------------
# 대준님 풀이
def solution(d, budget):
    d.sort()
    while budget < sum(d):
        d.pop()
    return len(d)


# 건우님 풀이
def solution(d, budget):
    d.sort()
    count = 0
    sum = 0
    for i in d:
        sum += i
        if sum > budget:
            break
        elif sum == budget:
            count += 1
            break
        count += 1
    return count 


# 용찬님 풀이
def solution(d, budget):
    s = sorted(d)
    temp = []
    for i in range(len(s)):
        if sum(temp) < budget:
            temp.append(s[i])

    if sum(temp) > budget:
        temp = temp[:-1]

    return len(temp)


# test
# print(solution([1,3,2,5,4], 9))
# print(solution([2,2,3,3], 10))
