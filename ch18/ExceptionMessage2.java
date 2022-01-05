package ch18;

/* 예외처리의 책임 전가 (예외처리 후) */

class ExceptionMessage2 {
	public static void m1(int n) {
		m2(n,0);  // 이 지점으로 m2로부터 예외가 넘어온다.
	}
	
	public static void m2(int n1, int n2) {
		int r = n1/n2;  // 이 지점에서 예외가 발생한다.
	}
	
	public static void main(String[] args) {
		try {
			m1(3);  // 이 지점에서 m1으로 부터 예외가 넘어온다.
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료!");
	}
}
