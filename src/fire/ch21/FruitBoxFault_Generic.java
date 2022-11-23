package src.fire.ch21;

/* ���׸� ���� �ڵ�
 * �Ǽ��� ������ �������� �巯����.
 */

class Apple4 {
	public String toString() {
		return "I am an apple";
	}
}

class Orange4 {
	public String toString() {
		return "I am an arange";
	}
}

class Box4<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class FruitBoxFault_Generic {
	public static void main(String[] args) {
		Box4<Apple4> aBox = new Box4<Apple4>();
		Box4<Orange4> oBox = new Box4<Orange4>();
			
		aBox.set("Apple");	// ���α׷����� �Ǽ��� ������ ������ �̾���
		oBox.set("Orange");	// ���α׷����� �Ǽ��� ������ ������ �̾���
		
		Apple4 ap = aBox.get();
		Orange4 or = oBox.get();
		
		System.out.println(ap);
		System.out.println(or);
	}
}
