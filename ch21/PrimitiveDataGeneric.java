package ch21;

/* 제네릭 클래스의 기본자료형 제한
 * 제네릭 클래스에 대하여 매개변수화 타입을 구성할때 기본 자료형의 이름은 타입인자로 쓸 수 없다.
 * 이때는 기본 자료형에 대한 레퍼 클래스를 사용해야만 한다.
 */

class Box5<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class PrimitiveDataGeneric {
	public static void main(String[] args) {
		Box5<Integer> iBox = new Box5<Integer>();
		iBox.set(125);			// 오토 박싱 진행
		int num = iBox.get();	// 오토 언박싱 진행
		System.out.println(num);
	}
}