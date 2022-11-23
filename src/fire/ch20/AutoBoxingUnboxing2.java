package src.fire.ch20;

class AutoBoxingUnboxing2 {
	public static void main(String[] args) {
		Integer num = 10;	// ���� �ڽ� ����
		
		/* ���� �ڽ�, ���� ��ڽ� ���� ���� */
		num++;	// new Integer(num.intValue()+1);
		System.out.println(num);
		
		/* ���� �ڽ�, ���� ��ڽ� ���� ���� */
		num += 3;	// new Integer(num.intValue()+3);
		System.out.println(num);
		
		int r = num + 5;		// ���� ��ڽ� ����
		Integer rObj = num - 5; // ���� �ڽ�, ��ڽ� ����
		System.out.println(r);
		System.out.println(rObj);
	}
}
