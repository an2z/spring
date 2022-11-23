package src.fire.ch18;

/* ���� Ŭ���� (ArrayIndexOutOfBoundsException)
 * �迭 ���ٿ� �߸��� �ε��� ���� ����ϴ� ������Ȳ�� �ǹ�
 */

class ExceptionArrayIndexOutOfBounds {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		for (int i = 0; i < 4; i++)
			System.out.println(arr[i]); // �ε��� �� 3�� ���ܸ� �߻���Ŵ
	}
}
