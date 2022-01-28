package ch26;

/* 람다 후 */

interface Printable5 {
	void print(String s);
}

class Lambda2_After {
	public static void main(String[] args) {
		Printable5 prn = (s) -> { System.out.println(s); }; // 람다식
		prn.print("Hello Lambda");
	}
}