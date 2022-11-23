package src.fire.ch29;

/* ��Ʈ�� �����ϱ� 
 * ��Ʈ���� �����ϰ� �̸� ������� '�߰� ����'�� �����ϸ�,
 * ���ϴ� �������� �����͸� ���͸��ϰ� ���͸� �� �������� ������ ����� ���� �� �ִ�. 
 */

import java.util.Arrays;
import java.util.stream.IntStream;

class Stream {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };

		IntStream stm1 = Arrays.stream(ar); // �迭 ar�κ��� ��Ʈ�� ����
		IntStream stm2 = stm1.filter(n -> n % 2 == 1); // �߰����� ����
		int sum1 = stm2.sum(); // �������� ����
		System.out.println(sum1);

		// �ڵ� ���̱�
		int sum2 = Arrays.stream(ar) // ��Ʈ�� ����
				         .filter(n -> n % 2 == 1) // filter ���
				         .sum(); // sum ��� ��� ��ȯ
		System.out.println(sum2);
	}
}
