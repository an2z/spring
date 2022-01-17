package ch22;

/* 와일드 카드 (상한,하한 제한 적용 전) */

class Box6<T> {
	private T ob;	
	public void set(T o) { ob = o;}
	public T get() { return ob;}
}

class Toy {
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

class BoxHandler {
	// 상자에서 물건을 꺼내는 메소드
	public static void outBox(Box6<Toy> box) {
		Toy t = box.get();    // 상자에서 꺼내기
//		box.set(new Toy());   // 꺼내는 기능의 메소드로 구현했지만, 넣는 것도 가능한 상황 
		System.out.println(t);
	}
	
	// 상자에 물건을 넣는 메소드
	public static void inBox(Box6<Toy> box, Toy n) {
		box.set(n); 		  // 상자에 넣기
//		Toy toy = box.get();  // 넣는 기능의 메소드로 구현했지만, 꺼내기도 가능한 상황
	}
}

class Wildcard_BoundedBase {
	public static void main(String[] args) {
		Box6<Toy> box = new Box6<>();
		BoxHandler.inBox(box, new Toy());  // 상자에 넣기
		BoxHandler.outBox(box);  		   // 상자에서 꺼내기
	}
}