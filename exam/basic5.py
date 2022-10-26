# 딕셔너리 자료형
dic = {'name':'jolly', 'age':'25'}
print(dic)

print(dic['name'])              # key값으로 값을 가져온다
print(dic['age'])


# 딕셔너리 추가하기
dic = {'name':'jolly', 'age':'25'}
dic['height'] = '160'
print(dic)


# 딕셔너리 삭제하기
dic = {'name':'jolly', 'age':'25'}
del dic['age']           
print(dic)



# 딕셔너리 관련 함수
# 1) keys : 딕셔너리에 있는 key만 가져온다
dic = {'name':'jolly', 'age':'25'}
print(dic.keys())

# 2) values : 딕셔너리에 있는 value만 가져온다
dic = {'name':'jolly', 'age':'25'}
print(dic.values())

# 3) get : key값에 대응하는 value값을 가져온다
dic = {'name':'jolly', 'age':'25'}
print(dic.get('name'))

# 4) clear : 딕셔너리의 모든 요소 삭제
dic = {'name':'jolly', 'age':'25'}
dic.clear()
print(dic)

# 5) item : 딕셔너리의 요소를 튜플자료형으로 가져온다
dic = {'name':'jolly', 'age':'25'}
for i in dic.items():
    print(i)