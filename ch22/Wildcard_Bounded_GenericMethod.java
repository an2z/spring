package ch22;

/* 제한된 와일드 카드 선언을 갖는 제네릭 메소드 */

class Box9<T> {
	private T ob;	
	public void set(T o) { ob = o;}
	public T get() { return ob;}
}

class Toy9 {
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

class Robot {
	@Override
	public String toString() {
		return "I am a Robot";
	}
}

class BoxHandler9 {
	// 상자에서 물건을 꺼내는 메소드
	public static <T> void outBox(Box9<? extends T> box) {
		T t = box.get(); // 상자에서 꺼내기
		System.out.println(t);
	}
	
	// 상자에 물건을 넣는 메소드
	public static <T> void inBox(Box9<? super T> box, T n) {
		box.set(n); // 상자에 넣기
	}
}

class Wildcard_Bounded_GenericMethod {
	public static void main(String[] args) {
		Box9<Toy9> tBox = new Box9<>();
		BoxHandler9.inBox(tBox, new Toy9());
		BoxHandler9.outBox(tBox);
		
		Box9<Robot> rBox = new Box9<>();
		BoxHandler9.inBox(rBox, new Robot());
		BoxHandler9.outBox(rBox);
	}
}