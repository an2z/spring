# 21.11.30

# >> 프로그래머스 두개 뽑아서 더하기 <<
# https://programmers.co.kr/learn/courses/30/lessons/68644

# 문제
# 정수 배열 numbers에서 서로 다른 인덱스에 있는 두개의 수를 뽑아 더해서 만들 수 있는
# 모든 수를 배열에 오름차순으로 담아 return하도록 solution함수를 완성하라


# answer -----------------------------------------------------------------------------
def solution(numbers):
  c = len(numbers)
  result = []

  for i in range(c):
    for j in range(i+1, c):
        sum = numbers[i] + numbers[j]
        if sum not in result:
          result.append(sum)
          result = sorted(result)
  return result

# test
# print(solution([2,1,3,4,1]))
# print(solution([5,0,2,7]))