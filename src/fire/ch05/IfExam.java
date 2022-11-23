package src.fire.ch05;

class IfExam {
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 7;
		
		/* ���ǹ� (if) */
		if(n1 < n2) {
			System.out.println("n1 < n2 is true");
		}		
		if (n1 < n2)  // �߰�ȣ ���� ����
			System.out.println("n1 < n2 is true");
		
		/* ���ǹ� (if ~ else) */
		if (n1 == n2) {
			System.out.println("n1 == n2 is true");
		} else {
			System.out.println("n1 == n2 is false");
		}
		
		/* ���ǹ� (if ~ else if ~ else) */
		if (n1 > n2)                                // ���� �˻�
			System.out.println("n1 > n2 is true");
		else if (n1 == n2)                          // �� ������ �������� ������ ���⼭ �ٽ� �˻�
			System.out.println("n1 == n2 is true");
		else                                        // �ƹ��͵� �������� ������ else ����
			System.out.println("n2 < n1 is true");
		
		
		/* ���� ������ (���� ������) */
		int num1 = 50;
		int num2 = 100;
		int big;
		int diff;
		
		big = (num1 > num2) ? num1 : num2;
		System.out.println("ū ��: " + big);
		
		diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		System.out.println("���밪: " + diff);
		
		
		/* switch�� */
		int n = 3;
		
		switch(n) {  // case -> ���̺�(å����) ����
		case 1:
			System.out.println("simple java");
		case 2:
			System.out.println("funny java");
		case 3:
			System.out.println("fantastic java");
		default:
			System.out.println("the best programming language");
		}
		
		// switch + break��
		switch(n) {
		case 1: 
			System.out.println("simple java");
			break;
		case 2:
			System.out.println("funny java");
			break;
		case 3:
			System.out.println("fantastic java");
			break;
		default:
			System.out.println("the best programming language");
		}
		System.out.println("do you like java");
	}

}
