package ch27;

import java.util.function.ToIntFunction;

/* 함수형 인터페이스 (ToIntFunction) */

class FunctionalInterface_ToIntFunction {
	public static void main(String[] args) {
		ToIntFunction<String> f = s -> s.length();
		System.out.println(f.applyAsInt("Red"));
		System.out.println(f.applyAsInt("Black"));
	}
}