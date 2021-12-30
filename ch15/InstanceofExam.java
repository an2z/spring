package ch15;

class Cake3 {
}
class CheeseCake3 extends Cake3 {
}
class StrawberryCheeseCake3 extends CheeseCake3 {	
}


class InstanceofExam {
	public static void main(String[] args) {
		Cake3 cake = new StrawberryCheeseCake3();
		
		/* instanseof 연산자
		 * 참조변수가 참조하는 인스턴스의 클래스나 참조하는 인스턴스가 상속하는 클래스를 묻는 연산자
		 * true or false를 반환 
		 */
		if (cake instanceof Cake3) {
			System.out.println("케익 인스턴스 or");
			System.out.println("케익 상속하는 인스턴스 \n");
		}
		
		if (cake instanceof CheeseCake3) {
			System.out.println("치즈케익 인스턴스 or");
			System.out.println("치즈케익 상속하는 인스턴스 \n");
		}
		
		if (cake instanceof StrawberryCheeseCake3) {
			System.out.println("딸기치즈케익 인스턴스 or");
			System.out.println("딸기치즈케익 상속하는 인스턴스");
		}

	}
}
