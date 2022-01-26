package ch25;

/* 클래스 내 열거형 정의 
 * 클래스 내에 열거형이 정의되면 열거형 값들은 해당 클래스 내에서만 사용 가능하다.
 */

class Customer {
	enum Gender { // 클래스 내에 정의된 열거형 Gender
		MALE, FEMALE
	}

	private String name;
	private Gender gen;

	Customer(String n, String g) {
		name = n;

		if (g.equals("man"))
			gen = Gender.MALE;
		else
			gen = Gender.FEMALE;
	}
	
	@Override
	public String toString() {
		if(gen == Gender.MALE)
			return "Thank you, Mr " + name;
		else
			return "Thank you, Mrs " + name;
	}
}

class Enum_ClassInner {
	public static void main(String[] args) {
		Customer cus1 = new Customer("wuga", "man");
		Customer cus2 = new Customer("jeong", "woman");
		
		System.out.println(cus1);
		System.out.println(cus2);
	}
}