# 조건문

a = 3
b = 5
c = 1

if a < b and a < c :             # 조건문은 중복이 가능 (and/or)
    print('a는 b보다 작다')
elif a == b :                    # 조건을 추가 (elif)
    print('a는 b와 같다')
else :
    print('a는 b보다 크다')


# for 반복문

for i in range(10) :             # i는 0부터 10까지 1씩 증가를 반복
    print(i)

aaa = [1,2,3,4,5,6,7,8]
for i in aaa :                   # 리스트 안에 있는 값을 하나씩 꺼내옴
    print(i)


# while 반복문

i = 0                            # i는 0부터 10까지 1씩 증가를 반복
while(i<10):
    print(i)
    i += 1   #i=i+1