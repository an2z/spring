package ch26;

/* 멤버 클래스
 * 인스턴스 변수, 인스턴스 메소드와 동일한 위치에 정의되는 클래스 
 */

class Outer2 {
	private int num =0; // 인스턴스 변수
	
	class Member { // 멤버 클래스 정의
		void add(int n) { num += n; } 
		int get() { return num; }
	}
}

class InnerClass_Member {
	public static void main(String[] args) {
		Outer2 o1 = new Outer2();
		Outer2 o2 = new Outer2();
		
		// o1 기반으로 멤버 클래스 인스턴스 생성
		Outer2.Member o1m1 = o1.new Member();
		Outer2.Member o1m2 = o1.new Member();
		
		
		// o2 기반으로 멤버 클래스 인스턴스 생성
		Outer2.Member o2m1 = o2.new Member();
		Outer2.Member o2m2 = o2.new Member();
		
		// o1 기반으로 생성된 인스턴스 메소드 호출
		o1m1.add(5);
		System.out.println(o1m2.get());
		
		// o2 기반으로 생성된 인스턴스 메소드 호출
		o2m1.add(7);
		System.out.println(o2m2.get());
	}
}