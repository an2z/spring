package src.fire.ch13;

class ArrayStringExam {
	public static void main(String[] args) {
		String[] str = {"one", "two", "three", "four", "five"};
		
		/* �迭�� ���� */
		// �ݺ������� ���� i�� �̿��� ��� �迭 ��ҿ� ������ �� �ִ�.
		for (int i=0; i<str.length; i++) {
			int cnum = 0;
			cnum += str[i].length();
			System.out.println(i + "��° ���ڼ�: " + cnum + "����");
		}
	}

}
