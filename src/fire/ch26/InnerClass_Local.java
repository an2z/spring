package src.fire.ch26;

/* ���� Ŭ����
 * �߰�ȣ ��, �޼ҵ� ���� ���ǵǴ� Ŭ����
 */

interface Printable2 {
	void print();
}

class Paper2 {
	private String str;

	public Paper2(String s) {
		str = s;
	}

	public Printable2 getPrinter() {
		class Printer implements Printable2 { // ���� Ŭ����
			public void print() {
				System.out.println(str);
			}
		}
			
		return new Printer(); // ���� Ŭ���� �ν��Ͻ� ���� �� ��ȯ
	}
}

class InnerClass_Local {
	public static void main(String[] args) {
		Paper2 p = new Paper2("���� ����");
		Printable2 prn = p.getPrinter();
		prn.print();
	}
}
