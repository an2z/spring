package src.fire.ch05;

class ForExam {
	public static void main(String[] args) {
		/* �ݺ��� (while��) */
		int num = 0;
		
		while (num < 5) {
			System.out.println("while �ݺ�: " + num);
			num++;
		}
		
		
		/* �ݺ��� (do ~ while��) */
		num = 0;
		
		do {
			System.out.println("do while �ݺ�: " + num);
			num++;
		} while (num < 5);
		
		
		/* �ݺ��� (for��) */
		for (int i = 0; i < 5; i++)
			System.out.println("for �ݺ�: " + i);
		
		
		/* break�� */
		int a = 1;
		boolean search = false;
		
		// ó�� ������ 5�� ��� ���� 7�� ����� ���� ã�� �ݺ���
		while (a < 100) {
			if (((a % 5) == 0) && ((a % 7) == 0)) {
				search = true;
				break;
			}
			a++;
		}
		if (search)
			System.out.println("ã�� ����: " + a);
		
		
		/* continue�� */
		int b = 0;
		int count = 0;
		
		while (b++ < 100) {
			if(((b % 5) != 0) || ((b % 7) != 0))
				continue;  // 5�� 7�� ����� �ƴ϶�� ������ �����ϰ� ���� �̵�
			count++;                // 5�� 7�� ����� ��츸 ����
			System.out.println(b);  // 5�� 7�� ����� ��츸 ����
		}
		System.out.println("count: " + count);

		
		/* for�� ��ø */
		for (int k = 0; k < 3; k++) {
			System.out.println("--------------------");
			for (int j = 0; j < 3; j++) {
				System.out.print("[" + k + ", " + j + "] ");
			}
			System.out.print('\n');
		}
		
		// ������
		for (int m = 2; m < 10; m++) {
			for (int c = 1; c < 10; c++)
				System.out.println(m + "x" + c + "=" + (m * c)); 
		}
		
	}
}
