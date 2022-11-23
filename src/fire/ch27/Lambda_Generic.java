package src.fire.ch27;

/* ���ٽİ� ���׸� 
 * �������̽��� ���������� ������ �� Ÿ�����ڸ� �����ϸ� 
 * �߻�޼ҵ��� T�� �����ȴ�.
 */

@FunctionalInterface
interface Calculate3<T> { // ���׸� ����� �Լ��� �������̽�
	T cal(T a, T b);
}

class Lambda_Generic {
	public static void main(String[] args) {
		Calculate3<Integer> ci = (a, b) -> a + b; // <T>:Integer
		System.out.println(ci.cal(4, 3));

		Calculate3<Double> cd = (a, b) -> a + b; // <T>:Double
		System.out.println(cd.cal(4.32, 3.45));
	}
}
