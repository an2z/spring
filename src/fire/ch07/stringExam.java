package src.fire.ch07;

/* String Ŭ���� */
public class stringExam {
	public static void main(String[] args) {
		String str1 = "Happy";  // String�� �������� ����, String �ν��Ͻ� ����
		String str2 = "Birthday";
		System.out.println(str1 + " " + str2);
		
		printString(str1);
		printString(str2);	
	}
	
	public static void printString(String str) {
		System.out.println(str);
	}
}
