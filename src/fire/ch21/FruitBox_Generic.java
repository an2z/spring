package src.fire.ch21;

/* ���׸� ���� �ڵ�
 * ���׸��� ����ϸ� ������ �ÿ� �̸� Ÿ���� �������Ƿ�,
 * Ÿ�� �˻糪 Ÿ�� ��ȯ�� ���� ���ŷο� �۾��� ������ �� �ְ� �ȴ�.
 * */

class Apple3 {
	public String toString() {
		return "I am an apple";
	}
}

class Orange3 {
	public String toString() {
		return "I am an arange";
	}
}

// ���׸� ����� �ڵ�
class Box3<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class FruitBox_Generic {
	public static void main(String[] args) {
		Box3<Apple3> aBox = new Box3<Apple3>();		// T�� Apple�� ����
		Box3<Orange3> oBox = new Box3<Orange3>();	// T�� Orange�� ����
			
		aBox.set(new Apple3());		// ����� ���ڿ� ��´�
		oBox.set(new Orange3());	// �������� ���ڿ� ��´�
		
		Apple3 ap = aBox.get();		// ����� �����µ� �� ��ȯ�� �ʿ� ����
		Orange3 or = oBox.get();	// �������� �����µ� �� ��ȯ�� �ʿ� ����
		
		System.out.println(ap);
		System.out.println(or);
	}
}
