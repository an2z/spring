package src.fire.ch17;

/* �������̽��� ����Ʈ �޼ҵ� 
 * ����Ʈ �޼ҵ�� �������̽��� �߻� �޼ҵ带 �߰��ؾ� �ϴ� ��Ȳ����
 * ������ ������ ���� �ڵ忡 ������ ��ġ�� �ʱ� ���� ������ �����̴�. 
 */

interface Printable4 {
	void print(String doc);
	default void printColor(String doc) {} // �������̽��� ����Ʈ �޼ҵ�
}

class LPrinterDrv implements Printable4 { // L�� ������ ����̺� (��� ��¸� ��
	@Override
	public void print(String doc) {
		System.out.println("From LG black & white printer");
		System.out.println(doc);
	}
}

class SPrinterDrv implements Printable4 { // S�� ������ ����̺� (���, �÷� ��� ��� ����)
	@Override
	public void print(String doc) {
		System.out.println("From Samsung black & white printer");
		System.out.println(doc);
	}
	
	@Override
	public void printColor(String doc) {
		System.out.println("From Samsung color printer");
		System.out.println(doc);
	}
} 

class PrinterDriver4 {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		
		Printable4 p1 = new LPrinterDrv();
		p1.print(myDoc);
		System.out.println();
		
		Printable4 p2 = new SPrinterDrv();
		p2.print(myDoc);
		System.out.println();
		p2.printColor(myDoc);
	}
}
