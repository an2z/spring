package src.fire.ch14;

/* ���� Ŭ������ ������ ȣ��
 * ���� Ŭ���� �����ڿ����� �ݵ�� �θ� Ŭ������ �����ڸ� ȣ���ϵ��� �Ǿ� �ִ�.
 * ���� Ŭ������ �ν��Ͻ� ���� �� ���� Ŭ���� �����ڰ� ���� ȣ��ǰ� ����Ŭ������ �����ڰ� ȣ��ȴ�.
 * ���� Ŭ���� �����ڿ� ���� Ŭ���� �����ڸ� ȣ���ϴ� ������ ��� �����Ϸ��� �ڵ����� ȣ���Ѵ�.
 */

class SperCls {
	public SperCls() { // ���� Ŭ���� ������
		System.out.println("I'm Super Class");
	}
}


class SubCls extends SperCls {
	public SubCls() { // ���� Ŭ���� ������
		System.out.println("I'm Sub Class");
	}
}


class SuperSubConExam {
	public static void main(String[] args) {
		new SubCls(); // ���� Ŭ������ �ν��Ͻ� ����
	}
}
