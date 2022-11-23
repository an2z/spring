package src.fire.ch27;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

/* �Լ��� �������̽� (IntPredicate) */

class FunctionalInterface_IntPredicate {
	public static int sum(IntPredicate ip, List<Integer> li) {
		int s = 0;
		for (int n : li) {
			if (ip.test(n))
				s += n;
		}
		return s;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 5, 7, 9, 11, 12);
		int s;
		s = sum(n -> n % 2 == 0, list);
		System.out.println("¦�� ��: " + s);
		s = sum(n -> n % 2 != 0, list);
		System.out.println("Ȧ�� ��: " + s);
	}
}
