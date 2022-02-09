package ch30;

/* 지정된 범위의 연속된 정수 기반 스트림 생성 (range,rangeClosed) */

import java.util.stream.IntStream;

class Stream_Range {
	public static void main(String[] args) {
		IntStream.range(1, 5) // 1이상 5미만 스트림 생성
		         .forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		IntStream.rangeClosed(1, 5) // 1이상 5이하 스트림 생성
		         .forEach(s -> System.out.print(s + " "));
	}
}