package src.fire.ch25;

/* ������ ���� �ν��Ͻ���� ����2 */

enum Person4 {
	MAN, WOMAN;
	
	private Person4() { // ������ ����
		System.out.println("Person constructor called");
	}
	
	@Override
	public String toString() {
		return "I am a dog person ��"; // "���� ���� ����ϴ� ����Դϴ�."
	}
}

class Enum_Constructor {
	public static void main(String[] args) {
		System.out.println(Person4.MAN);   // toString �޼ҵ��� ��ȯ �� ���
		System.out.println(Person4.WOMAN); // toString �޼ҵ��� ��ȯ �� ���
	}
}
