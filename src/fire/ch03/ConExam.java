package src.fire.ch03;

class ConExam {
	public static void main(String[] args) {
		/* ������ ��� ǥ�� */ 
		int num1 = 123;      // 10���� ǥ��
		int num2 = 0123;     // 8���� ǥ��
		int num3 = 0x123;    // 16���� ǥ��
		int num4 = 0b111;	 // 2���� ǥ��
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		System.out.println("num4: " + num4);		
		System.out.println(3147483647l + 3147483647l);  // long�� ���� ����
		
		
		/* �Ǽ��� ��� ǥ�� */
		double pi = 3.1415;   // double�� ǥ��
		
		System.out.println(3.0004999 + 2.0004999);     // double�� �Ǽ� ����	
		System.out.println(3.00004999f + 2.0004999f);  // float�� �Ǽ� ���� -> ���е� ������
		
		
		/* ������ ��� ǥ�� (�̽������� ������) */
		System.out.println("ab" + '\b' + "c");
		System.out.println("ab" + '\t' + "c");
		System.out.println("ab" + '\n' + "c");
		System.out.println("ab" + '\r' + "c");  
	}

}
