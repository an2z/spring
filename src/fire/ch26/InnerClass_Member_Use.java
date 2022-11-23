package src.fire.ch26;

/* ��� Ŭ���� ���
 * Ŭ������ ���Ǹ� ����� �Ҷ� �����ϰ� ����Ѵ�.
 */

interface Printable {
	void print();
}

class Paper {
	private String str;

	public Paper(String s) {
		str = s;
	}

	public Printable getPrinter() {
		return new Printer(); // ��� Ŭ���� �ν��Ͻ� ���� �� ��ȯ
	}
	
	private class Printer implements Printable { // ��� Ŭ����
		public void print() {
			System.out.println(str);
		}
	}
}

class InnerClass_Member_Use {
	public static void main(String[] args) {
		Paper p = new Paper("���� ����");
		Printable prn = p.getPrinter();
		prn.print();
	}
}
