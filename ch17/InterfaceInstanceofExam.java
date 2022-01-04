package ch17;

/* 인터페이스 대상의 instanceof 연산
 * 참조변수가 참조하는 인스턴스가 해당 클래스를 직,간접적으로 구현하는 클래스의 인스턴스일 경우 true 반환 
 */

interface Printable6 {
	void printLine(String str);
}

class SimplePrinter implements Printable6 { // Printable6를 직접 구현
	@Override
	public void printLine(String str) {
		System.out.println(str);
	}
}

class MultiPrinter extends SimplePrinter { // SimplePrinter를 상속함으로써 Printable6를 간접 구현함
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
