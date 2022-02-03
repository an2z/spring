package ch27;

import java.util.function.Function;

/* 함수형 인터페이스 (Function) 
 * 전달 인자와 반환 값이 있는 형태
 */

class FunctionalInterface_Function {
	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Red"));
		System.out.println(f.apply("Black"));
	}
}