package ch30;

/* 스트림의 중간 연산 (sorted) */

import java.util.stream.Stream;

class Stream_Sorted {
	public static void main(String[] args) {
		Stream.of("Red", "Blue", "Yellow")
		      .sorted() // 기본적으로 사전 편찬 순 오름차순 정렬
		      .forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		Stream.of("Red", "Blue", "Yellow")
		      .sorted((s1, s2) -> s1.length() - s2.length()) // 글자수를 기준으로 오름차순 정렬
		      .forEach(s -> System.out.print(s + " "));
	}
}