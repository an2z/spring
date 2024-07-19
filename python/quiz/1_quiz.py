# >> 초보자를 위한 파이썬 300제 (1 ~ 10) <<

# 001 
# 화면에 Hello World 문자열을 출력하세요.
print('Hello World ')


# 002 
# 화면에 Mary's cosmetics을 출력하세요. (중간에 '가 있음에 주의하세요)
print("Mary's cosmetics")  # 문자열은 ""/''로 표현 가능


# 003 
# 화면에 아래 문장을 출력하세요. (중간에 "가 있음에 주의하세요.)
# 신씨가 소리질렀다. "도둑이야".
print('신씨가 소리질렀다. "도둑이야".')


# 004 
# 화면에 "C:\Windows"를 출력하세요.
print("C:\Windows")


# 005 
# 다음 코드를 실행해보고 \t와 \n의 역할을 설명해보세요.
print("안녕하세요.\n만나서\t\t반갑습니다.")

# \n은 줄바꿈
# \t는 탭의 역할을 한다


# 006 
# print 함수에 두 개의 단어를 입력한 예제입니다. 아래 코드의 출력 결과를 예상해봅시다.
print ("오늘은", "일요일")
# 오늘은 일요일 출력


#⭐007 
# print() 함수를 사용하여 다음과 같이 출력하세요.
# naver;kakao;sk;samsung

print("naver", "kakao", "samsung", sep=";")  
# print함수의 sep인자로 ";"을 입력하면 출력되는 값 사이에 한칸의 공백 대신 세미콜론이 출력된다


# 008 
# print() 함수를 사용하여 다음과 같이 출력하세요.
# naver/kakao/sk/samsung

print("naver", "kakao", "samsung", sep="/")


#⭐009 
# 다음 코드를 수정하여 줄바꿈이 없이 출력하세요. (힌트: end='')
# print 함수는 두 번 사용합니다. 세미콜론 (;)은 한줄에 여러 개의 명령을 작성하기 위해 사용합니다.
# print("first");print("second")

print("first",end=" ");print("second")
# end="" : print함수의 옵션으로 print문을 이용해 출력을 완료한 뒤의 내용을 수정할 수 있다.
# 기본값으로는 줄바꿈(\n)이 들어가 있으며, 이를 사용해 줄바꿈을 없애거나 원하는 문자를 입력할 수 있다


# 010 
# 5/3의 결과를 화면에 출력하세요.
print(5/3)
