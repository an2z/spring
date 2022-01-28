package ch27;

/* 람다 표현식 (매개변수 o, 반환 x) 
 * 매개변수가 2개 이상일 경우 소괄호로 묶어준다. 
 */

interface Calculate {
	void cal(int a, int b); // 매개변수 둘, 반환형 void
}

class Lambda_TowParamNoReturn {
	public static void main(String[] args) {
		Calculate c;

		c = (a, b) -> System.out.println(a + b); // 덧셈 진행
		c.cal(4, 3);

		c = (a, b) -> System.out.println(a - b); // 뺄셈 진행
		c.cal(4, 3);
	}
}