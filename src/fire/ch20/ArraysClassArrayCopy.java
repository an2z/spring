package src.fire.ch20;

/* �迭 ���� �޼ҵ� (arraycopy) */

class ArraysClassArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = new int[3];
		
		// �迭 org�� �ε��� 1���� �迭 cpy �ε��� 0���� ������ ��� ����
		System.arraycopy(arr1, 1, arr2, 0, 3);
		
		for(int d : arr2)
			System.out.print(d + "\t");
	}
}
