package ch26;

/* 로컬 클래스
 * 중괄호 내, 메소드 내에 정의되는 클래스
 */

interface Printable2 {
	void print();
}

class Paper2 {
	private String str;

	public Paper2(String s) {
		str = s;
	}

	public Printable2 getPrinter() {
		class Printer implements Printable2 { // 로컬 클래스
			public void print() {
				System.out.println(str);
			}
		}
			
		return new Printer(); // 로컬 클래스 인스턴스 생성 및 반환
	}
}

class InnerClass_Local {
	public static void main(String[] args) {
		Paper2 p = new Paper2("날씨 맑음");
		Printable2 prn = p.getPrinter();
		prn.print();
	}
}