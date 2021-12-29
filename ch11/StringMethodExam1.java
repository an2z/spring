package ch11;

/* String 클래스의 메소드 */
class StringMethodExam1 {
	public static void main(String[] args) {
		/* concat (문자열 연결) */
		String st1 = "coffee";
		String st2 = "Bread";
		
		String st3 = st1.concat(st2);
		System.out.println(st3);
		
		String st4 = "Fresh".concat(st3);
		System.out.println(st4);
		
		
		/* substring (문자열 일부 추출) */
		String st = "abcdefg";
		st.substring(2);  // 인덱스 2번째 이후의 문자열 추출
		st.substring(2,4);  // 인덱스 2~3번째 범위의 문자열 추출
		
		System.out.println(st.substring(2));
		System.out.println(st.substring(2,4));		
	}

}
