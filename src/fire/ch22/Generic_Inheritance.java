package src.fire.ch22;

/* ���׸� Ŭ������ ��� */

class Box<T> {	// ���׸� Ŭ���� (���� Ŭ����)
	protected T ob;
	
	public void set(T o) { ob = o;}
	public T get() { return ob;}
}

class SteelBox<T> extends Box<T> {	// ���׸� Ŭ���� (���� Ŭ����)
	public SteelBox(T o) {	// ������
		ob = o;
	}
}

class Generic_Inheritance {
	public static void main(String[] args) {
		// ����Ŭ������(Box<T>) ���������� ����Ŭ������(SteelBox<T>) �ν��Ͻ� ���� ����
		Box<Integer> iBox = new SteelBox<>(5959);
		Box<String> sBox = new SteelBox<>("simple");
		 
		System.out.println(iBox.get());
		System.out.println(sBox.get());
	}
}
