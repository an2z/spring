package ch11;

class OverlodingExam1 {
	public static void main(String[] args) {
		OverlodingExam1 a = new OverlodingExam1();
		a.sample(4);
		a.sample(1 , 5);
		a.sample(3 , 0.5);
	}
	
	/* 메소드 오버로딩 */
	void sample(int n) { System.out.println(n);	}	
	void sample(int n1, int n2) { System.out.println(n1 + "\n" + n2); }	
	void sample(int n, double d) {System.out.println(n + "\n" + d); }
	
}
