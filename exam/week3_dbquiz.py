from pymongo import MongoClient
client = MongoClient('localhost', 27017)
db = client.dbpymongo

# title이 매트릭스인 데이터 가져오기
target_movie = db.movies.find_one({'title':'매트릭스'})
# 매트릭스의 star 값 가져오기
terget_star = target_movie['star']

# 매트릭스와 star이 동일한 영화 제목들 가져오기
movies = list(db.movies.find({'star':terget_star}))
for movie in movies:
    print(movie['title'])

