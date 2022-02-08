package ch29;

/* 스트림의 중간 연산(맵핑) */

import java.util.Arrays;
import java.util.List;

class Stream_Map {
	public static void main(String[] args) {
		List<String> li = Arrays.asList("Red", "Black", "Blue");
		li.stream()
		  .map(s -> s.length())
		  .forEach(s -> System.out.print(s + " "));
	}
}