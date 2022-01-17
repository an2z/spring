package ch22;

/* 와일드 카드 (하한 제한) */

class Box5<T> {
	private T ob;	
	public void set(T o) { ob = o;}
	public T get() { return ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class Unboxer5 {
	// Integer 또는 Integer가 상속하는 부모클래스만이 전달되도록 제한
	public static void peekBox(Box5<? super Integer> box) {
		System.out.println(box);
	}
}

class Wildcard_LowerBounded {
	public static void main(String[] args) {
		Box5<Integer> iBox = new Box5<>();
		iBox.set(1234);
		
		Box5<Number> nBox = new Box5<>();
		nBox.set(9955);
		
		Box5<Object> oBox = new Box5<>();
		oBox.set("My simple Instance");
		
		Box5<Double> dBox = new Box5<>();
		dBox.set(10.09);
				
		Unboxer5.peekBox(iBox);
		Unboxer5.peekBox(nBox);
		Unboxer5.peekBox(oBox);
//		Unboxer5.peekBox(dBox);  // Integer가 상속하는 부모클래스가 아니므로 컴파일에러 발생
	}
}