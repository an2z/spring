package src.fire.ch21;

/* ���׸� Ŭ������ Ÿ�� ���� ���� (�������̽�)
 * extends�� ����� Ÿ�� ���ڸ� ���ѽ�ų �� �ִ�.
 */

interface Eatable {
	public String eat();
}

class Apple8 implements Eatable {
	public String toString() {
		return "I am an apple";
	}
	
	@Override
	public String eat() {
		return "It tastes so good";
	}
}

class Box8<T extends Eatable> {	// Ÿ�� ���ڸ� Eatable �������̽��� ����
	T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		System.out.println(ob.eat());	// Eatable�� �����߱⿡ eat�޼ҵ� ȣ�� ����
		return ob;
	}
}

class TypeArguLimit_Interface {
	public static void main(String[] args) {
		Box8<Apple8> box = new Box8<>();
		box.set(new Apple8());	// ��� ����
		
		Apple8 ap = box.get();	// ��� ������
		System.out.println(ap);
	}
}
