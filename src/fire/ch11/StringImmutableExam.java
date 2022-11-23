package src.fire.ch11;

class StringImmutableExam {
	public static void main(String[] args) {
		// ù��° ���
		String str1 = "sample String";
		String str2 = "sample String";
		
		// �ι�° ���
		String str3 = new String("sample String");
		String str4 = new String("sample String");

		if (str1 == str2)
			System.out.println("str1�� str2�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str1�� str2�� �ٸ� �ν��Ͻ� ����");

		if (str3 == str4)
			System.out.println("str3�� str4�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str3�� str4�� �ٸ� �ν��Ͻ� ����");
		
		/* equals �޼ҵ� */
		if (str3.equals(str4))  // String �ν��Ͻ��� ���ϴ� ���ڿ��� ������ ��
			System.out.println("str3�� str4�� ���ڿ� ������ �����ϴ�.");
		else
			System.out.println("str3�� str4�� ���ڿ� ������ �ٸ��ϴ�.");
	}
	
}
