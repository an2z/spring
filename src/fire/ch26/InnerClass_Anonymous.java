package src.fire.ch26;

/* �͸� Ŭ����
 * �̸� ���� ���ǵǴ� Ŭ����
 */

interface Printable3 {
	void print();
}

class Paper3 {
	private String str;

	public Paper3(String s) {
		str = s;
	}

	public Printable3 getPrinter() {
		return new Printable3() { // �͸� Ŭ���� ����, �ν��Ͻ� ���� �� ��ȯ
			public void print() {
				System.out.println(str);
			}
		};
	}
}

class InnerClass_Anonymous {
	public static void main(String[] args) {
		Paper3 p = new Paper3("���� ����");
		Printable3 prn = p.getPrinter();
		prn.print();
	}
}
