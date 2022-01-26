package ch25;

/* 열거형 값이 인스턴스라는 증거2 */

enum Person4 {
	MAN, WOMAN;
	
	private Person4() { // 생성자 정의
		System.out.println("Person constructor called");
	}
	
	@Override
	public String toString() {
		return "I am a dog person ♡"; // "나는 개를 사랑하는 사람입니다."
	}
}

class Enum_Constructor {
	public static void main(String[] args) {
		System.out.println(Person4.MAN);   // toString 메소드의 반환 값 출력
		System.out.println(Person4.WOMAN); // toString 메소드의 반환 값 출력
	}
}