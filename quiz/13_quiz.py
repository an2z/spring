# >> 초보자를 위한 파이썬 300제 (121 ~ 130) <<

#⭐121
# 사용자로부터 문자 한 개를 입력 받고, 소문자일 경우 대문자로,
# 대문자 일 경우, 소문자로 변경해서 출력하라.
txt = input()

if txt.islower():
    print(txt.upper())
else:
    print(txt.lower())


# 122
# 점수 구간에 해당하는 학점이 아래와 같이 정의되어 있다.
# 사용자로부터 score를 입력받아 학점을 출력하라.
score = int(input('score:'))

if 81 <= score <= 100:
    print('grade is A')
elif 61 <= score <= 80:
    print('grade is B')
elif 41 <= score <= 60:
    print('grade is C')
elif 21 <= score <= 40:
    print('grade is D')
elif 0 <= score <= 20:
    print('grade is E')


#⭐123
# 사용자로부터 달러, 엔, 유로, 또는 위안 금액을 입력받은 후
# 이를 원으로 변환하는 프로그램을 작성하라.
# 각 통화별 환율은 다음과 같다.
# 사용자는 100 달러, 1000 엔, 13 유로, 100 위안과 같이 금액과 통화명 사이에
# 공백을 넣어 입력한다고 가정한다.
# money = input()
# txt = money.split()[1]

# if txt == '달러':
#     print(str(money * 1167) + '.00 원')
# elif txt == '엔':
#     print(str(money * 1.096) + '.00 원')
# elif txt == '유로':
#     print(str(money * 1268) + '.00 원')
# elif txt == '위안':
#     print(str(money * 171) + '.00 원')

# 정답
환율 = {'달러': 1167, '엔':1.096, '유로': 1268, '위안':171}
user = input('입력: ')
num, currency = user.split()
print(float(num) * 환율[currency], '원')


#⭐124
# 사용자로부터 세 개의 숫자를 입력 받은 후 가장 큰 숫자를 출력하라.
num1 = input('input number1: ')
num2 = input('input number2: ')
num3 = input('input number3: ')

if num1 >= num2 and num1 >= num3:
    print(num1)
elif num2 >= num1 and num2 >= num3:
    print(num2)
else:
    print(num3)


# 125
# 휴대폰 번호 앞자리에 따라 통신사는 아래와 같이 구분된다.
# 사용자로부터 휴대전화 번호를 입력 받고, 통신사를 출력하는 프로그램을 작성하라.
num = input('휴대전화 번호 입력: ')
phone = num.split('-')[0]

if phone == '011':
    print('당신은 SKT 사용자입니다.')
elif phone == '016':
    print('당신은 KT 사용자입니다.')
elif phone == '019':
    print('당신은 LGU 사용자입니다.')
elif phone == '010':
    print('당신은 알수없음 사용자입니다.')

# 정답
number = input("휴대전화 번호 입력: ")
num = number.split("-")[0]
if num == "011":
    com = "SKT"
elif num == "016":
    com = "KT"
elif num == "019":
    com = "LGU"
else:
    com = "알수없음"
print(f"당신은 {com} 사용자입니다.")


# 126
# 우편번호는 5자리로 구성되는데, 앞의 세자리는 구를 나타낸다.
# 예를들어, 강북구의 경우 010, 011, 012 세 자리로 시작한다.
# 사용자로 부터 5자리 우편번호를 입력받고 구를 판별하라
number = input('우편번호: ')
num = int(number[2])

if 0 <= num <= 2:
    gu = '강북구'
elif 3 <= num <= 5:
    gu = '도봉구'
elif 6 <= num <= 9:
    gu = '노원구'

print(f'{gu}')


# 127
# 주민등록번호 뒷 자리 7자리 중 첫째 자리는 성별을 나타내는데, 1, 3은 남자 2, 4는 여자를 의미한다.
# 사용자로부터 13자리의 주민등록번호를 입력 받은 후 성별 (남자, 여자)를 출력하는 프로그램을 작성하라.
num = input()
gender = int(num.split('-')[1][0])

if gender % 2 == 0:
    print('여자')
else:
    print('남자')


# 128
# 주민등록번호의 뒷 자리 7자리 중 두번째와 세번째는 지역코드를 의미한다.
# 주민 등록 번호를 입력 받은 후 출생지가 서울인지 아닌지 판단하는 코드를 작성하라
num = input('주민등록번호: ')
area_code = int(num.split('-')[1][1:3])

if 0 <= area_code <= 8:
    print('서울 입니다.')
else:
    print('서울이 아닙니다.')


#⭐129
# 주민등록번호는 13자리로 구성되는데 마지막 자리수는 주민등록번호의 유효성을 체크하는데 사용된다.
# 먼저 앞에서부터 12자리의 숫자에 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5를 차례로 곱한 뒤 
# 그 값을 전부 더한다. 연산 결과 값을 11로 나누면 나머지가 나오는데 11에서 나머지를 뺀 값이
# 주민등록번호의 마지막 번호가 된다.
num = input("주민등록번호: ")
first = int(num[0]) * 2 + int(num[1]) * 3 + int(num[2]) * 4 + int(num[3]) * 5 + int(num[4]) * 6 + \
        int(num[5]) * 7 + int(num[7]) * 8 + int(num[8]) * 9 + int(num[9]) * 2 + int(num[10])* 3 + \
        int(num[11])* 4 + int(num[12]) * 5
second = 11 - (first % 11)
third = str(second)

if num[-1] == third[-1]:
    print("유효한 주민등록번호입니다.")
else:
    print("유효하지 않은 주민등록번호입니다.")


# 130
# 아래 코드는 비트코인의 가격 정보를 딕셔너리로 가져오는 코드이다.
import requests
btc = requests.get("https://api.bithumb.com/public/ticker/").json()['data']

변동폭 = float(btc['max_price']) - float(btc['min_price'])
최고가 = float(btc['max_price'])
시가 = float(btc['opening_price'])

if (변동폭 + 시가) > 최고가:
    print('상승장')
else:
    print('하락장')