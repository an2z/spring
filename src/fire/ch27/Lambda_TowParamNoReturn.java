package src.fire.ch27;

/* ���� ǥ���� (�Ű����� o, ��ȯ x) 
 * �Ű������� 2�� �̻��� ��� �Ұ�ȣ�� �����ش�. 
 */

interface Calculate {
	void cal(int a, int b); // �Ű����� ��, ��ȯ�� void
}

class Lambda_TowParamNoReturn {
	public static void main(String[] args) {
		Calculate c;

		c = (a, b) -> System.out.println(a + b); // ���� ����
		c.cal(4, 3);

		c = (a, b) -> System.out.println(a - b); // ���� ����
		c.cal(4, 3);
	}
}
