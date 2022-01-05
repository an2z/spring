package ch18;

/* 예외 클래스 (ArrayIndexOutOfBoundsException)
 * 배열 접근에 잘못된 인덱스 값을 사용하는 오류상황을 의미
 */

class ExceptionArrayIndexOutOfBounds {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		for (int i = 0; i < 4; i++)
			System.out.println(arr[i]); // 인덱스 값 3은 예외를 발생시킴
	}
}
