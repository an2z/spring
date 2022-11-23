package src.fire.ch26;

/* ���� �� */

interface Printable5 {
	void print(String s);
}

class Lambda2_After {
	public static void main(String[] args) {
		Printable5 prn = (s) -> { System.out.println(s); }; // ���ٽ�
		prn.print("Hello Lambda");
	}
}
