package ch09;

public class Circle {
	public static void main(String[] args) {
		CircleArea c = new CircleArea(1.5);
		System.out.println(c.getArea());
		
		c.setRad(2.5);
		System.out.println(c.getArea());
		c.setRad(-3.3);
		System.out.println(c.getArea());
		
		/*
		 * 정보 은닉 전 -> 반지름은 음수가 될 수 없는 논리적 오류가 있음에도 컴파일 오류가 발생하지 않음 
		 * 정보 은닉 후 -> 외부에서 rad변수로의 접근이 불가능하기 때문에 컴파일 오류 발생
		 */
//		c.rad = -4.5;
		System.out.println(c.getArea());
	}
}


class CircleArea {
	/* 정보 은닉 전 */
//	double rad = 0;
	/* 정보 은닉 후 */
	private double rad = 0;  // 반지름
	
	final double PI = 3.14;	
	
	/* 생성자 */
	public CircleArea(double r) {
		setRad(r);
	}
	
	/* setter -> 인스턴스 변수(반지름) 세팅 */
	// 이 메소드를 통해 안정성이 증가 !
	public void setRad(double r) {
		if (r < 0) {  // 반지름이 0보다 작을 경우(잘못된 값)
			rad = 0;  // 그냥 0으로 세팅
			return;
		}
		rad = r;
	}
	
	/* 원의 넓이 구하기 */
	public double getArea() {
		return (rad * rad) * PI;
	}
}
