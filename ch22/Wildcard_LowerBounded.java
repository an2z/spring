package ch22;

/* ���ϵ� ī�� (���� ����) */

class Box5<T> {
	private T ob;	
	public void set(T o) { ob = o;}
	public T get() { return ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class Unboxer5 {
	// Integer �Ǵ� Integer�� ����ϴ� �θ�Ŭ�������� ���޵ǵ��� ����
	public static void peekBox(Box5<? super Integer> box) {
		System.out.println(box);
	}
}

class Wildcard_LowerBounded {
	public static void main(String[] args) {
		Box5<Integer> iBox = new Box5<>();
		iBox.set(1234);
		
		Box5<Number> nBox = new Box5<>();
		nBox.set(9955);
		
		Box5<Object> oBox = new Box5<>();
		oBox.set("My simple Instance");
		
		Box5<Double> dBox = new Box5<>();
		dBox.set(10.09);
				
		Unboxer5.peekBox(iBox);
		Unboxer5.peekBox(nBox);
		Unboxer5.peekBox(oBox);
//		Unboxer5.peekBox(dBox);  // Integer�� ����ϴ� �θ�Ŭ������ �ƴϹǷ� �����Ͽ��� �߻�
	}
}