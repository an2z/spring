package src.fire.ch17;

/* �������̽� ����� instanceof ����
 * ���������� �����ϴ� �ν��Ͻ��� �ش� Ŭ������ ��,���������� �����ϴ� Ŭ������ �ν��Ͻ��� ��� true ��ȯ 
 */

interface Printable6 {
	void printLine(String str);
}

class SimplePrinter implements Printable6 { // Printable6�� ���� ����
	@Override
	public void printLine(String str) {
		System.out.println(str);
	}
}

class MultiPrinter extends SimplePrinter { // SimplePrinter�� ��������ν� Printable6�� ���� ������
	@Override
	public void printLine(String str) {
		super.printLine("start of multi...");
		super.printLine(str);
		super.printLine("end of multi...");
	}
}

class InterfaceInstanceofExam {
	public static void main(String[] args) {
		Printable6 p1 = new SimplePrinter();
		Printable6 p2 = new MultiPrinter();
		
		if (p1 instanceof Printable5)
			p1.printLine("This is a simple printer");
		System.out.println();
		
		if (p2 instanceof Printable5)
			p2.printLine("This is a muliful printer");
	}
}
