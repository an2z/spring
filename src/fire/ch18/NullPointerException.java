package src.fire.ch18;

/* ���� Ŭ���� (NullPointerException)
 * null�� ����� ���������� ������� �޼ҵ带 ȣ���� �� �߻��ϴ� ������Ȳ�� �ǹ�
 */

class NullPointerException {
	public static void main(String[] args) {
		String str = null;
		System.out.println(str);  // null ���
		int len = str.length();   // ���� �߻�
	}
}
