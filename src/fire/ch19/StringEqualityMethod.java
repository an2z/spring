package src.fire.ch19;

/* String Ŭ������ Equals �޼ҵ�
 * ==�����ڴ� ���������� �������� ��
 * equals�޼ҵ�� �ν��Ͻ��� ������ �� 
 */

class StringEqualityMethod {
	public static void main(String[] args) {
		String str1 = new String("Simple");
		String str2 = new String("Simple");
		
		// ���� ���� ��
		if (str1 == str2)
			System.out.println("str1, str2 ���� ���� ����");
		else
			System.out.println("str1, str2 ���� ���� �ٸ�");
		
		// �� �ν��Ͻ��� ������ ��
		if (str1.equals(str2))
			System.out.println("str1, str2 ������ ����");
		else
			System.out.println("str1, str2 ������ �ٸ�");
	}
}
