package src.fire.ch18;

/* ����ó���� å�� ���� (����ó�� ��) */

class ExceptionMessage2 {
	public static void m1(int n) {
		m2(n,0);  // �� �������� m2�κ��� ���ܰ� �Ѿ�´�.
	}
	
	public static void m2(int n1, int n2) {
		int r = n1/n2;  // �� �������� ���ܰ� �߻��Ѵ�.
	}
	
	public static void main(String[] args) {
		try {
			m1(3);  // �� �������� m1���� ���� ���ܰ� �Ѿ�´�.
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("���α׷� ����!");
	}
}
