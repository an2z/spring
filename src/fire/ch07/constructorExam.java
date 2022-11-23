package src.fire.ch07;

class constructorExam00 {
	String acc_number;
	String ss_number;
	int balance = 0;
	
	/* ������ */
	public constructorExam00(String acc, String ss, int bal) {
		acc_number = acc;
		ss_number = ss;
		balance = bal;		
	}
}


public class constructorExam {
	public static void main(String[] args) {
		/* �������� �ֱ� */
		constructorExam00 anne = new constructorExam00("12-34-89", "970522-2000000", 1000);  // ������ ����� �ڵ� �ʱ�ȭ
	}
}
