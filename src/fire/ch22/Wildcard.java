package src.fire.ch22;

/* ���ϵ� ī��
 * ����ǥ ��ȣ(?)�� ����� �޼ҵ��� �Ű������� �����Ѵ�.
 * ���׸� �޼ҵ�� ����� ���������� ���ϵ� ī�� ����� �޼ҵ尡 ���� �����ϴ�. 
 */

class Box3<T> {
	protected T ob;	
	public void set(T o) { ob = o;}
	public T get() { return ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class Unboxer {
	public static <T> T openBox(Box3<T> box) {
		return box.get();
	}
	
	// ���� ���� ���빰�� Ȯ��(���)�ϴ� ����� �޼ҵ� ����
	/* ���׸� �޼ҵ� */
//	public static <T> void peekBox(Box3<T> box) {
//		System.out.println(box);
//	}
	
	/* ���ϵ� ī�� ����� �޼ҵ� */
	public static void peekBox(Box3<?> box) {
		System.out.println(box);
	}
}

class Wildcard {
	public static void main(String[] args) {
		Box3<String> box = new Box3<>();
		box.set("Simple String");
		Unboxer.peekBox(box);
	}
}
