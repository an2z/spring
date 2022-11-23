package src.fire.ch22;

/* ���ϵ� ī�� (����,���� ���� ���� ��) 
 * extends�� ���� ������ �θ� �ִ� ��(set) �Ұ�
 * super�� ���� ������ �θ� ������ ��(get) �Ұ�
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
	// ���ڿ��� ������ ������ �޼ҵ�
	public static void outBox(Box7<? extends Toy7> box) {
		Toy7 t = box.get();    // ���ڿ��� ������
//		box.set(new Toy7());   // ������ �ϸ� ������ ���� �߻�
		System.out.println(t);
	}
	
	// ���ڿ� ������ �ִ� �޼ҵ�
	public static void inBox(Box7<? super Toy7> box, Toy7 n) {
		box.set(n); 		   // ���ڿ� �ֱ�
//		Toy7 toy = box.get();  // ������ �ϸ� ������ ���� �߻�
	}
}

class Wildcard_BoundedUsage {
	public static void main(String[] args) {
		Box7<Toy7> box = new Box7<>();
		BoxHandler7.inBox(box, new Toy7());  // ���ڿ� �ֱ�
		BoxHandler7.outBox(box); 			 // ���ڿ��� ������
	}
}
