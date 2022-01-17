package ch22;

/* 와일드 카드 (상한,하한 제한 적용 후) 
 * extends로 상한 제한을 두면 넣는 것(set) 불가
 * super로 하한 제한을 두면 꺼내는 것(get) 불가
 */

class Box7<T> {
	private T ob;	
	public void set(T o) { ob = o;}
	public T get() { return ob;}
}

class Toy7 {
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

class BoxHandler7 {
	// 상자에서 물건을 꺼내는 메소드
	public static void outBox(Box7<? extends Toy7> box) {
		Toy7 t = box.get();    // 상자에서 꺼내기
//		box.set(new Toy7());   // 넣으려 하면 컴파일 오류 발생
		System.out.println(t);
	}
	
	// 상자에 물건을 넣는 메소드
	public static void inBox(Box7<? super Toy7> box, Toy7 n) {
		box.set(n); 		   // 상자에 넣기
//		Toy7 toy = box.get();  // 꺼내려 하면 컴파일 오류 발생
	}
}

class Wildcard_BoundedUsage {
	public static void main(String[] args) {
		Box7<Toy7> box = new Box7<>();
		BoxHandler7.inBox(box, new Toy7());  // 상자에 넣기
		BoxHandler7.outBox(box); 			 // 상자에서 꺼내기
	}
}