package src.fire.ch22;

/* ���ϵ� ī�� (����,���� ����) */

class Box8<T> {
	private T ob;	
	public void set(T o) { ob = o;}
	public T get() { return ob;}
}


class Toy8 {
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

class BoxContentsMover {
	// from�� ����� ���빰�� to�� �̵��ϴ� �޼ҵ�
	public static void moveBox(Box8<? super Toy8> to, Box8<? extends Toy8> from) {
		to.set(from.get());
	}
}

class Wildcard_BoundedExam {
	public static void main(String[] args) {
		Box8<Toy8> box1 = new Box8<>();
		box1.set(new Toy8());
		
		Box8<Toy8> box2 = new Box8<>();
		
		// box1�� ����� ���빰 box2�� �̵�
		BoxContentsMover.moveBox(box2, box1);
		System.out.println(box2.get());
	}
}
