package src.fire.ch17;

interface Printable2 {  // MS�� �����ϰ� ������ �������̽�
	public void print(String doc); // �߻� �޼ҵ�
}

class LPrinterDriver implements Printable2 { // L���� ������ ��뿡 �ʿ��� Ŭ���� ����
	@Override
	public void print(String doc) {
		System.out.println("Form LG printer");
		System.out.println(doc);
	}
}

class SPrinterDriver implements Printable2 { // S���� ������ ��뿡 �ʿ��� Ŭ���� ����
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

class PrinterDriver2 {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		
		// �Ｚ �����ͷ� ���
		Printable2 p = new SPrinterDriver();
		p.print(myDoc);
		System.out.println(); // �ܼ� ���� 
		
		// LG �����ͷ� ���
		p = new LPrinterDriver();
		p.print(myDoc);
	}
}
