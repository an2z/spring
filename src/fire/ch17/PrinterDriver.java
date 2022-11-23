package src.fire.ch17;

/* �������̽�
 * interface�� ���� �������̽� ����
 * implements�� ���� �Ϲ� Ŭ�������� �������̽��� ����
 */

interface Printable {
	public void print(String doc); // �߻� �޼ҵ�
}

class Printer implements Printable { // Printable�� �����ϴ� Printer Ŭ����
	@Override
	public void print(String doc) { // �������̵� ���� ����
		System.out.println(doc);
	}
}

class PrinterDriver {
	public static void main(String[] args) {
		Printable p = new Printer(); // �������̽�(Printable)�� �������� ���� ����
		p.print("Hello Java"); // �������̵� �� �޼ҵ尡 ȣ���
	}
}
