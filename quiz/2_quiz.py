# >> 초보자를 위한 파이썬 300제 (11 ~ 20) <<

# 011
# 삼성전자라는 변수로 50,000원을 바인딩해보세요.
# 삼성전자 주식 10주를 보유하고 있을 때 총 평가금액을 출력하세요.
삼성전자 = 50000
총평가금액 = 삼성전자 * 10
print(삼성전자)


# 012
# 다음 표는 삼성전자의 일부 투자정보입니다.
# 변수를 사용해서 시가총액, 현재가, PER 등을 바인딩해보세요.
# 바인딩? 
# 프로그램의 기본단위가 가질 수 있는 속성 중에서 일부 필요한 속성만을 선택하여 연결해주는 것을 말한다.
시가총액 = 29800000000000
현재가 = 50000
PER = 15.79

print(시가총액, type(시가총액))  # 해당 변수의 type을 같이 출력하라는 의도?
print(현재가, type(현재가))
print(PER, type(PER))


# 013
# 변수 s와 t에는 각각 문자열이 바인딩 되어있습니다.
# 두 변수를 이용하여 아래와 같이 출력해보세요.
# hello! python
s = "hello"
t = "python"

print(s+"!", t)


# 014
# 아래 코드의 실행 결과를 예상해보세요.
2 + 2 * 3  # 8


# 015
# type() 함수는 데이터 타입을 판별합니다.
# 변수 a에는 128 숫자가 바인딩돼 있어 type 함수가 int (정수)형임을 알려줍니다.
# a = 128
# print (type(a))
# <class 'int'>
# 아래 변수에 바인딩된 값의 타입을 판별해보세요.
a = "132"  # <class 'str'>

print(type(a))


# 016
# 문자열 '720'를 정수형으로 변환해보세요.
num_str = "720"
num_int = int(num_str)  # int로 변환

print(num_int, type(num_int))


# 017
# 정수 100을 문자열 '100'으로 변환해보세요.
num = 100
num_str = str(num)

print(num_str, type(num_str))


# 018
# 문자열 "15.79"를 실수(float) 타입으로 변환해보세요.
text_str = "15.79"
text_float = float(text_str)

print(text_float, type(text_float))


# 019
# year라는 변수가 문자열 타입의 연도를 바인딩하고 있습니다.
# 이를 정수로 변환한 후 최근 3년의 연도를 화면에 출력해보세요.
year = "2020"
year_int = int(year)

print(year_int-3)  # 2017
print(year_int-2)  # 2018
print(year_int-1)  # 2019


# 020
# 에이컨이 월 48,584원에 무이자 36개월의 조건으로 홈쇼핑에서 판매되고 있습니다.
# 총 금액은 계산한 후 이를 화면에 출력해보세요. (변수사용하기)
month_price = 48584
divide_price = 36
total_price = month_price * divide_price

print(total_price)