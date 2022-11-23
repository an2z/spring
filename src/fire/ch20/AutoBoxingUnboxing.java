package src.fire.ch20;

/* ����ڽ�, ���� ��ڽ�
 * �ڽ̰� ��ڽ��� �ʿ��� ��Ȳ���� �̸� �����Ϸ��� �ڵ����� ó������
 */

class AutoBoxingUnboxing {
	public static void main(String[] args) {
		// �ν��Ͻ��� �;� �� ��ġ�� �⺻ �ڷ��� ���� ���� ���� �ڽ� ����
		Integer iObj = 10;	// ���� �ڽ�
		Double dObj = 3.14;	// ���� �ڽ�
		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println();
		
		// �⺻ �ڷ��� ���� �;� �� ��ġ�� �ν��Ͻ��� ���� ���� ��ڽ� ����
		int i = iObj;		// ���� ��ڽ�
		double d = dObj;	// ���� ��ڽ�
		System.out.println(i);
		System.out.println(d);
		System.out.println();
	}
}
