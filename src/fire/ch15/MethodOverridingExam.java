package src.fire.ch15;

/* �޼ҵ� �������̵� 
 * �θ�-�ڽ� Ŭ������ ��ȯ��, �޼ҵ� �̸�, �޼ҵ��� �Ű������� ���� �� �޼ҵ� �������̵� ����
 */

class Cake {
	public void yummy() {
		System.out.println("yummy Cake");  // �������̵� ����
	}
}


class CheeseCake extends Cake {
	public void yummy() {
		System.out.println("yummy CheeseCake");  // Cake(�θ� Ŭ����)�� yummy �޼ҵ带 �������̵� ��
	}
}


class MethodOverridingExam {
	public static void main(String[] args) {
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();
		
		c1.yummy(); // Cake�� ���������� ���ؼ��� �������̵� �� CheeseCake�� yummy �޼ҵ带 ȣ��
		c2.yummy(); // CheeseCake�� yummy �޼ҵ带 ȣ��
	}
}
