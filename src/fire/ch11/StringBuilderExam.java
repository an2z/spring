package src.fire.ch11;

/* StringBuilder Ŭ������ �޼ҵ� */
class StringBuilderExam {
	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("123");  // ���ڿ� "123"�� ����� �ν��Ͻ� ����
		
		stb.append(45678); // ���ڿ� �����̱�
		System.out.println(stb.toString());
		
		stb.delete(0, 2);  // ���ڿ� �Ϻ�(0���� 1����) ����
		System.out.println(stb.toString());
		
		stb.reverse();  // ���ڿ� ���� ������
		System.out.println(stb.toString());
		
		String sub = stb.substring(2, 4);
		System.out.println(sub);
	}

}

