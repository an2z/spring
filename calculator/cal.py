# tkinter : 다이얼로그를 만들 수 있는 기능
# 이는 파이썬에서 기본으로 제공하는 모듈이다
import tkinter as tk


win = tk.Tk()           # Tk() : 최상위 윈도우 창을 만들어 주는 함수
win.title('계산기')      # title을 지정 


# 현재눌린것과 이전에눌린것이 무엇인지 알아야 계산이 가능하기 때문에 변수를 만들어준다
disValue = 0                                            # 현재값을 'disValue'변수로 선언
operator = {'+':1, '-':2, '/':3, '*':4, 'C':5 ,'=':6}   # 연산자를 구분해주는 'operator'변수 선언
stoValue = 0                                            # sto = store으로, 저장된 값을 'stoValue'변수로 선언
opPre = 0                                               # Pre = previous으로, 이전명령을 'opPre'변수로 선언


# 📌[3] 버튼 클릭시 액션 만들기
# 숫자를 눌렀을때 함수
def number_click(value) :
    # print('숫자',value)
    global disValue                    # 이 함수에서 disValue라는 전역변수를 사용하겠다
    disValue = (disValue*10) + value   # *10을 지워보세요 그러면 알게됨
    str_value.set(disValue)            # set을 해줌으로 disValue 변수의 값이 수정되어 출력

# C를 눌렀을때 함수
def clear_click() :            # C가 클릭되면 모두 초기화
    global disValue, operator, stoValue, opPre
    stoValue = 0
    opPre = 0
    disValue = 0
    str_value.set(disValue)    # disValue의 값이 0으로 수정되어 출력
    
# 연산자를 눌렀을때 함수
def operator_click(value) :
    # print('명령', value)
    global disValue, operator, stoValue, opPre
    op = operator[value]           # operator변수(dic형태)의 key:value 중 value를 op변수에 넣어줌
    if op == 5 :                   # op가 5, 즉 C가 눌렸을 경우
        clear_click()              # clear_click() 함수가 실행 ➡ 모두 초기화
    
    elif disValue == 0 :           # 아무런 값이 눌리지 않은 경우 (처음상태)               
        opPre = 0                  # 이전명령을 0으로 만듬
    
    elif opPre == 0 :               # 이전명령이 없고, 지금 새로 명령이 눌렸을 경우
        opPre = op
        stoValue = disValue        # 현재값을 StoValue로 저장해줌
        disValue = 0               # 화면에 보이는 현재값을 0으로 만듬
        str_value.set(str(disValue))

    elif op == 6 :                 # op가 6, 즉 =이 눌렸을 경우
        if opPre == 1 :                     # 이전명령이 +일때
            disValue = stoValue + disValue  # 저장된값과 현재값을 더해준다

        if opPre == 2 :                     # 이전명령이 -일때
            disValue = stoValue - disValue  # 저장된값과 현재값을 빼준다

        if opPre == 3 :                     # 이전명령이 /일때
            disValue = stoValue / disValue  # 저장된값과 현재값을 나눠준다

        if opPre == 4 :                     # 이전명령이 *일때
            disValue = stoValue * disValue  # 저장된값과 현재값을 곱해준다

        str_value.set(str(disValue))    # disValue의 수정되어 출력
        # 연산이 되고나면 저장값, 현재값, 이전명령을 초기화
        disValue = 0         
        stoValue = 0
        opPre = 0
    
    else :                   # 나머지 이상동작이 있을 경우
        clear_click()        # 초기화
   
# 버튼을 눌렀을때 함수
def btn_click(value) :
    print(value)
    try :
        value = int(value)        # value가 정수면 error가 나지 않고, 정수가 아닐경우 error가 발생
        number_click(value)       # 정수일 경우 number_click 함수를 실행하고
    except :
        operator_click(value)     # 아닐 경우 operator_click 함수를 실행하라



# 📌[2] 맨위에 edit창 만들기
# StringVar() : tkinter GUI에서 화면에 띄운 텍스트 내용을 필요에 따라 바꿔야할 때 사용
# 계산 된 값은 계산할 때마다 계속 바뀌어야 하기 때문에 StringVar를 사용, 이로 인해 disValue의 값이 바뀌면 edit창에 표시되는 값이 바뀐다
str_value = tk.StringVar()         
str_value.set(str(disValue))       # int인 disValue값을 'str'을 이용해 문자열로 변환, set을 해주면 변수의 값이 수정되어 출력

# Entry() : 텍스트를 입력받거나 출력하기 위한 기입창(edit창)을 생성하는 함수
# textvariable ➡ edit 창은 결과값이 계속 변하기 때문에
# justify : edit 창을 어디에 배치할 것인가 ➡ 오른쪽
dis = tk.Entry(win, textvariable=str_value, justify='right', bg='black', fg='white')

# grid() : 배치를 지정해주는 함수
# columnspan : column의 개수를 지정
# idadx / idady : edit창의 x축 y축의 크기를 지정
dis.grid(column=0, row=0, columnspan=4, ipadx=88, ipady=30)


# 📌[1] 계산기 버튼 만들기 (간결한 코드)
cal_item = [['1','2','3','4'],
            ['5','6','7','8'],
            ['9','0','+','-'],
            ['/','*','C','=']]

for i,items in enumerate(cal_item) :  # enumerate() : python 반복문 method로, 인덱스 번호와 컬렉션의 요소를 tuple형태로 반환한다
    for k,item in enumerate(items) :    
        try : 
            color = int(item)     # item을 정수로 반환해준다면, 숫자는 오류가 나지 않지만 오퍼레이터들은 오류가 난다는 것을 이용 ➡ 숫자와 오퍼를 구분
            color = 'black'       # 정수의 color를 black으로 지정
        except :
            color = 'grey'        # 아닌경우, 즉 오퍼레이션 color를 grey으로 지정

        btn = tk.Button(win,
            text = item,
            width = 10,
            height = 5,
            bg = color,                      # background color 지정 
            fg = 'white',                    # font color 지정
            # command를 사용해 함수를 호출
            # item으로 들어오는 값을 cmd변수에 넣어주고
            # lambda는 ...?? 무엇?
            command = lambda cmd=item : btn_click(cmd)   
            )
        btn.grid(column=k, row=i+1)


# mainloop() : 생성한 윈도우 내부에서 수행되는 마우스 클릭 같은 이벤트들이 발생하게끔 유지해주는 함수
win.mainloop()     




# # 계산기 버튼 만들기 (풀어쓴 코드)
# # grid를 사용해서 구역을 나눠준다
# tk.Button(win, text='1', width=10, height=5).grid(column=0, row=1)
# tk.Button(win, text='2', width=10, height=5).grid(column=1, row=1)
# tk.Button(win, text='3', width=10, height=5).grid(column=2, row=1)
# tk.Button(win, text='4', width=10, height=5).grid(column=3, row=1)

# tk.Button(win, text='5', width=10, height=5).grid(column=0, row=2)
# tk.Button(win, text='6', width=10, height=5).grid(column=1, row=2)
# tk.Button(win, text='7', width=10, height=5).grid(column=2, row=2)
# tk.Button(win, text='8', width=10, height=5).grid(column=3, row=2)

# tk.Button(win, text='9', width=10, height=5).grid(column=0, row=3)
# tk.Button(win, text='0', width=10, height=5).grid(column=1, row=3)
# tk.Button(win, text='+', width=10, height=5).grid(column=2, row=3)
# tk.Button(win, text='-', width=10, height=5).grid(column=3, row=3)

# tk.Button(win, text='/', width=10, height=5).grid(column=0, row=4)
# tk.Button(win, text='*', width=10, height=5).grid(column=1, row=4)
# tk.Button(win, text='C', width=10, height=5).grid(column=2, row=4)
# tk.Button(win, text='=', width=10, height=5).grid(column=3, row=4)