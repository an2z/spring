package ch15;


class Cake2 {
	public void yummy() {
		System.out.println("yummy Cake");
	}
}


class CheeseCake2 extends Cake2 {
	public void yummy() {
		super.yummy();  // Cake2의 오버라이딩 된 yummy 메소드 호출
		System.out.println("yummy CheeseCake");
	}
	
	public void tasty() {
		super.yummy();  // Cake2의 오버라이딩 된 yummy 메소드 호출
		System.out.println("testy CheeseCake");
	}
}


class MethodOverridingSuperExam {
	public static void main(String[] args) {
		CheeseCake2 c = new CheeseCake2();
		
		c.yummy();
		c.tasty(); 
	}
}