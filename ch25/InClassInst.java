package ch25;

/* Person 클래스 내에서 Person형 참조변수 선언, Person형 인스턴스 생성 가능 */

class Person5 {
	public static final Person5 MAN = new Person5();
	public static final Person5 WOMAN = new Person5();
	
	@Override
	public String toString() {
		return "I am a dog person ♡"; // "나는 개를 사랑하는 사람입니다."
	}
}

class InClassInst {
	public static void main(String[] args) {
		System.out.println(Person5.MAN);
		System.out.println(Person5.WOMAN);
	}
}