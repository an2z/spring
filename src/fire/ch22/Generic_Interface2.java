package src.fire.ch22;

/* ���׸� �������̽�
 * ���׸� �������̽��� ������ ���� T�� ������ ���·� ������ ���� �ִ�. 
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
