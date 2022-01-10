package ch19;

/* object클래스의 메소드 (finalize)
 * 아무도 참조하지 않는 인스턴스가 가비지 컬렉션에 의해 소멸되기 전 자동으로 호출되는 메소드
 * 인스턴스 소멸 시 반드시 실행해야 할 코드가 있다면 이 메소드를 오버라이딩 해서 실행 할 수 있음
 */

class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	// finalize 메소드 오버라이딩
	@Override	
	protected void finalize() throws Throwable {	
		super.finalize();  // 상위 클래스의 finalize 메소드 호출
		System.out.println("소멸 : " + name);
	}
}

class ObjectFinalizeMethod {
	public static void main(String[] args) {
		Person p1 = new Person("anne");
		Person p2 = new Person("wuga");
		p1 = null;	// 참조대상을 가비지 컬렉션의 대상으로 만듦
		p2 = null;	// 참조대상을 가비지 컬렉션의 대상으로 만듦
		
		/* finalize 메소드의 호출을 어느정도 보장하게 하는 메소드 호출 
		 * 가상머신은 매우 합리적인 방법으로 가비지 컬렉션을 수행하므로,
		 * 특별한 상황이 아니라면 가비지 컬렉션 동작에 영향을 미치는 호출을 삼가하는 것이 좋다 
		 */
		System.gc();				// 가비지 컬렉션의 수행을 요청 (명령이 아닌 요청)
		System.runFinalization();	// 소멸이 보류된 인스턴스의 finalize 메소드 호출을 요청 (명령이 아닌 요청)
		
		System.out.println("프로그램 종료");
	}
}
