package src.fire.ch10;

/* Ŭ���� ������ ���ٹ�� */
class StaticExam01 {
	static int num = 0;  // Ŭ�������� (static����)
	
	// ������
	StaticExam01 () {
		inside();		
	}
	
	void inside() {
		num++;  // Ŭ���� ���ο��� �̸��� ���� ����
		System.out.println("�ν��Ͻ� ����: " + num);
	}
}


public class StaticExam1 {
	public static void main(String[] args) {
		StaticExam01 ex1 = new StaticExam01();
		StaticExam01 ex2 = new StaticExam01();
		StaticExam01 ex3 = new StaticExam01();
		
		ex1.num++;  // Ŭ���� �ܺο��� �ν��Ͻ� �̸��� ���� ����
		StaticExam01.num++;  // Ŭ���� �ܺο��� Ŭ���� �̸��� ���� ����
		System.out.println("num = " + StaticExam01.num);		
	}
}


