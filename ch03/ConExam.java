package ch03;

class ConExam {
	public static void main(String[] args) {
		/* 정수형 상수 표현 */ 
		int num1 = 123;      // 10진수 표현
		int num2 = 0123;     // 8진수 표현
		int num3 = 0x123;    // 16진수 표현
		int num4 = 0b111;	 // 2진수 표현
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		System.out.println("num4: " + num4);		
		System.out.println(3147483647l + 3147483647l);  // long형 정수 연산
		
		
		/* 실수형 상수 표현 */
		double pi = 3.1415;   // double형 표현
		
		System.out.println(3.0004999 + 2.0004999);     // double형 실수 연산	
		System.out.println(3.00004999f + 2.0004999f);  // float형 실수 연산 -> 정밀도 떨어짐
		
		
		/* 문자형 상수 표현 (이스케이프 시퀀스) */
		System.out.println("ab" + '\b' + "c");
		System.out.println("ab" + '\t' + "c");
		System.out.println("ab" + '\n' + "c");
		System.out.println("ab" + '\r' + "c");  
	}

}
