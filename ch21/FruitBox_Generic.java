package ch21;

/* 제네릭 이후 코드
 * 제네릭을 사용하면 컴파일 시에 미리 타입이 정해지므로,
 * 타입 검사나 타입 변환과 같은 번거로운 작업을 생략할 수 있게 된다.
 * */

class Apple3 {
	public String toString() {
		return "I am an apple";
	}
}

class Orange3 {
	public String toString() {
		return "I am an arange";
	}
}

// 제네릭 기반의 코드
class Box3<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class FruitBox_Generic {
	public static void main(String[] args) {
		Box3<Apple3> aBox = new Box3<Apple3>();		// T를 Apple로 결정
		Box3<Orange3> oBox = new Box3<Orange3>();	// T를 Orange로 결정
			
		aBox.set(new Apple3());		// 사과를 상자에 담는다
		oBox.set(new Orange3());	// 오렌지를 상자에 담는다
		
		Apple3 ap = aBox.get();		// 사과를 꺼내는데 형 변환이 필요 없다
		Orange3 or = oBox.get();	// 오렌지를 꺼내는데 형 변환이 필요 없다
		
		System.out.println(ap);
		System.out.println(or);
	}
}