package src.fire.ch29;

/* ��Ʈ���� �߰� ����(���͸�) */

import java.util.Arrays;
import java.util.List;

class Stream_Filtering {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };
		Arrays.stream(ar) // �迭 ��� ��Ʈ�� ����
			  .filter(n -> n % 2 == 1) // Ȧ���� �����Ų��.
			  .forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		List<String> sl = Arrays.asList("Red", "Black", "Blue");
		sl.stream() // �÷��� �ν��Ͻ� ��� ��Ʈ�� ����
		  .filter(s -> s.length() == 3) // ���̰� 3�̸� �����Ų��.
		  .forEach(s -> System.out.print(s + " "));
		System.out.println();
	}
}
