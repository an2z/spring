package src.fire.ch11;

/* String Ŭ������ �ν��Ͻ� ���� */
class StringExam {
	public static void showString(String str) {
		System.out.println(str);
		System.out.println(str.length());
	}
	
	public static void main(String[] args) {
		String str1 = new String("sample String");  // String �ν��Ͻ� ���� ���1
		String str2 = "this is String";  // String �ν��Ͻ� ���� ���2
		
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println();  // �ܼ� '�� ��'�� �̷�����.
		
		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println();
		
		showString("Funny String");  // String �ν��Ͻ� ���� �Ŀ� �޼ҵ� ȣ��
	}

}

