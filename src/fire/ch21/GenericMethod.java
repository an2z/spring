package src.fire.ch21;

/* ���׸� �޼ҵ�
 * Ŭ���� ���ΰ� �ƴ� �Ϻ� �޼ҵ忡 ���ؼ��� ���׸����� ������ �� ������, �̸� ���׸� �޼ҵ�� ��
 * �ν��Ͻ� �޼ҵ�, Ŭ���� �޼ҵ忡 ���� ��� ���׸� �޼ҵ�� ���� �����ϴ�.
 */

class Box9<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class BoxFactory {
	public static <T> Box9<T> makeBox(T o) {	// ���׸� �޼ҵ� ����
		Box9<T> box = new Box9<T>();	// ���ڸ� ����
		box.set(o);		// ���޵� �ν��Ͻ��� ���ڿ� ��Ƽ�
		return box;		// �� ���ڸ� ��ȯ�Ѵ�.

	}
}

class GenericMethod {
	public static void main(String[] args) {
		Box9<String> sBox = BoxFactory.makeBox("sweet");	// �޼ҵ带 ȣ���ϴ� ������ Ÿ�� ����
		System.out.println(sBox.get());
		
		Box9<Double> dBox = BoxFactory.makeBox(7.59);
		System.out.println(dBox.get());
	}
}
