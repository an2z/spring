package src.fire.ch14;

/* Ŭ���� ������ ���
 * Ŭ���� ������ Ŭ���� �޼ҵ�� �ν��Ͻ��� ������ �ʱ� ������ ����� ����� �ƴϴ�.
 * ���� ���� �����ڿ� ���� ���� Ŭ������ �̸� ����ϴ� ���� Ŭ���������� Ŭ���� ������ ������ �����ϴ�. 
 */

class SuperCls3 {
	protected static int count = 0;  //  Ŭ���� ���� ����
//	private static int count = 0;    //  private�� ��� �ܺο��� count�� ���� �Ұ���
	
	public SuperCls3() {
		count++;
	}
}


class SubCls3 extends SuperCls3 { 
	public void showCount() {
		System.out.println(count); // ���� Ŭ������ ��ġ�� Ŭ���� ���� count�� ����
	}
}


class SuperSubStaticExam {
	public static void main(String[] args) {
		new SuperCls3(); // count �� 1 ����
		new SuperCls3(); // count �� 1 ����
		
		// ���� Ŭ���� �ν��Ͻ� ������������ ����Ŭ���� ������ ȣ���
		SubCls3 obj = new SubCls3();  // count �� 1 ����
		obj.showCount();
	}
}
