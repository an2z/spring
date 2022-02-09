package ch30;

/* 스트림의 중간 연산 (peek) */

import java.util.stream.IntStream;

class Stream_Peek {
	public static void main(String[] args) {
		// 최종 연산이 생략된 스트림의 파이프라인
		IntStream.of(1, 3, 5)
		         .peek(d -> System.out.print(d + " ")); // 최종 연산 생략시 중간 연산은 아무런 의미 X
		System.out.println();
		
		// 최종 연산이 존재하는 스트림의 파이프 라인
		IntStream.of(5, 3, 1)
		         .peek(d -> System.out.print(d + " ")) // 중간 연산
		         .sum(); // 최종 연산
	}
}