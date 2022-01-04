package ch17;

/* 인터페이스의 디폴트 메소드 
 * 디폴트 메소드란 인터페이스에 추상 메소드를 추가해야 하는 상황에서
 * 이전에 개발해 놓은 코드에 영향을 미치지 않기 위해 등장한 문법이다. 
 */

interface Printable4 {
	void print(String doc);
	default void printColor(String doc) {} // 인터페이스의 디폴트 메소드
}

class LPrinterDrv implements Printable4 { // L사 프린터 드라이브 (흑백 출력만 가
	@Override
	public void print(String doc) {
		System.out.println("From LG black & white printer");
		System.out.println(doc);
	}
}

class SPrinterDrv implements Printable4 { // S사 프린터 드라이브 (흑백, 컬러 출력 모두 가능)
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
