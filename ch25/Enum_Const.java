package ch25;

/* 열거형 값이 인스턴스라는 증거1 */

enum Person3 {
	MAN, WOMAN;
	
	@Override
	public String toString() {
		return "I am a dog person ♡"; // "나는 개를 사랑하는 사람입니다."
	}
}

class Enum_Const {
	public static void main(String[] args) {
		System.out.println(Person3.MAN);   // toString 메소드의 반환 값 출력
		System.out.println(Person3.WOMAN); // toString 메소드의 반환 값 출력
	}
}