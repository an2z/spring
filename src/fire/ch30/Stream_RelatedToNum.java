package src.fire.ch30;

/* ��Ʈ���� ���� ���� (sum, count, average, min, max) */

import java.util.stream.IntStream;

class Stream_RelatedToNum {
	public static void main(String[] args) {
		// ��
		int sum = IntStream.of(1, 3, 5, 7, 9)
				           .sum();
		System.out.println("�� : " + sum);
		
		// ����
		long cnt = IntStream.of(1, 3, 5, 7, 9)
				            .count();
		System.out.println("���� : " + cnt);
		
		// ���
		IntStream.of(1, 3, 5, 7, 9)
		         .average()
		         .ifPresent(avg -> System.out.println("��� : " + avg));
		
		// �ּ�
		IntStream.of(1, 3, 5, 7, 9)
		         .min()
		         .ifPresent(mn -> System.out.println("�ּ� : " + mn));
		
		// �ִ�
		IntStream.of(1, 3, 5, 7, 9)
		         .max()
		         .ifPresent(mx -> System.out.println("�ִ� : " + mx));
	}
}
