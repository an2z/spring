# 21.12.07

# >> 프로그래머스 하샤드 수 <<
# https://programmers.co.kr/learn/courses/30/lessons/12947

# 문제
# 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 한다.
# 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수 solution을 완성하라

# 조건
# x는 1 이상, 10000 이하인 정수

# 입출력 예
# arr | return
# 10  | true
# 12  | true
# 11  | false
# 12  | false


# my answer ------------------------------------------------------------------------------------------
# 방법1
def solution(x):

    digit = list(map(int,str(x)))
    sum_digit = sum(digit)

    if x % sum_digit == 0:
        return True
    
    return False


# 방법2
def solution(x):
    digit = []
    for i in str(x):
        digit.append(int(i))
    
    if x % sum(digit) == 0:
        return True
    return False


# test
# print(solution(10))
# print(solution(12))
# print(solution(11))
# print(solution(13))