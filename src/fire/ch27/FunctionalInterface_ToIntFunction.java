package src.fire.ch27;

import java.util.function.ToIntFunction;

/* �Լ��� �������̽� (ToIntFunction) */

class FunctionalInterface_ToIntFunction {
	public static void main(String[] args) {
		ToIntFunction<String> f = s -> s.length();
		System.out.println(f.applyAsInt("Red"));
		System.out.println(f.applyAsInt("Black"));
	}
}
