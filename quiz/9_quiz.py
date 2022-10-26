# >> 초보자를 위한 파이썬 300제 (81 ~ 90) <<

#⭐081
# 다음과 같이 10개의 값이 저장된 scores 리스트가 있을 때,
# start expression을 사용하여 좌측 8개의 값을 valid_score 변수에 바인딩하여라.
scores = [8.8, 8.9, 8.7, 9.2, 9.3, 9.7, 9.9, 9.5, 7.8, 9.4]

# *a,b,c = scores
# valid_score = list(*a)
# print(valid_score)

# 정답
*valid_score, _,_ = scores
print(*valid_score)


# 082
# start expression을 사용하여 우측 8개의 값을 valid_score 변수에 바인딩하여라.
scores = [8.8, 8.9, 8.7, 9.2, 9.3, 9.7, 9.9, 9.5, 7.8, 9.4]

_, _, *valid_score = scores
print(*valid_score)


# 83
# start expression을 사용하여 가운데 있는 8개의 값을 valid_score 변수에 바인딩하여라.
scores = [8.8, 8.9, 8.7, 9.2, 9.3, 9.7, 9.9, 9.5, 7.8, 9.4]

a, *valid_score, b = scores
print(*valid_score)


# 84
# temp 이름의 비어있는 딕셔너리를 만들라.
temp = {}
print(temp)


# 85
# 다음 아이스크림 이름과 희망 가격을 딕셔너리로 구성하라.
# 이 름  | 희망가격
# 메로나 | 1000
# 폴라포 | 1200
# 빵빠레 | 1800
icecream = {'메로나':1000, '폴라포':1200, '빵빠레':1800}
print(icecream)


# 86
# 085번의 딕셔너리에 아래 아이스크림 가격정보를 추가하라.
# 이 름  | 희망가격
# 죠스바 | 1200
# 월드콘 | 1500
icecream['죠스바'] = 1200
icecream['월드콘'] = 1500
print(icecream)


# 87
# 다음 딕셔너리를 사용하여 메로나 가격을 출력하라.
ice = {'메로나': 1000,
        '폴로포': 1200,
        '빵빠레': 1800,
        '죠스바': 1200,
        '월드콘': 1500}
print(ice['메로나'])


#⭐88
# 087번의 메로나의 가격을 1300으로 수정하라.
ice['메로나'] = 1300
print(ice)


# 89
# 다음 딕셔너리에서 메로나를 삭제하라.
ice = {'메로나': 1000,
        '폴로포': 1200,
        '빵빠레': 1800,
        '죠스바': 1200,
        '월드콘': 1500}

del ice['메로나']
print(ice)


# 90
# 다음 코드에서 에러가 발생한 원인을 설명하라.
# 딕셔너리에 '누가바'라는 key값이 없기 때문에

# 정답
# 딕셔너리에 없는 키를 사용해서 인덱싱하면 키에러가 발생한다.