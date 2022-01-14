package ch22;

/* 제네릭 클래스의 상속 */

class Box<T> {	// 제네릭 클래스 (상위 클래스)
	protected T ob;
	
	public void set(T o) { ob = o;}
	public T get() { return ob;}
}

class SteelBox<T> extends Box<T> {	// 제네릭 클래스 (하위 클래스)
	public SteelBox(T o) {	// 생성자
		ob = o;
	}
}

class Generic_Inheritance {
	public static void main(String[] args) {
		// 상위클래스형(Box<T>) 참조변수가 하위클래스형(SteelBox<T>) 인스턴스 참조 가능
		Box<Integer> iBox = new SteelBox<>(5959);
		Box<String> sBox = new SteelBox<>("simple");
		 
		System.out.println(iBox.get());
		System.out.println(sBox.get());
	}
}
