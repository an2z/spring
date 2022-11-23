package src.fire.ch21;

/* ���׸� ���� �ڵ� 
 * ���α׷��Ӱ� �Ǽ��� �ص� �� �Ǽ��� �巯���� ���� �� �ִٴ� �������� ������.
 * */

class Apple2 {
	public String toString() {
		return "I am an apple";
	}
}

class Orange2 {
	public String toString() {
		return "I am an arange";
	}
}

class Box2 {
	private Object ob;
	public void set(Object o) {
		ob = o;
	}
	public Object get() {
		return ob;
	}
}

class FruitBoxFault {
	public static void main(String[] args) {
		Box2 aBox = new Box2();
		Box2 oBox = new Box2();
		
		/* ���α׷����� �Ǽ� */
		// �Ʒ� �� ���忡���� ����� �������� �ƴ� "���ڿ�"�� ��Ҵ�.
		aBox.set("Apple");
		oBox.set("Orange");
		
		/* ������������� ���� �߰� */
		// ���ڿ� ������ ����� �ʾҴµ� ������ ������ �Ѵ�.
//		Apple2 ap = (Apple2)aBox.get();
//		Orange2 or = (Orange2)oBox.get();
//				
//		System.out.println(ap);
//		System.out.println(or);
		
		/* �Ǽ��� �巯���� ���� */
		System.out.println(aBox.get());
		System.out.println(oBox.get());
	}
}
