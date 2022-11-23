package src.fire.ch21;

/* ���׸� Ŭ������ Ÿ�� ���� ���� (Ŭ����)
 * extends�� ����� Ÿ�� ���ڸ� ���ѽ�ų �� �ִ�.
 */

class Box7<T extends Number> {	// Number �Ǵ� �̸� ����ϴ� Ŭ������ T�� �� �� ����
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class TypeArguLimit {
	public static void main(String[] args) {
		Box7<Integer> iBox = new Box7<>();	// Integer�� Number�� ���
		iBox.set(24);
		
		Box7<Double> dBox = new Box7<>();	// Double�� Number�� ���
		dBox.set(5.97);
		
		System.out.println(iBox.get());
		System.out.println(dBox.get());
	}
}
