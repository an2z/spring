package ch25;

/* 인자를 전달받는 열거형 생성자 정의 */

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