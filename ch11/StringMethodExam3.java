package ch11;

/* String 클래스의 메소드 */
class StringMethodExam3 {
	public static void main(String[] args) {		
		double e = 2.718;
		int n = 3;
		
		/* valueOf (문자열로 바꾸기) */
		String se = String.valueOf(e);
		String sn = String.valueOf(n);
		
		System.out.println(se + sn);  // 숫자의 합이 아닌 문자열의 합으로 출력
	}
	
	/* valueof 메소드의 오버로딩 */
//	static String valueOf(boolean b)
//	static String valueOf(char b)
//	static String valueOf(double b)
//	static String valueOf(float b)
//	static String valueOf(int b)
//	static String valueOf(long b)
	
}
