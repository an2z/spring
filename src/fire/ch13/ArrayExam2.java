package src.fire.ch13;

class ArrayExam2 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5 ,6 ,7};
		
		int sum = sumOfArr(arr);  // �迭�� ������ ����
		System.out.println(sum);
		
	}
	
	static int sumOfArr(int[] arr) {
		int sum = 0;
		for (int i=0; i<arr.length; i++)
			sum += arr[i];
		return sum;
	}
	
	// �迭�� �������� ��ȯ�ϴ� �޼ҵ� ����
	static int[] makeNewIntArr(int len) {
		int[] arr = new int[len];
		return arr;
	}
}
