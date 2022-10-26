# >> 초보자를 위한 파이썬 300제 (101 ~ 110) <<

# 101
# 파이썬에서 True 혹은 False를 갖는 데이터 타입은 무엇인가?

# bool 타입은 참과 거짓을 가지는 변수이다.


# 102
# 아래 코드의 출력 결과를 예상하라
print(3 == 5)

# False 출력


# 103
# 아래 코드의 출력 결과를 예상하라
print(3 < 5)

# True 출력


# 104
# 아래 코드의 결과를 예상하라.
x = 4
print(1 < x < 5)

# True 출력


# 105
# print ((3 == 3) and (4 != 3))

# True 출력


# 106
# 아래 코드에서 에러가 발생하는 원인에 대해 설명하라.
# print(3 => 4)

# 연산자의 형태가 맞지 않아서, >=가 맞는 형태!


# 107
# 아래 코드의 출력 결과를 예상하라
if 4 < 3:
    print("Hello World")

# 조건을 만족하지 않기 때문에 결과가 출력되지 않는다.


# 108
# 아래 코드의 출력 결과를 예상하라
if 4 < 3:
    print("Hello World.")
else:
    print("Hi, there.")

# Hi, there. 출력


#⭐109
# 아래 코드의 출력 결과를 예상하라
if True :
    print ("1")
    print ("2")
else :
    print("3")
print("4")

# 1
# 2
# 4


#⭐110
# 아래 코드의 출력 결과를 예상하라
if True :
    if False:
        print("1")
        print("2")
    else:
        print("3")
else :
    print("4")
print("5")

# 3
# 5