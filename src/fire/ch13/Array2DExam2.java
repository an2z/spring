package src.fire.ch13;

class Array2DExam2 {
	public static void main(String[] args) {
		int[][] arr = {
						{11},           // 1�� �ʱ�ȭ
						{22, 33},       // 2�� �ʱ�ȭ
						{44, 55, 66}    // 3�� �ʱ�ȭ
					};
		
		// �迭�� ������� ���� ���
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
