package ch14;

/* 상위 클래스의 생성자 호출
 * super 키워드를 사용해서 명시적으로 상위클래스를 호출할 수 있다.
 * super는 생성자 내에서만 사용 가능한 키워드이다.
 */

class SuperCls2 {
	// 상위 클래스 생성자 오버로딩
	public SuperCls2() {
		System.out.println("생성자 : SupeCls()");
	}
	
	public SuperCls2(int i) {
		System.out.println("생성자 : SupeCls(int i)");
	}
	
	public SuperCls2(int i, int j) {
		System.out.println("생성자 : SupeCls(int i, int j)");
	}
}


class SubCls2 extends SuperCls2 {
	// 하위 클래스 생성자 오버로딩
	public SubCls2() {
		super(); // 상위 클래스의 생성자를 지정 및 호출
		System.out.println("생성자 : SubCls()");
	}
	
	public SubCls2(int i) {
		super(i); // 상위 클래스의 생성자를 지정 및 호출
		System.out.println("생성자 : SubCls(int i)");
	}
	
	public SubCls2(int i, int j) {
		super(i, j); // 상위 클래스의 생성자를 지정 및 호출
		System.out.println("생성자 : SubCls(int i, int j)");
	}
}


class SuperSubConExam2 {
	public static void main(String[] args) {
		System.out.println("1. ");
		new SubCls2();
		System.out.println();
		
		System.out.println("2. ");
		new SubCls2(1);
		System.out.println();
		
		System.out.println("3. ");
		new SubCls2(1, 2);
		System.out.println();
	}
}
