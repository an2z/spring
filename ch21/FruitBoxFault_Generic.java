package ch21;

/* 제네릭 이후 코드
 * 실수가 컴파일 과정에서 드러난다.
 */

class Apple4 {
	public String toString() {
		return "I am an apple";
	}
}

class Orange4 {
	public String toString() {
		return "I am an arange";
	}
}

class Box4<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class FruitBoxFault_Generic {
	public static void main(String[] args) {
		Box4<Apple4> aBox = new Box4<Apple4>();
		Box4<Orange4> oBox = new Box4<Orange4>();
			
		aBox.set("Apple");	// 프로그래머의 실수가 컴파일 오류로 이어짐
		oBox.set("Orange");	// 프로그래머의 실수가 컴파일 오류로 이어짐
		
		Apple4 ap = aBox.get();
		Orange4 or = oBox.get();
		
		System.out.println(ap);
		System.out.println(or);
	}
}