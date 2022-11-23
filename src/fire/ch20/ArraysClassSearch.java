package src.fire.ch20;

import java.util.Arrays;

/* �迭 Ž�� �޼ҵ� (binarySearch) 
 * ���޹��� �迭���� Ư�� ��ü�� ��ġ�� ����Ž�� �˰����� ����� �˻��� ��, �ش� ��ġ�� ��ȯ�Ѵ�.
 * �Ű������� ���޵Ǵ� �迭�� sort() �޼ҵ� ���� ����� �̸� ���ĵǾ� �־�߸� ����� ����
 */

class ArraysClassSearch {
	public static void main(String[] args) {
		int[] ar = {1, 3, 4, 2, 5};
		Arrays.sort(ar);	// Ž�� ������ ������ ����Ǿ�� �Ѵ�.
		
		System.out.println(Arrays.toString(ar));
		
		int idx = Arrays.binarySearch(ar, 3);	// �迭 ar���� 3�� ã�ƶ�.
		System.out.println("Index of 3: " + idx);
	}
}
