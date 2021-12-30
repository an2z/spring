package ch14;

/* 상위 클래스의 생성자 호출
 * 하위 클래스 생성자에서는 반드시 부모 클래스의 생성자를 호출하도록 되어 있다.
 * 하위 클래스의 인스턴스 생성 시 상위 클래스 생성자가 먼저 호출되고 하위클래스의 생성자가 호출된다.
 * 하위 클래스 생성자에 상위 클래스 생성자를 호출하는 과정이 없어도 컴파일러가 자동으로 호출한다.
 */

class SperCls {
	public SperCls() { // 상위 클래스 생성자
		System.out.println("I'm Super Class");
	}
}


class SubCls extends SperCls {
	public SubCls() { // 하위 클래스 생성자
		System.out.println("I'm Sub Class");
	}
}


class SuperSubConExam {
	public static void main(String[] args) {
		new SubCls(); // 하위 클래스의 인스턴스 생성
	}
}
