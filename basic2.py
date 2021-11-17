# 파이썬 연산자 ( 산술 | 비교 | 할당 | 논리 | 비트 )

# 산술연산자 : +, -, *, /, **, //, %
a = 1
b = 2

c = a + b      # 덧셈
d = a - b      # 뺄셈
e = a * b      # 곱셈
f = a / b      # 나누기
g = a // b     # 몫을 구한다
h = a % b      # 나머지를 구한다


# 비교연산자 : ==, !=, <, >, <=, >=
a = 2
b = 2
c = 3
d = 1

if a == b :                       
    print('a는 b와 같습니다.')

if a != c :
    print('a는 c는 같지않습니다.')  

if a < c : 
    print('a는 c보다 작다.')

if a > d :
    print('a는 d보다 크다.')

if a <= b :
    print('a는 b보다 작거나 같다.')

if a >= b :
    print('a는 b보다 크거나 같다.')


# 할당연산자 :  +=, -=, *=, %=, //=
a = 3
a += 3         # a = a + 3

b = 5
b -= 2         # b = b - 2

print(a)
print(b)

# 논리연산자 : and, or, not

# 비트연산자 : &(AND), |(OR), ^(XOR), ~(보수), <<, >>