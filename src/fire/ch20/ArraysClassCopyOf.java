package src.fire.ch20;

import java.util.Arrays;

/* �迭 ���� �޼ҵ� (copyOf)
 * ���޹��� �迭�� Ư�� ���̸�ŭ�� ���ο� �迭�� �����Ͽ� ��ȯ
 */

class ArraysClassCopyOf {
	public static void main(String[] args) {
		int[] arOrigin = {1, 2, 3, 4, 5};
		
		// �迭 ��ü�� ����
		int[] arCopy1 = Arrays.copyOf(arOrigin, arOrigin.length);
		
		// ����° ��ұ����� ����
		int[] arCopy2 = Arrays.copyOf(arOrigin, 3);
        
        // ���ο� �迭�� ���̰� ���� �迭�� ���̺��� �� ���
		int[] arCopy3 = Arrays.copyOf(arOrigin, 8);
		
		for(int d : arCopy1)
			System.out.print(d + "\t");
		System.out.println();
		
		for(int d : arCopy2)
			System.out.print(d + "\t");
		System.out.println();
        
		for(int d : arCopy3)
			System.out.print(d + "\t");
		System.out.println();
	}
}
