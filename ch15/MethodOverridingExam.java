package ch15;

/* 메소드 오버라이딩 
 * 부모-자식 클래스의 반환형, 메소드 이름, 메소드의 매개변수가 같을 때 메소드 오버라이딩 성립
 */

class Cake {
	public void yummy() {
		System.out.println("yummy Cake");  // 오버라이딩 당함
	}
}


class CheeseCake extends Cake {
	public void yummy() {
		System.out.println("yummy CheeseCake");  // Cake(부모 클래스)의 yummy 메소드를 오버라이딩 함
	}
}


class MethodOverridingExam {
	public static void main(String[] args) {
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();
		
		c1.yummy(); // Cake형 참조변수를 통해서도 오버라이딩 한 CheeseCake의 yummy 메소드를 호출
		c2.yummy(); // CheeseCake의 yummy 메소드를 호출
	}
}
