from pymongo import MongoClient           # pymongo를 임포트 하기(패키지 인스톨 먼저 해야겠죠?)
client = MongoClient('localhost', 27017)  # mongoDB는 27017 포트로 돌아갑니다.
db = client.dbpymongo                     # 'dbpymongo'라는 이름의 db를 만듭니다.

# update - 데이터 수정하기

# {'name':'bobby'}인 데이터를 찾아서 {'age':19}로 수정해라
db.users.update_one({'name':'bobby'},{'$set':{'age':19}})