package src.fire.ch16;

/* ������̼� @Override 
 * ���� Ŭ������ �޼ҵ带 �������̵� �� �������� �����Ѵٴ� ����
 * �����Ϸ����� �˷��ִ� ������ �޸��̴�. 
 */

class ParentAdder {
	public int add(int a, int b) {
		return a + b;
	}
}

class CildAdder extends ParentAdder {
	// ���� Ŭ������ add�� �������̵�
	@Override
//	public double add(double a, double b) { // �������̵� �� �޼ҵ� ��ȯ���� ���� �ٸ��� ������ �����޼��� ����
	public int add(int a, int b) {
		System.out.println("������ �����մϴ�.");
		return a + b;
	}
}

class OverrideExam {
	public static void main(String[] args) {
		ParentAdder adder = new CildAdder();
		System.out.println(adder.add(3, 4));
	}

}
