package src.fire.ch22;

/* ���ϵ� ī�� (����,���� ���� ���� ��) */

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
	// ���ڿ��� ������ ������ �޼ҵ�
	public static void outBox(Box6<Toy> box) {
		Toy t = box.get();    // ���ڿ��� ������
//		box.set(new Toy());   // ������ ����� �޼ҵ�� ����������, �ִ� �͵� ������ ��Ȳ 
		System.out.println(t);
	}
	
	// ���ڿ� ������ �ִ� �޼ҵ�
	public static void inBox(Box6<Toy> box, Toy n) {
		box.set(n); 		  // ���ڿ� �ֱ�
//		Toy toy = box.get();  // �ִ� ����� �޼ҵ�� ����������, �����⵵ ������ ��Ȳ
	}
}

class Wildcard_BoundedBase {
	public static void main(String[] args) {
		Box6<Toy> box = new Box6<>();
		BoxHandler.inBox(box, new Toy());  // ���ڿ� �ֱ�
		BoxHandler.outBox(box);  		   // ���ڿ��� ������
	}
}
