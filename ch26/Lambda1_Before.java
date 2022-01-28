package ch26;

/* 람다 전 (익명 클래스) */

interface Printable4{
	void print(String s);
}

class Lambda1_Before {
	public static void main(String[] args) {
		Printable4 prn = new Printable4() { // 익명 클래스 정의
			@Override
			public void print(String s) {
				System.out.println(s);
			}
		};
		
		prn.print("Hello Lambda");
	}
}