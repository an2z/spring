package src.fire.ch21;

/* ���׸� Ŭ���� ���� (���� �Ű����� ���)
 * �������� Ÿ�� ������ ��ǥ�� �����Ͽ� ����Ҽ� �ִ�.
 */

class MBox<L,R> {
	private L left;		// ���� ��������
	private R right;	// ������ ���� ����
	
	public void set(L l, R r) {
		left = l;
		right = r;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
}

class MultiTypeParam {
	public static void main(String[] args) {	
		MBox<String, Integer> box = new MBox<String, Integer>();
//		MBox<String, Integer> box = new MBox<>();  // �ڹ� 7���� Ÿ�� ���� ���� ����
		
		box.set("Apple", 25);
		System.out.println(box);
	}
}
