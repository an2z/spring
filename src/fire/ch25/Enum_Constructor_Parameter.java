package src.fire.ch25;

/* ���ڸ� ���޹޴� ������ ������ ���� */

enum Person6 {
	MAN(29), WOMAN(25);

	int age;

	private Person6(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "I am " + age + " years old";
	}
}

class Enum_Constructor_Parameter {
	public static void main(String[] args) {
		System.out.println(Person6.MAN);
		System.out.println(Person6.WOMAN);
	}
}
