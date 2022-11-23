package src.fire.ch22;

/* ���׸� �������̽� */

interface Getable<T> {
	public T get();
}

// �������̽� Getable<T>�� �����ϴ� Box<T> Ŭ����
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
		
		// Box<T>�� Getable<T>�� �����ϹǷ� ���� ����
		Getable<Toy10> gt = box;
		System.out.println(gt.get());
	}
}
