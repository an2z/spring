package src.fire.ch13;

/* �迭(1���� �迭 �������) */
class ArrayExam {
	public static void main(String[] args) {
		int[] ar1 = new int[3]; // ���̰� 5�� int�� �迭
		double[] ar2 = new double[7]; // ���̰� 7�� double�� �迭

		// �迭�� ���������� �ν��Ͻ� ���� �и�
		float[] ar3;
		ar3 = new float[9];

		// �迭�� �ν��Ͻ� ���� ����
		System.out.println("�迭 ar1 ����: " + ar1.length);
		System.out.println("�迭 ar2 ����: " + ar2.length);
		System.out.println("�迭 ar3 ����: " + ar3.length);
	}

}
