package ch29;

/* 컬렉션 인스턴스 대상 스트림 생성 */

import java.util.Arrays;
import java.util.List;

class Stream_List {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Red", "Black", "Blue");
		list.stream() // 스트림 생성
		    .forEach(s -> System.out.print(s + " ")); // 스트림 요소의 순차적 접근
		System.out.println();
	}
}