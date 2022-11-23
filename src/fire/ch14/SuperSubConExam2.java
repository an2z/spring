package src.fire.ch14;

/* ���� Ŭ������ ������ ȣ��
 * super Ű���带 ����ؼ� ��������� ����Ŭ������ ȣ���� �� �ִ�.
 * super�� ������ �������� ��� ������ Ű�����̴�.
 */

class SuperCls2 {
	// ���� Ŭ���� ������ �����ε�
	public SuperCls2() {
		System.out.println("������ : SupeCls()");
	}
	
	public SuperCls2(int i) {
		System.out.println("������ : SupeCls(int i)");
	}
	
	public SuperCls2(int i, int j) {
		System.out.println("������ : SupeCls(int i, int j)");
	}
}


class SubCls2 extends SuperCls2 {
	// ���� Ŭ���� ������ �����ε�
	public SubCls2() {
		super(); // ���� Ŭ������ �����ڸ� ���� �� ȣ��
		System.out.println("������ : SubCls()");
	}
	
	public SubCls2(int i) {
		super(i); // ���� Ŭ������ �����ڸ� ���� �� ȣ��
		System.out.println("������ : SubCls(int i)");
	}
	
	public SubCls2(int i, int j) {
		super(i, j); // ���� Ŭ������ �����ڸ� ���� �� ȣ��
		System.out.println("������ : SubCls(int i, int j)");
	}
}


class SuperSubConExam2 {
	public static void main(String[] args) {
		System.out.println("1. ");
		new SubCls2();
		System.out.println();
		
		System.out.println("2. ");
		new SubCls2(1);
		System.out.println();
		
		System.out.println("3. ");
		new SubCls2(1, 2);
		System.out.println();
	}
}
