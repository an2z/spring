package src.fire.ch04;

class OperatorsExam {
	public static void main(String[] args) {
		/* ���Կ�����, ��������� */
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));  // ����
		System.out.println("num1 - num2 = " + (num1 - num2));  // ����
		System.out.println("num1 * num2 = " + (num1 * num2));  // ����
		System.out.println("num1 / num2 = " + (num1 / num2));  // ������ (��)
		System.out.println("num1 % num2 = " + (num1 % num2));  // ������ (������)
		
		// ����
		System.out.println("num1 + num2 = " + num1 + num2);  // �Ұ�ȣ�� ���� ������ ������ ����
		System.out.println("num1 / num2 = " + (7.0 / 3.0));  // �Ǽ��� ������ -> double�� �������� ����
		
		
		/* ���� ���Կ����� */
		short num = 10;
		num = (short)(num + 77L);  // �� ��ȯ ���ϸ� ���� �߻�
		int rate = 3;
		rate = (int)(rate * 3.5);  // �� ��ȯ ���ϸ� ���� �߻�
		
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77L;   // �� ��ȯ �ʿ����
		rate = 3;
		rate *= 3.5;  // �� ��ȯ �ʿ����
		
		System.out.println(num);
		System.out.println(rate);
		
		
		/* ���� ������ */
		System.out.println("3 >= 2 : " + (3 >= 2));
		System.out.println("3 <= 2 : " + (3 <= 2));
		System.out.println("7.0 == 7 : " + (7.0 == 7));
		System.out.println("7.0 != 7 : " + (7.0 != 7));
		
		
		/* �� ������ */
		int num3 = 11;
		int num4 = 22;
		boolean result;
		
		result = (1 < num3) && (num3 <100);                   // �� AND
		System.out.println("1 �ʰ� 100 �̸��ΰ�? " + result);
		
		result = ((num4 % 2) == 0) || ((num4 % 3) == 0);      // �� OR
		System.out.println("2 �Ǵ� 3�� ����ΰ�? " + result);
		
		result = !(num3 != 0);                                // �� NOT
		System.out.println("0 �ΰ�? " + result);
		
		
		/* �� ������ SCE ���ۿ� */
		int num5 = 0;
		int num6 = 0;
		boolean result2;
		
		result2 = ((num5 += 10) < 0) && ((num6 += 10) > 0);
		System.out.println("result2 = " + result2);
		System.out.println("num5 = " + num5);
		System.out.println("num6 = " + num6);  // num6 += 10 ������
		
		result2 = ((num5 += 10) > 0) || ((num6 += 10) > 0);
		System.out.println("resutl2 = " + result2);
		System.out.println("num5 = " + num5);
		System.out.println("num6 = " + num6);  // num6 += 10 ������
		
		// �ڵ� ����
		num5 += 10;
		num6 += 10;
		
		result2 = (num5 < 0) && (num6 > 0);
		System.out.println("result2 = " + result2);
		System.out.println("num5 = " + num5);
		System.out.println("num6 = " + num6);
		
		result2 = (num5 > 0) || (num6 > 0);
		System.out.println("result2 = " + result2);
		System.out.println("num5 = " + num5);
		System.out.println("num6 = " + num6);
		
		
		/* ��ȣ ������ */
		short num7 = 5;
		System.out.println(+num7);    // ���� ��ȣ
		System.out.println(-num7);    // ���� ��ȣ
		
		short num8 = (short)(-num7);  // �� ��ȯ ���ϸ� ���� �߻�
		System.out.println(num8);
		
		
		/* ����,���� ������ */
		// prefix
		int num9 = 7;		
		System.out.println(++num9);  // ���� �����ǰ� ���
		System.out.println(--num9);  // ���� ���ҵǰ� ���
		
		// postfix
		int num10 = 5;
		System.out.print(num10++);   // ��� �Ŀ� ���� ����
		System.out.print(num10++);
		System.out.print(num10 + "\n");
		
		System.out.print(num10--);   // ��� �Ŀ� ���� ����
		System.out.print(num10--);
		System.out.print(num10 + "\n");
	}

}
