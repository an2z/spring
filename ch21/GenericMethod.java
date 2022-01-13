package ch21;

/* 제네릭 메소드
 * 클래스 전부가 아닌 일부 메소드에 대해서만 제네릭으로 정의할 수 있으며, 이를 제네릭 메소드라 함
 * 인스턴스 메소드, 클래스 메소드에 대해 모두 제네릭 메소드로 정의 가능하다.
 */

class Box9<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class BoxFactory {
	public static <T> Box9<T> makeBox(T o) {	// 제네릭 메소드 정의
		Box9<T> box = new Box9<T>();	// 상자를 생성
		box.set(o);		// 전달된 인스턴스를 상자에 담아서
		return box;		// 이 상자를 반환한다.

	}
}

class GenericMethod {
	public static void main(String[] args) {
		Box9<String> sBox = BoxFactory.makeBox("sweet");	// 메소드를 호출하는 시점에 타입 결정
		System.out.println(sBox.get());
		
		Box9<Double> dBox = BoxFactory.makeBox(7.59);
		System.out.println(dBox.get());
	}
}