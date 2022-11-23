package src.fire.ch20;

/* �ڽ�, ��ڽ�
 * �ڽ� : �⺻ �ڷ��� ���� �ν��Ͻ��� ���δ� ��
 * ��ڽ� : ����� �ν��Ͻ����� ���� ������ ��
 * �ڽ��� �ν��Ͻ��� ������ ����, ��ڽ��� ���� Ŭ������ ���ǵ� �޼ҵ��� ȣ���� ���� �̷���
 */

class BoxingUnboxing {
	public static void main(String[] args) {
		Integer iObj = new Integer(10);	// �ڽ�
		Double dObj = new Double(3.14);	// �ڽ�
		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println();
		
		int i = iObj.intValue();		// ��ڽ�
		double d = dObj.doubleValue();	// ��ڽ�
		System.out.println(i);
		System.out.println(d);
		System.out.println();
		
		// ���� �ν��Ͻ� ���� ���� ���
		iObj = new Integer(iObj.intValue() + 10);
		dObj = new Double(dObj.doubleValue() + 1.2);
		System.out.println(iObj);
		System.out.println(dObj);
	}
}
