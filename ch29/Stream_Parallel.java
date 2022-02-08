package ch29;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/* 병렬 스트림 
 * 병렬 스트림을 생성하면 이어지는 연산들은 CPU의 코어 수를 고려해
 * 적절하게 병렬로 처리된다.
 */

class Stream_Parallel {
	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Red", "Blue", "Black", "orange");
		
		BinaryOperator<String> lc = (s1, s2) -> {
			if (s1.length() > s2.length()) // 긴 문자열을 반환
				return s1;
			else
				return s2;
		};

		String str = ls.parallelStream() // 병렬 처리를 위한 스트림 생성
				       .reduce("", lc);  // 스트림이 빈 경우 빈 문자열 반환
		System.out.println(str);
	}
}