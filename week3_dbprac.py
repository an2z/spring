from pymongo import MongoClient           # pymongo를 임포트 하기(패키지 인스톨 먼저 해야겠죠?)
client = MongoClient('localhost', 27017)  # mongoDB는 27017 포트로 돌아갑니다.
db = client.dbpymongo                     # 'dbpymongo'라는 이름의 db를 만듭니다.

# find - 모든 결과 값을 보기

# mogoDB에 있는 데이터 모두 보기
all_users = list(db.users.find({},{'_id':False}))
# 반복문을 돌며 모든 결과값을 보기
for users in all_users:
    print(users)