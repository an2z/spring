package ch13;

/* 2차원 배열 생성과 접근 */
class Array2DExam1 {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];  // 세로길이(행)가 3, 가로길이(열)가 3인 int형 2차원 배열 생성
		int num = 1;
		
		// 배열에 값을 저장
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		
		// 배열에 저장된 값을 출력
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
