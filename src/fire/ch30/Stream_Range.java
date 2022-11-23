package src.fire.ch30;

/* ������ ������ ���ӵ� ���� ��� ��Ʈ�� ���� (range,rangeClosed) */

import java.util.stream.IntStream;

class Stream_Range {
	public static void main(String[] args) {
		IntStream.range(1, 5) // 1�̻� 5�̸� ��Ʈ�� ����
		         .forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		IntStream.rangeClosed(1, 5) // 1�̻� 5���� ��Ʈ�� ����
		         .forEach(s -> System.out.print(s + " "));
	}
}
