# 21.11.29

# >> 프로그래머스 k번째수 <<
# https://programmers.co.kr/learn/courses/30/lessons/42748

# 문제
# 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려고 한다.
# [i,j,k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질때,
# commands의 모든 원소에 대해 연산을 적용하고 나온 결과를
# 배열에 담아 return하도록 solution함수를 작성하라


# my answer ----------------------------------------------------------------------------------------
def solution(array, commands):
    result = []
    for x in commands:
        i = x[0]
        j = x[1]
        k = x[2]
        sort_array = sorted(array[i-1:j])
        index_array = sort_array[k-1]
        result.append(index_array)

    return result

# test
print(solution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]]))