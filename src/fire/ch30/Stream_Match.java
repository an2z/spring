package src.fire.ch30;

/* ��Ʈ���� ���� ���� (allMatch, anyMatch, noneMatch) */

import java.util.stream.IntStream;

class Stream_Match {
	public static void main(String[] args) {
		boolean b = IntStream.of(1, 2, 3, 4, 5)
				             .allMatch(n -> n % 2 == 0);
		System.out.println("��� ¦���ΰ���? " + b);

		b = IntStream.of(1, 2, 3, 4, 5)
				     .anyMatch(n -> n % 2 == 0);
		System.out.println("¦���� �ϳ��� �ֳ���? " + b);
		
		b = IntStream.of(1, 2, 3, 4, 5)
				     .noneMatch(n -> n % 2 == 0);
		System.out.println("��� ¦���� �ƴѰ���? " + b);
	}
}
