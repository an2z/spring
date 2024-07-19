# >> 초보자를 위한 파이썬 300제 (151 ~ 170) <<

# 151
# 리스트에는 네 개의 정수가 저장돼 있다. for문을 사용해서 리스트의 음수를 출력하라.
리스트 = [3, -20, -3, 44]

# 방법1
for num in 리스트:
    if num < 0 :
        print(num)

# 방법2 (리스트 컴프리헨션 사용)
result = [num for num in 리스트 if num < 0]
print(result)


# 152
# for문을 사용해서 3의 배수만을 출력하라.
리스트 = [3, 100, 23, 44]

for num in 리스트:
    if num % 3 == 0:
        print(num)


# 153
# 리스트에서 20 보다 작은 3의 배수를 출력하라
리스트 = [13, 21, 12, 14, 30, 18]

for num in 리스트:
    if (num < 20) and (num % 3 == 0):
        print(num)


# 154
# 리스트에서 세 글자 이상의 문자를 화면에 출력하라
리스트 = ["I", "study", "python", "language", "!"]

for txt in 리스트:
    if len(txt) >= 3:
        print(txt)


#⭐155
# 리스트에서 대문자만 화면에 출력하라
리스트 = ["A", "b", "c", "D"]

for txt in 리스트:
    if txt.isupper() == True:  # isupper():대소문자 판별함수, True/False로 반환해줌
        print(txt)


# 156
# 리스트에서 소문자만 화면에 출력하라.
리스트 = ["A", "b", "c", "D"]

for txt in 리스트:
    if txt.isupper() == False:
        print(txt)


# 157
# 이름의 첫 글자를 대문자로 변경해서 출력하라.
리스트 = ['dog', 'cat', 'parrot']

for animal in 리스트:
    print(animal[0].upper() + animal[1:])


# 158
# 파일 이름이 저장된 리스트에서 확장자를 제거하고 파일 이름만 화면에 출력하라.
# (힌트: split() 메서드)
리스트 = ['hello.py', 'ex01.py', 'intro.hwp']

for x in 리스트:
    print(x.split('.')[0])


# 159
# 파일 이름이 저장된 리스트에서 확장자가 .h인 파일 이름을 출력하라.
리스트 = ['intra.h', 'intra.c', 'define.h', 'run.py']

for x in 리스트:
    if x.split('.')[1] == 'h':
        print(x)


# 160
# 파일 이름이 저장된 리스트에서 확장자가 .h나 .c인 파일을 화면에 출력하라.
리스트 = ['intra.h', 'intra.c', 'define.h', 'run.py']

for x in 리스트:
    ext = x.split('.')[1]  # ext = extension
    if ext == 'h' or ext == 'c':
        print(x)


# 161
# for문과 range 구문을 사용해서 0~99까지 한 라인에 하나씩 순차적으로 출력하는 프로그램을 작성하라.
for n in range(100):
    print(n)


# 162
# 월드컵은 4년에 한 번 개최된다.
# range()를 사용하여 2002~2050년까지 중 월드컵이 개최되는 연도를 출력하라.
for year in range(2002, 2051, 4):
    print(year)


# 163
# 1부터 30까지의 숫자 중 3의 배수를 출력하라.
for n in range(3, 31, 3):
    print(n)


# 164
# 99부터 0까지 1씩 감소하는 숫자들을, 한 라인에 하나씩 출력하라.

# 방법1
for n in range(100)[::-1]:
    print(n)

# 방법2
for n in range(100):
    print(99 - n)


#⭐165
# for문을 사용해서 아래와 같이 출력하라.
for n in range(10):
    print(n / 10)


# 166
# 구구단 3단을 출력하라.
for i in range(1,10):
    print(f'3x{i} = {3*i}')


# 167
# 구구단 3단을 출력하라. 단 홀수 번째만 출력한다.

# 방법1
for i in range(1,10):
    if i % 2 == 1:
        print(f'3x{i} = {3*i}')

# 방법2
for i in range(1,10,2):
    print(f'3x{i} = {3*i}')


# 168
# 1~10까지의 숫자에 대해 모두 더한 값을 출력하는 프로그램을 for 문을 사용하여 작성하라.
result = 0
for n in range(1,11):    
    result += n
print('합 :', result)


# 169
# 1~10까지의 숫자 중 모든 홀수의 합을 출력하는 프로그램을 for 문을 사용하여 작성하라.

# 방법1
result = 0
for n in range(1,11):
    if n % 2 == 1:
        result += n
print('합 :', result)

# 방법2 (리스트 컴프리헨션 이용)
loop = [n for n in range(1,11) if n%2 ==1]
print('합 :', sum(loop))


# 170
# 1~10까지의 숫자를 모두 곱한 값을 출력하는 프로그램을 for 문을 사용하여 작성하라.
for n in range(1,11):
    print 
