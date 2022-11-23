package src.fire.ch22;

/* ���ϵ� ī�� (���� ����) */

class Box4<T> {
	protected T ob;	
	public void set(T o) { ob = o;}
	public T get() { return ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class Unboxer4 {
	// Number �Ǵ� �̸� ����ϴ� ���� Ŭ������ ���׸� Ÿ���� �ν��Ͻ��� ���޵ǵ��� ����
	public static void peekBox(Box4<? extends Number> box) {
		System.out.println(box);
	}
}
	
class Wildcard_UpperBounded {
	public static void main(String[] args) {
		Box4<Integer> iBox = new Box4<>();
		iBox.set(1234);
		
		Box4<Double> dBox = new Box4<>();
		dBox.set(10.09);
		
		Unboxer4.peekBox(iBox);
		Unboxer4.peekBox(dBox);
	}
}
