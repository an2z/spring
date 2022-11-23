package src.fire.ch18;

/* ����ó���� å�� ���� (����ó�� ��)
 * �޼ҵ� ȣ�� �帧 : main -> m1 -> m2
 * ���� �߻� �������� ó������ ������ �� å���� �Ѿ��.(�ش� �޼ҵ带 ȣ���� �޼ҵ�� å������)
 * å���� main���� �Ѿ�� main������ ����ó���� ���� ������ ����ӽ��� ��� ���ܸ� ó���Ѵ�.
 * ����ӽ��� ���ܸ� ó���ϴ� ����� ���� �޽����� ��°� ���α׷��� �����̴�.
 */

class ExceptionMessage {
	public static void m1(int n) {
		m2(n,0);  // m2 �޼ҵ带 ȣ��
	}
	
	public static void m2(int n1, int n2) {
		int r = n1/n2;  // ���� �߻� ����
	}
	
	public static void main(String[] args) {
		m1(3);
		System.out.println("���α׷� ����!");
	}
}
