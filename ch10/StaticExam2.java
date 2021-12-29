package ch10;

/* 클래스 변수의 초기화 */
class StaticExam02 {
	static int num = 100;  // 클래스 변수의 적절한 초기화 위치
	
	// 생성자
	StaticExam02() {
		num++;  // 인스턴스 생성시마다 값이 리셋
		System.out.println("인스턴스 생성: " + num);
	}
}


public class StaticExam2 {
	public static void main(String[] args) {
		StaticExam02.num -= 15;  // 인스턴스 생성없이 num(클래스변수)에 접근
		System.out.println(StaticExam02.num);
	}
}
