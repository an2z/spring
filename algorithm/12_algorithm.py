# 21.12.08

# >> 프로그래머스 이상한문자 만들기 <<
# https://programmers.co.kr/learn/courses/30/lessons/12930

# 문제
# 문자열 s는 한개 이상의 단어로 구성되어 있다.
# 각 단어는 하나 이상의 공백문자로 구분되어 있다.
# 각 단어의 짝수번째 알파벳은 대문자로,
# 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하라

# 조건
# 문자열 전체의 짝/홀수 인덱스가 아니라 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야 함
# 첫번재 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 함


# answer ----------------------------------------------------------------------------------
# 시도1(실패)
# def solution(s):
    # for word in s.split(' '):
    #     li = list(word)
    #     for i in range(len(li)):
    #         if i % 2 == 0:
    #             even_num = li[i].upper()
    #             li[i].replace(li[i], even_num)
    #         odd_num = li[i].lower()
    #         li[i].replace(li[i], odd_num)
    #     print(li)

# 시도2(성공)
def solution(s):
    answer = ''
    for word in s.split(' '):
        new_word = ''
        for i in range(len(word)):
            if i % 2 == 0 :  # 홀수일때
                new_word += word[i].upper()
            elif i % 2 != 0 :  # 짝수일때
                new_word += word[i].lower()
        answer = answer + new_word + ' '
    return list(answer[:-1])  # 마지막 공백을 제거

# another answer --------------------------------------------------------------------------
# 대준님 답안
def solution(s):
    s_split_list = s.split(" ")
    li = []

    for i in s_split_list:
        newWord = ""

        for count, word in enumerate(i):
            newWord += word.upper() if count % 2 == 0 else word.lower()

        li.append(newWord)
    
    return " ".join(li)


# test
# print(solution("try hello world"))
# print(solution('haha   '))