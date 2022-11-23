package src.fire.ch11;

/* ������ �����ε� */
class OverlodingExam2 {
	public static void main(String[] args) {
		// ���ǹ�ȣ�� �ִ� ����� ������ ���� �ν��Ͻ� ����
		Person lim = new Person(990522, 112233);

		// ���ǹ�ȣ�� ���� ����� ������ ���� �ν��Ͻ� ����
		Person kim = new Person(201228);

		System.out.println("lim�� ����");
		lim.showPersonInfo();
		System.out.println("kim�� ����");
		kim.showPersonInfo();
	}

}

class Person {
	private int regiNum; // �ֹε�� ��ȣ
	private int passNum; // ���� ��ȣ

	/* ������1 */
	Person(int rnum, int pnum) {
		regiNum = rnum;
		passNum = pnum;
	}

	/* ������2 */
	Person(int rnum) {
		regiNum = rnum;
		passNum = 0;
	}

	/* this�� �̿��� �����ε� �� �ٸ� ������ ȣ�� */
//	Person(int rnum) {
//		this(rnum, 0);  // rnum�� 0�� ���ڷ� �޴� ������1 ȣ��
//	}

	void showPersonInfo() {
		System.out.println("�ֹε�� ��ȣ: " + regiNum);
		System.out.println("���� ��ȣ: " + passNum);
	}

}
