package ch27;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

/* 함수형 인터페이스 (IntPredicate) */

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
		System.out.println("짝수 합: " + s);
		s = sum(n -> n % 2 != 0, list);
		System.out.println("홀수 합: " + s);
	}
}