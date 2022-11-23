package src.fire.ch21;

/* ���׸� Ŭ������ �⺻�ڷ��� ����
 * ���׸� Ŭ������ ���Ͽ� �Ű�����ȭ Ÿ���� �����Ҷ� �⺻ �ڷ����� �̸��� Ÿ�����ڷ� �� �� ����.
 * �̶��� �⺻ �ڷ����� ���� ���� Ŭ������ ����ؾ߸� �Ѵ�.
 */

class Box5<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class PrimitiveDataGeneric {
	public static void main(String[] args) {
		Box5<Integer> iBox = new Box5<Integer>();
		iBox.set(125);			// ���� �ڽ� ����
		int num = iBox.get();	// ���� ��ڽ� ����
		System.out.println(num);
	}
}
