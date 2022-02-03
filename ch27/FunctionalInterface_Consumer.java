package ch27;

import java.util.function.Consumer;

/* 함수형 인터페이스 (Consumer)
 * 인자를 소비하는 형태
 */

class FunctionalInterface_Consumer {
	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Black"); // 출력이라는 결과를 보임
		c.accept("Red");
	}
}