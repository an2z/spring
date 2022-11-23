package src.fire.ch13;

/* EnhancedFor */
class ForEachExam {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		// �迭 ��� ��ü ���
		for (int e : arr) {
			System.out.println(e + "");
		}
		System.out.println();  // �ܼ� �� �ٲ�
		
		int sum = 0;
		
		// �迭 ����� ��ü �� ���
		for (int e : arr) {
			sum += e;
		}
		System.out.println("sum: " + sum);
	}

}
