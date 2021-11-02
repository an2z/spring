from pymongo import MongoClient           # pymongo를 임포트 하기(패키지 인스톨 먼저 해야겠죠?)
client = MongoClient('localhost', 27017)  # mongoDB는 27017 포트로 돌아갑니다.
db = client.dbpymongo                     # 'dbpymongo'라는 이름의 db를 만듭니다.

# find_one - 특정 결과 값을 뽑아보기

# mongoDB에서 {'name':'bobby'}인 데이터만 보기
user = db.users.find_one({'name':'bobby'},{'_id':False})
print(user)