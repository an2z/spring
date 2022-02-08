package ch29;

/* 스트림의 최종 연산(reduce) */

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

class Stream_Reduce {
	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Red", "Blue", "Black", "orange");

		BinaryOperator<String> lc = (s1, s2) -> {
			if (s1.length() > s2.length()) // 긴 문자열을 반환
				return s1;
			else
				return s2;
		};

		String str = ls.stream()
				       .reduce("", lc); // 스트림이 빈 경우 빈 문자열 반환
		System.out.println(str);
	}
}