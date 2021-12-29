package ch02;

/* 문자 자료형 */
public class CharExam {
	public static void main(String[] args) {		
		char ch1 = '헐';
		char ch2 = '확';
		char ch3 = 54736;  // 문자 '헐'의 유니코드 값
		char ch4 = 54869;  // 문자 '확'의 유니코드 값
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch1 + "" + ch2);
		System.out.println(ch3 + "" + ch4);		
	}
	
}
