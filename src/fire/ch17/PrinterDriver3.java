package src.fire.ch17;

/* �������̽��� ���
 * extends�� �������̽��� ����� ����Ѵ�.
 */

interface Printable3 { // MS�簡 ������ �������̽�
	void print(String doc); // ��� ����� ���� �߻� �޼ҵ�
}

interface ColorPrintable extends Printable3 { // Printable3�� ����ϴ� �������̽�
	void printColor(String doc); // �÷� ����� ���� �߻� �޼ҵ�
}

// �÷� ������ ����̹�
class PrinterColorDriver implements ColorPrintable {
	@Override
	public void print(String doc) { // ��� ��� �޼ҵ�
		System.out.println("From black & white print");
		System.out.println(doc);
	}
	@Override
	public void printColor(String doc) { // �÷� ��� �޼ҵ�
		System.out.println("From color print");
		System.out.println(doc);
	}
}

class PrinterDriver3 {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		
		ColorPrintable p = new PrinterColorDriver();
		
		p.print(myDoc); // ��� ���
		System.out.println(); // �ܼ� ����
		
		p.printColor(myDoc); // �÷� ���
	}
}
