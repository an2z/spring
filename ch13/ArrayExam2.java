package ch13;

class ArrayExam2 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5 ,6 ,7};
		
		int sum = sumOfArr(arr);  // 배열의 참조값 전달
		System.out.println(sum);
		
	}
	
	static int sumOfArr(int[] arr) {
		int sum = 0;
		for (int i=0; i<arr.length; i++)
			sum += arr[i];
		return sum;
	}
	
	// 배열의 참조값을 반환하는 메소드 정의
	static int[] makeNewIntArr(int len) {
		int[] arr = new int[len];
		return arr;
	}
}
