package src.fire.ch06;

public class MethodExam {
	public static void main(String[] args) {
		/* �޼ҵ� ȣ�� */
		one(12);  // 12�� �����ϸ� one�޼ҵ� ȣ��
		one(13);  // 13�� �����ϸ� one�޼ҵ� ȣ��
		two(25, 159.2);  // 25�� 160�� �����ϸ� two�޼ҵ� ȣ��
		three();
		
		int result;
		result = sum(4,5);
		System.out.println("4 + 5 = " + result);
		System.out.println("���α׷��� ��");
		
		
		/* ���� ���� */
		boolean ste = true;
		int num1 = 11;
		
		if (ste) {
			// int num1 = 22;  // �ּ������� ������ ���� �߻� -> ���� ���� ������ ������ ���� ���� �Ұ�
			num1++;
			System.out.println("num1: " + num1);
		}
		
		{
			int num2 = 33;
			num2++;
			System.out.println("num2: " + num2);
		}
	// System.out.println(num2);  // �ּ������� ������ ���� �߻� -> �ش� ���� �������� ���� ����
		
		
		System.out.println("3 factorial: " + factorial(3));  // ����Լ� ȣ��
	}
	
	
	/* �޼ҵ� ���� */
	static void one(int num) {  // �Ű������� �ϳ��� �޼ҵ� ����
		
		System.out.println("hi");
		System.out.println(num + "�� ���޹޾Ҿ��.");
	}
	
	
	static void two(int age, double height) {  // �Ű������� ���� �޼ҵ� ����
		System.out.println("�� ���̴�" + age + "�� �Դϴ�.");
		System.out.println("�� Ű��" + height + "cm �Դϴ�.");
	}
	
	
	static void three() {  // �Ű������� �������� �ʴ� �޼ҵ� ����
		System.out.println("�Ű������� �����ϴ�.");
	}

	
	/* ���� ��ȯ Ÿ�Կ� ���� �޼ҵ� */
	static int sum(int num1, int num2) {
		int sumresult = num1 + num2;
		return sumresult;  // int�� ���� ���� sumresult�� main �޼ҵ忡 ��ȯ		
	}
	
	
	/* ��� �Լ� */
	static int factorial(int n) {
		if (n==1)
			return 1;
		else
			return n * factorial(n-1);
	}

}


