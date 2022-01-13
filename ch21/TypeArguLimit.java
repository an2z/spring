package ch21;

/* 제네릭 클래스의 타입 인자 제한 (클래스)
 * extends를 사용해 타입 인자를 제한시킬 수 있다.
 */

class Box7<T extends Number> {	// Number 또는 이를 상속하는 클래스만 T로 올 수 있음
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class TypeArguLimit {
	public static void main(String[] args) {
		Box7<Integer> iBox = new Box7<>();	// Integer는 Number를 상속
		iBox.set(24);
		
		Box7<Double> dBox = new Box7<>();	// Double은 Number를 상속
		dBox.set(5.97);
		
		System.out.println(iBox.get());
		System.out.println(dBox.get());
	}
}