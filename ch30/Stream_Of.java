package ch30;

/* 가변매개변수 기반 스트림 생성 (of) 
 * 인자로 전달한 값을 스트림으로 생성한다. 
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Stream_Of {
	public static void main(String[] args) {
		// ex1
		Stream.of(11, 22, 33, 44, 55) 
			  .forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		// ex2
		Stream.of("This is String")
		      .forEach(System.out::println);
		
		// ex3 - 하나의 컬렉션 인스턴스로 이뤄진 스트림 생성
		List<String> sl = Arrays.asList("Red", "Black", "Blue");
		Stream.of(sl)
		      .forEach(System.out::println);
		
		// ex4 - 기본자료형으로 이뤄진 스트림 생성 (불필요한 오토박싱, 오토언박싱 생략)
		IntStream.of(1, 2, 3, 4, 5)
		         .forEach(s -> System.out.print(s + " "));
	}
}