package ch07;

class constructorExam00 {
	String acc_number;
	String ss_number;
	int balance = 0;
	
	/* 생성자 */
	public constructorExam00(String acc, String ss, int bal) {
		acc_number = acc;
		ss_number = ss;
		balance = bal;		
	}
}


public class constructorExam {
	public static void main(String[] args) {
		/* 고유정보 주기 */
		constructorExam00 anne = new constructorExam00("12-34-89", "970522-2000000", 1000);  // 생성자 사용해 자동 초기화
	}
}
