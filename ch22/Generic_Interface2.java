package ch22;

/* 제네릭 인터페이스
 * 제네릭 인터페이스를 구현할 때는 T를 결정한 상태로 구현할 수도 있다. 
 */

interface Getable11<T> {
	public T get();
}

class Box11<T> implements Getable11<String> {
	private T ob;
	public void set(T o) { ob = o; }
	
	@Override
	public String get() {
		return ob.toString();
	}
}

class Toy11 {
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

class Generic_Interface2 {
	public static void main(String[] args) {
		Box11<Toy11> box = new Box11<>();
		box.set(new Toy11());
		
		Getable11<String> gt = box;
		System.out.println(gt.get());
	}
}