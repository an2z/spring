package src.fire.ch26;

/* ���ٽ��� ���� ���� */

interface Printable6 {
	void print(String s);
}

class Lambda3 {
	public static void ShowString(Printable6 p, String s) {
		p.print(s);
	}
	
	public static void main(String[] args) {
		ShowString((s) -> {System.out.println(s);}, "Hello Lambda");
	}
}
