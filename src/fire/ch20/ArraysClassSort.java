package src.fire.ch20;

import java.util.Arrays;

/* �迭 ���� �޼ҵ� (sort)
 * �Ű������� ���޵� �迭�� ��������(����->ū)���� ���� 
 */

class ArraysClassSort {
	public static void main(String[] args) {
		int[] ar1 = {3, 1, 2};
		double[] ar2 = {1.1, 3.3, 2.2};
		
		Arrays.sort(ar1);	// �迭 �������� ����
		Arrays.sort(ar2);	// �迭 �������� ����
		
		System.out.println("ar1: " + Arrays.toString(ar1));
		System.out.println("ar2: " + Arrays.toString(ar2));
	}
}
