# 21.12.03

# >> 프로그래머스 숫자 문자열과 영단어 <<
# https://programmers.co.kr/learn/courses/30/lessons/81301

# 문제
# 숫자의 일부 자릿수가 영단어로 바뀌어졌거나,
# 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어진다.
# s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성하라

# 조건
# s의 길이는 1이상 50이하
# s가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않는다.

# 각 숫자에 대응되는 영단어
# 0 zero/ 1 one/ 2 two/ 3 three/ 4 four/ 5 five
# 6 six/ 7 seven/ 8 eight/ 9 nine 


# my answer
# 방법1(성공)
def solution(s):
    s = s.replace("zero","0")
    s = s.replace("one","1")
    s = s.replace("two","2")
    s = s.replace("three","3")
    s = s.replace("four","4")
    s = s.replace("five","5")
    s = s.replace("six","6")
    s = s.replace("seven","7")
    s = s.replace("eight","8")
    s = s.replace("nine","9") 
    return s


# 방법2(성공)
def solution(s):
    num = ['zero','one','two','three','four','five','six','seven','eight','nine']
    answer = ''

    for i in range(len(num)):  # len(num)=9
        s = s.replace(num[i], str(i))
    return s


# test
# print(solution("one4seveneight"))
# print(solution("23four5six7"))
# print(solution("2three45sixseven"))
# print(solution("123"))
# print(solution("111"))

# -------------------------------------------------------------------------------------

# >> 프로그래머스 시저암호 <<
# https://programmers.co.kr/learn/courses/30/lessons/12926

# 문제
# 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서
# 다른 알파벳으로 바꾸는 암호화 방식을 시저암호라고 한다. 
# 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성하라

# 조건
# 공백은 아무리 밀어도 공백이다
# s는 알파벳 소문자, 대문자. 공백으로만 이루어진다.
# s의 길이는 8000이하
# n은 1 이상, 25이하인 자연수


# my answer
# 시도1(실패)
# def solution(s,n):
#     alpha = ['A','B','C','D','E','F','G','H','I','J','K','L','M',
#              'N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
#     answer = ''

#     for i,k in enumerate(alpha): # i=index,k=알파벳
#         # print(i,k)
#         if i+n < len(alpha):
#             if k in s:  # 대문자일때
#                 answer += alpha[i+n]
#             elif k.lower() in s:  # 소문자일때
#                 answer += alpha[i+n].lower()

#         elif i+n >= len(alpha):
#             if k in s:
#                 answer += alpha[0+(n-(len(alpha)-i))]
#             elif k.lower() in s:
#                 answer += alpha[0+(n-(len(alpha)-i))].lower()

#     return answer


# good answer (정답)
def solution(s, n):
    ans = ''
    for i in s:
        x = ord(i)
        if ord('A') <= x <= ord('Z'):
            if x+n > ord('Z'):
                x+=n-26
            else:
                x+=n
        elif ord('a') <= x <= ord('z'):    
            if x+n > ord('z'):
                x+=n-26
            else:
                x+=n
        ans += chr(x)
    return ans


# test
# print(solution("AB",1))
# print(solution("z",1))
# print(solution("aBz",4))
# print(solution("aBd",4))
# print(solution("aCB",4))
# print(solution("ZZZ",4))