package ch10;

/* 클래스 변수의 접근방법 */
class StaticExam01 {
	static int num = 0;  // 클래스변수 (static변수)
	
	// 생성자
	StaticExam01 () {
		inside();		
	}
	
	void inside() {
		num++;  // 클래스 내부에서 이름을 통한 접근
		System.out.println("인스턴스 생성: " + num);
	}
}


public class StaticExam1 {
	public static void main(String[] args) {
		StaticExam01 ex1 = new StaticExam01();
		StaticExam01 ex2 = new StaticExam01();
		StaticExam01 ex3 = new StaticExam01();
		
		ex1.num++;  // 클래스 외부에서 인스턴스 이름을 통한 접근
		StaticExam01.num++;  // 클래스 외부에서 클래스 이름을 통한 접근
		System.out.println("num = " + StaticExam01.num);		
	}
}


