package ch21;

/* 제네릭 클래스의 타입 인자 제한 (인터페이스)
 * extends를 사용해 타입 인자를 제한시킬 수 있다.
 */

interface Eatable {
	public String eat();
}

class Apple8 implements Eatable {
	public String toString() {
		return "I am an apple";
	}
	
	@Override
	public String eat() {
		return "It tastes so good";
	}
}

class Box8<T extends Eatable> {	// 타입 인자를 Eatable 인터페이스로 제한
	T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		System.out.println(ob.eat());	// Eatable로 제한했기에 eat메소드 호출 가능
		return ob;
	}
}

class TypeArguLimit_Interface {
	public static void main(String[] args) {
		Box8<Apple8> box = new Box8<>();
		box.set(new Apple8());	// 사과 저장
		
		Apple8 ap = box.get();	// 사과 꺼내기
		System.out.println(ap);
	}
}