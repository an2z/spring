package ch18;

/* 예외 클래스 (ClassCastException)
 * 허용할 수 없는 형 변환을 강제로 진행하는 경우 발생하는 오류상황을 의미
 */

class Board { }
class ABoard extends Board { }

class ClassCastException {
	public static void main(String[] args) {
		Board abd1 = new ABoard();
		ABoard abd2 = (ABoard)abd1;  // 명시적 형변환 ok!
		
		System.out.println(".. intermediate location ..");
		Board bd1 = new Board();
		ABoard bd2 = (ABoard)bd1;    // 예외 발생
	}
}
