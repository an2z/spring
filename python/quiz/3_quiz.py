# >> 초보자를 위한 파이썬 300제 (21 ~ 30) <<

# 021
# letters가 바인딩하는 문자열에서 첫번째와 세번째 문자를 출력하세요.
letters = 'python'
print(letters[0],letters[2])


# 022
# 자동차 번호가 다음과 같을 때 뒤에 4자리만 출력하세요.
license_plate = "24가 2210"
print(license_plate[4:])

# 정답
# print(license_plate[-4:])  
# 음수 값은 문자열의 뒤에서부터의 인덱싱 또는 슬라이싱을 의미


#⭐023
# 아래의 문자열에서 '홀' 만 출력하세요.
string = "홀짝홀짝홀짝"
print(string[0]+string[2]+string[4])

# 정답
# print(string[::2])
# 슬라이싱 [시작인덱스:끝인덱스:오프셋]을 지정할 수 있음


#⭐024
# 문자열을 거꾸로 뒤집어 출력하세요.
string = "PYTHON"
string_r = ''.join(reversed(string))
print(string_r)

# 정답
# print(string[::-1])
# 슬라이싱 [start:stop:step]으로, [::-1]은 반대방향으로부터 데이터를 자를수 있다


# 025
# 아래의 전화번호에서 하이푼 ('-')을 제거하고 출력하세요.
phone_number = "010-1111-2222"
result = phone_number.replace("-"," ")
print(result)


# 026
# 25번 문제의 전화번호를 아래와 같이 모두 붙여 출력하세요.
result2 = phone_number.replace("-","")
print(result2)


# 027
# url 에 저장된 웹 페이지 주소에서 도메인을 출력하세요.
url = "http://sharebook.kr"
domain = url.split('//')[1].split('.')[0]
print(domain)

# split('//') >> ['http:', 'sharebook.kr']
# split('//')[1] >> sharebook.kr
# split('//')[1].split('.') >> ['sharebook', 'kr']
# split('//')[1].split('.')[0] >> sharebook


#⭐028
# 아래 코드의 실행 결과를 예상해보세요.
# lang = 'python'
# lang[0] = 'P'
# print(lang)  # 뭐지........?

# 정답
# 에러가 난다. 
# 이유는 문자열은 수정할 수 없기때문
# 에러를 보면 문자열이 할당메서드를 지원하지 않음을 알수 있다


#⭐029
# 아래 문자열에서 소문자 'a'를 대문자 'A'로 변경하세요.
string = 'abcdfe2a354a32a'
string_capital = string.upper()  # upper:대문자로 변환/lower:소문자로 변환
print(string_capital)

# capitalize() : 앞글자만 대문자로 변환
# title()


#⭐030
# 아래 코드의 실행 결과를 예상해보세요.
string = 'abcd'
string.replace('b', 'B')
print(string)  # aBcd 출력 >> 틀림!

# 정답
# abcd가 그대로 출력된다
# 문자열은 변경할 수 없는 자료형이기 때문!!

