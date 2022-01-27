package ch26;

/* 익명 클래스
 * 이름 없이 정의되는 클래스
 */

interface Printable3 {
	void print();
}

class Paper3 {
	private String str;

	public Paper3(String s) {
		str = s;
	}

	public Printable3 getPrinter() {
		return new Printable3() { // 익명 클래스 정의, 인스턴스 생성 및 반환
			public void print() {
				System.out.println(str);
			}
		};
	}
}

class InnerClass_Anonymous {
	public static void main(String[] args) {
		Paper3 p = new Paper3("날씨 맑음");
		Printable3 prn = p.getPrinter();
		prn.print();
	}
}