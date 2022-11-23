package src.fire.ch21;

/* ���׸� ���� �ڵ� 
 * ���� Ÿ���� ����ϴ� ��κ��� Ŭ������ �޼ҵ忡�� �μ��� ��ȯ������ Object Ÿ���� ����� ���
 * ��ȯ�� Object ��ü�� �ٽ� ���ϴ� Ÿ������ Ÿ�� ��ȯ�� ����� �Ѵ�.
 * */

class Apple { // ����� �ܼ��� ǥ���� Ŭ����
	public String toString() {
		return "I am an apple";
	}
}

class Orange { // �������� �ܼ��� ǥ���� Ŭ����
	public String toString() {
		return "I am an arange";
	}
}

/* ���1 */
//class AppleBox { // ����� ��� ���ڸ� ǥ���� Ŭ����
//	private Apple ap;
//	
//	public void set(Apple a) { // ����� ��´�
//		ap = a;
//	}
//	
//	public Apple get() { // ����� ������
//		return ap;
//	}
//}
//
//class OrangeBox { // �������� ��� ���ڸ� ǥ���� Ŭ����
//	private Orange or;
//	
//	public void set(Orange o) { // �������� ��´�
//		or = o;
//	}
//	
//	public Orange get() { // �������� ������
//		return or;
//	}
//}

/* ���2 */
class Box { // �����̵� ���� �� �ִ� ����
	private Object ob;
	public void set(Object o) {
		ob = o;
	}
	public Object get() {
		return ob;
	}
}

class FruitBox {
	public static void main(String[] args) {
		/* ���1 */
//		AppleBox aBox = new AppleBox();		// ��� ���� ����
//		OrangeBox oBox = new OrangeBox();	// ������ ���� ����
//		
//		aBox.set(new Apple());	// ����� ��� ���ڿ� ��´�
//		oBox.set(new Orange());	// �������� ������ ���ڿ� ��´�
//		
//		Apple ap = aBox.get();	// ��� ���ڿ��� ����� ������
//		Orange or = oBox.get(); // ������ ���ڿ��� �������� ������
		
		/* ���2 */
		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.set(new Apple()); 	// ���ڿ� ����� ��´�
		oBox.set(new Orange()); // ���ڿ� �������� ��´�
		
		// Box �ν��Ͻ����� ���빰�� ���� �� �� ��ȯ�� �ؾ��Ѵ�
		Apple ap = (Apple)aBox.get(); // ���ڿ��� ����� ������
		Orange or = (Orange)oBox.get(); // ���ڿ��� �������� ������
		
		System.out.println(ap);
		System.out.println(or);
	}
}
