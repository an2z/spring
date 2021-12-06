# >> 초보자를 위한 파이썬 300제 (71 ~ 80) <<

# 071
# my_variable 이름의 비어있는 튜플을 만들라.
my_variable = ()
print(my_variable, type(my_variable))


# 072
# 2016년 11월 영화 예매 순위 기준 top3는 다음과 같다.
# 영화 제목을 movie_rank 이름의 튜플에 저장하라. (순위 정보는 저장하지 않는다.)
# 1 | 닥터 스트레인지
# 2	| 스플릿
# 3	| 럭키
movie_rank = ("닥터스트레인지", "스플릿", "럭키")
print(movie_rank)


#⭐073
# 숫자 1 이 저장된 튜플을 생성하라.
my_tuple = (1)
print(my_tuple)

# 정답
# 튜플에 하나의 데이터가 저장되는 경우, 쉽표를 입력해줘야 한다.
my_tuple = (1, )


#⭐074
# 다음 코드를 실행해보고 오류가 발생하는 원인을 설명하라
# t = (1, 2, 3)
# t[0] = 'a'

# 정답
# 튜플은 원소의 값을 변경할 수 없다.


#⭐075
# 아래와 같이 t에는 1, 2, 3, 4 데이터가 바인딩되어 있다.
# t가 바인딩하는 데이터 타입은 무엇인가?
t = 1, 2, 3, 4
print(type(t))  

# 정답
# 원칙적으로 튜플은 괄호()를 사용해 데이터를 정의해야하지만,
# 편의를 위해 괄호 없이도 동작한다


#⭐076
# 변수 t에는 아래와 같은 값이 저장되어 있다.
# 변수 t가 ('A', 'b', 'c') 튜플을 가리키도록 수정 하라.
t = ('a', 'b', 'c')

t = ('A', 'b', 'c')
print(t)

# 튜플의 값은 변경할 수 없기 때문에, 원소하나만 변경해주는 것은 불가능하다.
# 새로운 튜플을 만들고 t라는 변수를 업데이트 해줘야 한다.
# 이때 기존의 튜플은 자동으로 삭제된다.


# 077
# 다음 튜플을 리스트로 변환하라.
interest = ('삼성전자', 'LG전자', 'SK Hynix')

print(list(interest))


# 078
# 다음 리스트를 튜플로 변경하라.
interest = ['삼성전자', 'LG전자', 'SK Hynix']

print(tuple(interest))


#⭐079
# 다음 코드의 실행 결과를 예상하라.
temp = ('apple', 'banana', 'cake')
a, b, c = temp
print(a, b, c)

# apple banana cake 출력


#⭐080
# 1 부터 99까지의 정수 중 짝수만 저장된 튜플을 생성하라.

# result = ()
# for n in range(100):
#     if n % 2 == 0:
#         result.append(n)
#     print(result)

# 정답
data = tuple(range(2,100,2))
print(data)