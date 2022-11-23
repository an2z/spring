package src.fire.ch18;

/* ���� Ŭ���� (ClassCastException)
 * ����� �� ���� �� ��ȯ�� ������ �����ϴ� ��� �߻��ϴ� ������Ȳ�� �ǹ�
 */

class Board { }
class ABoard extends Board { }

class ClassCastException {
	public static void main(String[] args) {
		Board abd1 = new ABoard();
		ABoard abd2 = (ABoard)abd1;  // ����� ����ȯ ok!
		
		System.out.println(".. intermediate location ..");
		Board bd1 = new Board();
		ABoard bd2 = (ABoard)bd1;    // ���� �߻�
	}
}
