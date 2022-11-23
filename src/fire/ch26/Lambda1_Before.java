package src.fire.ch26;

/* ���� �� (�͸� Ŭ����) */

interface Printable4{
	void print(String s);
}

class Lambda1_Before {
	public static void main(String[] args) {
		Printable4 prn = new Printable4() { // �͸� Ŭ���� ����
			@Override
			public void print(String s) {
				System.out.println(s);
			}
		};
		
		prn.print("Hello Lambda");
	}
}
