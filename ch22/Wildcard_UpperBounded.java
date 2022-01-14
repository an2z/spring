package ch22;

/* 와일드 카드 (상한 제한) */

class Box4<T> {
	protected T ob;	
	public void set(T o) { ob = o;}
	public T get() { return ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class Unboxer4 {
	// Number 또는 이를 상속하는 하위 클래스인 제네릭 타입의 인스턴스만 전달되도록 제한
	public static void peekBox(Box4<? extends Number> box) {
		System.out.println(box);
	}
}
	
class Wildcard_UpperBounded {
	public static void main(String[] args) {
		Box4<Integer> iBox = new Box4<>();
		iBox.set(1234);
		
		Box4<Double> dBox = new Box4<>();
		dBox.set(10.09);
		
		Unboxer4.peekBox(iBox);
		Unboxer4.peekBox(dBox);
	}
}