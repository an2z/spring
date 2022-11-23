package src.fire.ch20;

class WrapperClass {
	public static void showData(Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Integer inst = new Integer(3);	// ���� 3�� ���δ� ���� �ν��Ͻ� ����
		showData(inst);
		showData(new Double(7.15));		// 7.15�� ���δ� ���� �ν��Ͻ� ���� �� ����
	}	
}
