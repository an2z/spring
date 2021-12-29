package ch11;

/* StringBuilder 클래스의 메소드 */
class StringBuilderExam {
	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("123");  // 문자열 "123"이 저장된 인스턴스 생성
		
		stb.append(45678); // 문자열 덧붙이기
		System.out.println(stb.toString());
		
		stb.delete(0, 2);  // 문자열 일부(0부터 1까지) 삭제
		System.out.println(stb.toString());
		
		stb.reverse();  // 문자열 내용 뒤집기
		System.out.println(stb.toString());
		
		String sub = stb.substring(2, 4);
		System.out.println(sub);
	}

}

