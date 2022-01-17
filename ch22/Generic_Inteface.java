package ch22;

/* 제네릭 인터페이스 */

interface Getable<T> {
	public T get();
}

// 인터페이스 Getable<T>를 구현하는 Box<T> 클래스
class Box10<T> implements Getable<T> {
	private T ob;
	public void set(T o) { ob = o; }
	
	@Override
	public T get() {
		return ob;
	}
}

class Toy10 {
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

class Generic_Inteface {
	public static void main(String[] args) {
		Box10<Toy10> box = new Box10<>();
		box.set(new Toy10());
		
		// Box<T>가 Getable<T>를 구현하므로 참조 가능
		Getable<Toy10> gt = box;
		System.out.println(gt.get());
	}
}