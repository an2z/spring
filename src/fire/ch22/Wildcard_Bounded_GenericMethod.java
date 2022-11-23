package src.fire.ch22;

/* ���ѵ� ���ϵ� ī�� ������ ���� ���׸� �޼ҵ� */

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
	// ���ڿ��� ������ ������ �޼ҵ�
	public static <T> void outBox(Box9<? extends T> box) {
		T t = box.get(); // ���ڿ��� ������
		System.out.println(t);
	}
	
	// ���ڿ� ������ �ִ� �޼ҵ�
	public static <T> void inBox(Box9<? super T> box, T n) {
		box.set(n); // ���ڿ� �ֱ�
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
