package ch18;

/* 예외처리의 책임 전가 (예외처리 전)
 * 메소드 호출 흐름 : main -> m1 -> m2
 * 예외 발생 지점에서 처리되지 않으면 그 책임이 넘어간다.(해당 메소드를 호출한 메소드로 책임전가)
 * 책임이 main까지 넘어와 main에서도 예외처리를 하지 않으면 가상머신이 대신 예외를 처리한다.
 * 가상머신이 예외를 처리하는 방법은 관련 메시지의 출력과 프로그램의 종료이다.
 */

class ExceptionMessage {
	public static void m1(int n) {
		m2(n,0);  // m2 메소드를 호출
	}
	
	public static void m2(int n1, int n2) {
		int r = n1/n2;  // 예외 발생 지점
	}
	
	public static void main(String[] args) {
		m1(3);
		System.out.println("프로그램 종료!");
	}
}