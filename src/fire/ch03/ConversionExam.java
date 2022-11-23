package src.fire.ch03;

class ConversionExam {
	public static void main(String[] args) {
		/* �ڵ� �� ��ȯ */
		int num1 = 50;
		long num2 = 3147483647l;
		System.out.println(num1 + num2);  // �� �ǿ������� �ڷ����� �ٸ�
		
		
		/* ����� �� ��ȯ */
		double pi = 3.1415;
		int wholenumber = (int)pi;  // pi ���� int������ ����� �� ��ȯ
	}

}
