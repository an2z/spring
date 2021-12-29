package ch07;

/* String 클래스 */
public class stringExam {
	public static void main(String[] args) {
		String str1 = "Happy";  // String형 참조변수 선언, String 인스턴스 생성
		String str2 = "Birthday";
		System.out.println(str1 + " " + str2);
		
		printString(str1);
		printString(str2);	
	}
	
	public static void printString(String str) {
		System.out.println(str);
	}
}
