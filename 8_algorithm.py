# 21.12.02

# >> 프로그래머스 핸드폰 번호 가리기 <<-----------------------------------------------------------------------------
# https://programmers.co.kr/learn/courses/30/lessons/12948?language=python3

# 문제 
# 전화번호가 문자열 phone_number로 주어졌을 때, 
# 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *로 가린
# 문자열을 리턴하는 함수, solution을 완성하라

# 제한조건 
# s는 길이 4이상, 20이하인 문자열이다


# answer
def solution(phone_number):
    star = len(phone_number) - 4
    return ('*'*star +phone_number[-4:])

# test
# print(solution("01033334444"))



# >> 프로그래머스 신규아이디 추천 << -------------------------------------------------------------------------------
# https://programmers.co.kr/learn/courses/30/lessons/72410

# 문제
# 신규 유저가 입력한 아이디를 나타내는 new_id가 매개변수로 주어질 때,
# "네오"가 설계한 7단계의 처리 과정을 거친 후의
# 추천 아이디를 return 하도록 solution 함수를 완성해 주세요.

# 1단계: new_id의 모든 대문자를 대응되는 소문자로 치환한다
# 2단계: new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거한다
# 3단계: new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환한다
# 4단계: new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거한다
# 5단계: new_id가 빈 문자열이라면, new_id에 "a"를 대입한다
# 6단계: new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거한다
#        만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거한다
# 7단계: new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙인다


# answer
import re
# re.sub('패턴', '바꿀문자열', '바꿔줄문자열', '바꿀횟수')

def solution(new_id):     
    new_id = new_id.lower()  # 1단계    
    new_id = re.sub('[^a-zA-Z0-9-_.]', '', new_id)  # 2단계     
    new_id = re.sub('[.]{2,}', '.', new_id)  # 3단계    
    new_id = re.sub('^[.]|[.]$', '', new_id)  # 4단계
    if new_id  == '' :  # 5단계
        new_id = 'a'
    if len(new_id) >= 16 :  # 6단계
        new_id = new_id[:15]
    new_id = re.sub('[.]$', '', new_id)
    while len(new_id) <= 2 :  # 7단계
        new_id += new_id[-1]

    return new_id

# test 
# print(solution("...!@BaT#*..y.abcdefghijklm"))
# print(solution("z-+.^."))
# print(solution("=.="))
# print(solution("123_.def"))
# print(solution("abcdefghijklmn.p"))
