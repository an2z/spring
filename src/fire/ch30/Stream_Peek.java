package src.fire.ch30;

/* ��Ʈ���� �߰� ���� (peek) */

import java.util.stream.IntStream;

class Stream_Peek {
	public static void main(String[] args) {
		// ���� ������ ������ ��Ʈ���� ����������
		IntStream.of(1, 3, 5)
		         .peek(d -> System.out.print(d + " ")); // ���� ���� ������ �߰� ������ �ƹ��� �ǹ� X
		System.out.println();
		
		// ���� ������ �����ϴ� ��Ʈ���� ������ ����
		IntStream.of(5, 3, 1)
		         .peek(d -> System.out.print(d + " ")) // �߰� ����
		         .sum(); // ���� ����
	}
}
