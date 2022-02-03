package ch27;

import java.util.function.ObjIntConsumer;

/* �Լ��� �������̽� (ObjIntConsumer) */

class FunctionalInterface_ObjIntConsumer {
	public static void main(String[] args) {
		ObjIntConsumer<String> c = (s, i) -> System.out.println(i + ". " + s);

		int n = 1;
		c.accept("Red", n++);
		c.accept("Black", n++);
		c.accept("Pink", n++);
	}
}