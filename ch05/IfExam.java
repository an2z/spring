package ch05;

class IfExam {
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 7;
		
		/* 조건문 (if) */
		if(n1 < n2) {
			System.out.println("n1 < n2 is true");
		}		
		if (n1 < n2)  // 중괄호 생략 가능
			System.out.println("n1 < n2 is true");
		
		/* 조건문 (if ~ else) */
		if (n1 == n2) {
			System.out.println("n1 == n2 is true");
		} else {
			System.out.println("n1 == n2 is false");
		}
		
		/* 조건문 (if ~ else if ~ else) */
		if (n1 > n2)                                // 먼저 검사
			System.out.println("n1 > n2 is true");
		else if (n1 == n2)                          // 위 조건이 만족되지 않으면 여기서 다시 검사
			System.out.println("n1 == n2 is true");
		else                                        // 아무것도 만족하지 않으면 else 실행
			System.out.println("n2 < n1 is true");
		
		
		/* 조건 연산자 (삼항 연산자) */
		int num1 = 50;
		int num2 = 100;
		int big;
		int diff;
		
		big = (num1 > num2) ? num1 : num2;
		System.out.println("큰 수: " + big);
		
		diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		System.out.println("절대값: " + diff);
		
		
		/* switch문 */
		int n = 3;
		
		switch(n) {  // case -> 레이블(책갈피) 역할
		case 1:
			System.out.println("simple java");
		case 2:
			System.out.println("funny java");
		case 3:
			System.out.println("fantastic java");
		default:
			System.out.println("the best programming language");
		}
		
		// switch + break문
		switch(n) {
		case 1: 
			System.out.println("simple java");
			break;
		case 2:
			System.out.println("funny java");
			break;
		case 3:
			System.out.println("fantastic java");
			break;
		default:
			System.out.println("the best programming language");
		}
		System.out.println("do you like java");
	}

}
