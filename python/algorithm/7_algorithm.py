# 21.12.01

# >> 프로그래머스 실패율 <<
# https://programmers.co.kr/learn/courses/30/lessons/42889

# 문제
# 실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 유저 / 스테이지에 도달한 유저
# 전체 스테이지의 개수 N,
# 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수 로 주어질때
# 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return하는 solution함수를 완성해라


# answer ---------------------------------------------------------------------------------------------------------------
def solution(N, stages):  # N=전체 스테이지이 개수 / stage=사용자의 현재 스테이지
    answer = []
    fail_rate = {}  # 실패율
    total_user = len(stages)  # 스테이지에 도달한 유저

    for i in range(1, N+1):
        if total_user != 0:
            stage_user = stages.count(i) # 해당 스테이지를 클리어하지 못한 유저
            fail_rate[i] = stage_user / total_user
            total_user -= stage_user
        else:
            fail_rate[i] == 0
            
    fail_rate = sorted(fail_rate.items(), key=lambda x:x[1],reverse=True)
    
    for k in fail_rate:
        answer.append(k[0])  # 스테이지의 번호만 가져오기 위해 k[0]
        # print(k)

    return answer

# test
print(solution(5, [2, 1, 2, 6, 2, 4, 3, 3]))


# another answer -------------------------------------------------------------------------------------------------------
def solution(N, stages):
    answer = [0 for i in range(N)]
    fail = [0.0 for i in range(N)]
    stagePeople = len(stages)

    for i in stages:
        if i != N + 1:
            answer[i - 1] += 1

    for i in range(N):
        if stagePeople == 0:
            fail[i] = 0
            continue
            
        fail[i] = float(answer[i]) / stagePeople
        stagePeople -= answer[i]
        
    answer = [i + 1 for i in range(N)]

    for i in range(N-1):
        for k in range(N - i -1):
            if (fail[k] < fail[k + 1]):
                fail[k], fail[k+1] = fail[k + 1], fail[k]
                answer[k], answer[k+1] = answer[k + 1], answer[k]
                
    return answer