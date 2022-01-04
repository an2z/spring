package ch17;

/* 인터페이스
 * interface를 통해 인터페이스 선언
 * implements를 통해 일반 클래스에서 인터페이스를 구현
 */

interface Printable {
	public void print(String doc); // 추상 메소드
}

class Printer implements Printable { // Printable을 구현하는 Printer 클래스
	@Override
	public void print(String doc) { // 오버라이딩 관계 성립
		System.out.println(doc);
	}
}

class PrinterDriver {
	public static void main(String[] args) {
		Printable p = new Printer(); // 인터페이스(Printable)형 참조변수 선언 가능
		p.print("Hello Java"); // 오버라이딩 한 메소드가 호출됨
	}
}
