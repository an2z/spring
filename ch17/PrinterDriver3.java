package ch17;

/* 인터페이스의 상속
 * extends로 인터페이스의 상속을 명시한다.
 */

interface Printable3 { // MS사가 제공한 인터페이스
	void print(String doc); // 흑백 출력을 위한 추상 메소드
}

interface ColorPrintable extends Printable3 { // Printable3를 상속하는 인터페이스
	void printColor(String doc); // 컬러 출력을 위한 추상 메소드
}

// 컬러 프린터 드라이버
class PrinterColorDriver implements ColorPrintable {
	@Override
	public void print(String doc) { // 흑백 출력 메소드
		System.out.println("From black & white print");
		System.out.println(doc);
	}
	@Override
	public void printColor(String doc) { // 컬러 출력 메소드
		System.out.println("From color print");
		System.out.println(doc);
	}
}

class PrinterDriver3 {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		
		ColorPrintable p = new PrinterColorDriver();
		
		p.print(myDoc); // 흑백 출력
		System.out.println(); // 단순 개행
		
		p.printColor(myDoc); // 컬러 출력
	}
}
