package ch11;

class StringImmutableExam {
	public static void main(String[] args) {
		// 첫번째 방법
		String str1 = "sample String";
		String str2 = "sample String";
		
		// 두번째 방법
		String str3 = new String("sample String");
		String str4 = new String("sample String");

		if (str1 == str2)
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else
			System.out.println("str1과 str2는 다른 인스턴스 참조");

		if (str3 == str4)
			System.out.println("str3과 str4는 동일 인스턴스 참조");
		else
			System.out.println("str3과 str4는 다른 인스턴스 참조");
		
		/* equals 메소드 */
		if (str3.equals(str4))  // String 인스턴스가 지니는 문자열의 내용을 비교
			System.out.println("str3과 str4의 문자열 내용이 같습니다.");
		else
			System.out.println("str3과 str4의 문자열 내용이 다릅니다.");
	}
	
}
