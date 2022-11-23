package src.fire.ch27;

/* ���� ǥ���� (�Ű����� o, ��ȯ o) 
 * return���� �߰�ȣ�� ���� �Ұ�
 * ������ ���� ��� ���� ������ �ڵ����� ��ȯ���ش� -> return ���� ����
 */

interface Calculate2 {
	int cal(int a, int b); // ���� ��ȯ�ϴ� �߻� �޼ҵ�
}

class Lambda_TwoParamAndReturn {
	public static void main(String[] args) {
    	Calculate2 c;
        
        c = (a, b) -> { return a + b; }; // return���� �߰�ȣ�� ���� �Ұ�
        System.out.println(c.cal(4, 3));
        
        c = (a, b) -> a + b; // ���� ������, ������ ������� �ʾƵ� ��ȯ ����� ��(return ����)
        System.out.println(c.cal(4, 3));
    }
}
