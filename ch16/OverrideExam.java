package ch16;

/* 어노테이션 @Override 
 * 상위 클래스의 메소드를 오버라이딩 할 목적으로 정의한다는 것을
 * 컴파일러에게 알려주는 일종의 메모이다. 
 */

class ParentAdder {
	public int add(int a, int b) {
		return a + b;
	}
}

class CildAdder extends ParentAdder {
	// 상위 클래스의 add를 오버라이딩
	@Override
//	public double add(double a, double b) { // 오버라이딩 된 메소드 반환형이 서로 다르기 때문에 오류메세지 전달
	public int add(int a, int b) {
		System.out.println("덧셈을 진행합니다.");
		return a + b;
	}
}

class OverrideExam {
	public static void main(String[] args) {
		ParentAdder adder = new CildAdder();
		System.out.println(adder.add(3, 4));
	}

}
