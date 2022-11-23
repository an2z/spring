package src.fire.ch25;

/* Ŭ���� �� ������ ���� 
 * Ŭ���� ���� �������� ���ǵǸ� ������ ������ �ش� Ŭ���� �������� ��� �����ϴ�.
 */

class Customer {
	enum Gender { // Ŭ���� ���� ���ǵ� ������ Gender
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
