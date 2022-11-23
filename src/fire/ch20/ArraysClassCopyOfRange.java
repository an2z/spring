package src.fire.ch20;

import java.util.Arrays;

/* �迭 ���� �޼ҵ� (copyOfRange)
 * ���޹��� �迭�� Ư�� ������ �ش��ϴ� ��Ҹ��� ���ο� �迭�� �����Ͽ� ��ȯ
 */

class ArraysClassCopyOfRange {
	public static void main(String[] args) {
		int[] org = {1, 2, 3, 4, 5};		
		int[] cpy = Arrays.copyOfRange(org, 1, 4);
		
		for(int d : cpy)
			System.out.print(d + "\t");
	}
}
