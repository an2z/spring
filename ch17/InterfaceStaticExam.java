package ch17;

/* 인터페이스의 static메소드 */

interface Printable5 {
	static void printLine(String str) { // static 메소드
		System.out.println(str);
	}
	
	default void print(String doc) {
		printLine(doc); // 인터페이스의 static 메소드 호출
	}
}

class Printer5 implements Printable5 { } // 인터페이스 Printale5에는 구현해야 할 메소드가 존재 하지 않음

class InterfaceStaticExam {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		Printable5 p = new Printer5();
		p.print(myDoc);
				
		Printable5.printLine("end fo line"); // 인터페이스의 static 메소드 직접 호출
	}
}
