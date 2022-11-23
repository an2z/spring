package src.fire.ch16;

/* Object Ŭ������ toString �޼ҵ� */

class Cake {
	// Object Ŭ������ toString �޼ҵ带 �������̵�
	public String toString() {
		// Object Ŭ������ toString �޼ҵ� ȣ���Ͽ� ��ȯ ��� ���
		System.out.println(super.toString());
		return "My birthday cake";
	}
}

class CheeseCake extends Cake {
	// Cake Ŭ������ toString �޼ҵ带 ��������¡
	public String toString() {
		return "My birthday cheese cake";
	}
}

class OverridingToStringExam {
	public static void main(String[] args) {
		Cake c1 = new Cake();
		Cake c2 = new CheeseCake();

		// c1�� �����ϴ� �ν��Ͻ��� toString �޼ҵ� ȣ��� �̾���
		System.out.println(c1);
		System.out.println();

		// c2�� �����ϴ� �ν��Ͻ��� toString �޼ҵ� ȣ��� �̾���
		System.out.println(c2);
	}
}
