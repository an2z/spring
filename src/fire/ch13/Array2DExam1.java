package src.fire.ch13;

/* 2���� �迭 ������ ���� */
class Array2DExam1 {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];  // ���α���(��)�� 3, ���α���(��)�� 3�� int�� 2���� �迭 ����
		int num = 1;
		
		// �迭�� ���� ����
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		
		// �迭�� ����� ���� ���
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
