package src.fire.ch10;

/* Ŭ���� ������ �ʱ�ȭ */
class StaticExam02 {
	static int num = 100;  // Ŭ���� ������ ������ �ʱ�ȭ ��ġ
	
	// ������
	StaticExam02() {
		num++;  // �ν��Ͻ� �����ø��� ���� ����
		System.out.println("�ν��Ͻ� ����: " + num);
	}
}


public class StaticExam2 {
	public static void main(String[] args) {
		StaticExam02.num -= 15;  // �ν��Ͻ� �������� num(Ŭ��������)�� ����
		System.out.println(StaticExam02.num);
	}
}
