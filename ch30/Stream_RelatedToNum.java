package ch30;

/* 스트림의 최종 연산 (sum, count, average, min, max) */

import java.util.stream.IntStream;

class Stream_RelatedToNum {
	public static void main(String[] args) {
		// 합
		int sum = IntStream.of(1, 3, 5, 7, 9)
				           .sum();
		System.out.println("합 : " + sum);
		
		// 개수
		long cnt = IntStream.of(1, 3, 5, 7, 9)
				            .count();
		System.out.println("개수 : " + cnt);
		
		// 평균
		IntStream.of(1, 3, 5, 7, 9)
		         .average()
		         .ifPresent(avg -> System.out.println("평균 : " + avg));
		
		// 최소
		IntStream.of(1, 3, 5, 7, 9)
		         .min()
		         .ifPresent(mn -> System.out.println("최소 : " + mn));
		
		// 최대
		IntStream.of(1, 3, 5, 7, 9)
		         .max()
		         .ifPresent(mx -> System.out.println("최대 : " + mx));
	}
}