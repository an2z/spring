package src.fire.ch22;

/* ���׸� (Ÿ�� Ÿ��) 
 * Ÿ��Ÿ��(Target Types)�̶� T�� ���޵Ǵ� �ڷ����� ���� ���� ���� ����(���������� Ÿ��)�� �ǹ�
 */

class Box2<T> {
	protected T ob;
	
	public void set(T o) { ob = o;}
	public T get() { return ob;}
}

class EmptyBoxFactory {
	public static <T> Box2<T> makeBox() { // ���׸� �޼ҵ� ����
		Box2<T> box = new Box2<>();	// ���� ����
		return box;	// ������ ���� ��ȯ
	}
}
	
class Generic_TargetTypes {
	public static void main(String[] args) {
//		Box2<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
		Box2<Integer> iBox = EmptyBoxFactory.makeBox();	// �ڹ� 7���� ���׸� �޼ҵ��� Ÿ������ ���� ����
		
		iBox.set(25);
		System.out.println(iBox.get());
	}
}
