package src.fire.ch27;

import java.util.function.Consumer;

/* �Լ��� �������̽� (Consumer)
 * ���ڸ� �Һ��ϴ� ����
 */

class FunctionalInterface_Consumer {
	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Black"); // ����̶�� ����� ����
		c.accept("Red");
	}
}
