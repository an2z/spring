package ch13;

class Array2DExam2 {
	public static void main(String[] args) {
		int[][] arr = {
						{11},           // 1행 초기화
						{22, 33},       // 2행 초기화
						{44, 55, 66}    // 3행 초기화
					};
		
		// 배열의 구조대로 내용 출력
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
