package ch13;

/* EnhancedFor */
class ForEachExam {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		// 배열 요소 전체 출력
		for (int e : arr) {
			System.out.println(e + "");
		}
		System.out.println();  // 단순 줄 바꿈
		
		int sum = 0;
		
		// 배열 요소의 전체 합 출력
		for (int e : arr) {
			sum += e;
		}
		System.out.println("sum: " + sum);
	}

}
