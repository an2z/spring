package src.fire.ch25;

/* Person Ŭ���� ������ Person�� �������� ����, Person�� �ν��Ͻ� ���� ���� */

class Person5 {
	public static final Person5 MAN = new Person5();
	public static final Person5 WOMAN = new Person5();
	
	@Override
	public String toString() {
		return "I am a dog person ��"; // "���� ���� ����ϴ� ����Դϴ�."
	}
}

class InClassInst {
	public static void main(String[] args) {
		System.out.println(Person5.MAN);
		System.out.println(Person5.WOMAN);
	}
}
