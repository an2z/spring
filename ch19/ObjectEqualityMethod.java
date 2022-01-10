package ch19;

/* object클래스의 메소드 (Equals)
 * 인스턴스의 내용 비교를 위한 기능을 equals 메소드에 담아 정의
 */

class Inum {
	private int num;
	
	public Inum(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((Inum)obj).num)
			return true;
		else
			return false;
	}
}

class ObjectEqualityMethod {
	public static void main(String[] args) {
		Inum num1 = new Inum(10);
		Inum num2 = new Inum(15);
		Inum num3 = new Inum(10);
		
		if (num1.equals(num2))
			System.out.println("num1, num2 내용이 동일합니다.");
		else
			System.out.println("num1, num2 내용이 다릅니다.");
		
		if (num1.equals(num3))
			System.out.println("num1. num2 내용이 동일합니다.");
		else
			System.out.println("num1, num3 내용이 다릅니다.");
	}
}
