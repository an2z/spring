package src.fire.ch25;

/* ������ ���� �ν��Ͻ���� ����1 */

enum Person3 {
	MAN, WOMAN;
	
	@Override
	public String toString() {
		return "I am a dog person ��"; // "���� ���� ����ϴ� ����Դϴ�."
	}
}

class Enum_Const {
	public static void main(String[] args) {
		System.out.println(Person3.MAN);   // toString �޼ҵ��� ��ȯ �� ���
		System.out.println(Person3.WOMAN); // toString �޼ҵ��� ��ȯ �� ���
	}
}
