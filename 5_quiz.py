# >> 초보자를 위한 파이썬 300제 (41 ~ 50) <<

# 041
# 다음과 같은 문자열이 있을 때 이를 대문자 BTC_KRW로 변경하세요.
ticker = "btc_krw"

print(ticker.upper())  # upper(): 모든 문자 대문자로 변환


# 042
# 다음과 같은 문자열이 있을 때 이를 소문자 btc_krw로 변경하세요.
ticker = "BTC_KRW"

print(ticker.lower())  # lower(): 모든 문자 소문자로 변환


# 043
# 문자열 'hello'가 있을 때 이를 'Hello'로 변경해보세요.
text = 'hello'
text = text.capitalize()  # capitalize(): 맨앞글자만 대문자로 변환
print(text)


#⭐044
# 파일 이름이 문자열로 저장되어 있을 때
# endswith 메서드를 사용해서 파일 이름이 'xlsx'로 끝나는지 확인해보세요.
file_name = "보고서.xlsx"
result = file_name.endswith('xlsx')

print(result)

# endswith('search_str'): 어떤 문자열에서 특정 문자열(search_str)로 끝나는지를 확인
# 결과를 true/false로 반환해준다.


#⭐045
# 파일 이름이 문자열로 저장되어 있을 때
# endswith 메서드를 사용해서 파일 이름이 'xlsx' 또는 'xls'로 끝나는지 확인해보세요.\
file_name = "보고서.xlsx"
result = file_name.endswith(('xlsx', 'xls'))

print(result)


# 046
# 파일 이름이 문자열로 저장되어 있을 때
# startswith 메서드를 사용해서 파일 이름이 '2020'로 시작하는지 확인해보세요.
file_name = "2020_보고서.xlsx"
result = file_name.startswith('2020')

print(result)

# startswith('search_str'): 어떤 문자열에서 특정문자열(search_str)로 시작되는지를 확인
# 결과를 true/false로 반환해준다.


# 047
# 다음과 같은 문자열이 있을 때 공백을 기준으로 문자열을 나눠보세요.
a = "hello world"
result = a.split(' ')
print(result)

# 정답
# a.split()
# 문자열 spilt() 메서드는 기본값으로 공백을 기준으로 분리해준다.


# 048
# 다음과 같이 문자열이 있을 때 btc와 krw로 나눠보세요.
ticker = "btc_krw"

result = ticker.split('_')
print(result)


# 049
# 다음과 같이 날짜를 표현하는 문자열이 있을 때 연도, 월, 일로 나눠보세요.
date = "2020-05-01"
year = date.split('-')[0]
month = date.split('-')[1]
day = date.split('-')[2]

print(year+'년', month+'월', day+'일')


# 050
# 문자열의 오른쪽에 공백이 있을 때 이를 제거해보세요.
data = "039490     "
print(data.rstrip())

# rstrip(): 문자열 오른쪽 공백을 제거                   
# lstrip(): 문자열 왼쪽 공백을 제거
# strip(): 문자열 좌우 공백을 제거
