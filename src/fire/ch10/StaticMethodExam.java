package src.fire.ch10;

/* Ŭ���� �޼ҵ� */
class StaticMethodExam00 {
	private int num = 0;
	
	static void showInt(int n) { System.out.println(n); }        // Ŭ���� �޼ҵ� (static �޼ҵ�)
	static void showDouble(double n) { System.out.println(n); }  // Ŭ���� �޼ҵ�
	
	void setNum(int n) { num = n; }   // �ν��Ͻ� �޼ҵ�
	void showNum() {  // �ν��Ͻ� �޼ҵ�
		showInt(num);   // Ŭ���� ���ο��� Ŭ���� �޼ҵ� ȣ��
	}  
}


public class StaticMethodExam {
	public static void main(String[] args) {
		StaticMethodExam00.showInt(20);  // Ŭ���� �ܺο��� �ν��Ͻ� �̸��� ���� Ŭ���� �޼ҵ� ȣ��
		
		StaticMethodExam00 np = new StaticMethodExam00();  // �ν��Ͻ� ����
		np.showDouble(3.15);  // Ŭ���� �ܺο��� �ν��Ͻ� �̸��� ���� Ŭ���� �޼ҵ� ȣ��
		np.setNum(75);
		np.showNum();	
	}
}
