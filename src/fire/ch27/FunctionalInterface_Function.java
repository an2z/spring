package src.fire.ch27;

import java.util.function.Function;

/* �Լ��� �������̽� (Function) 
 * ���� ���ڿ� ��ȯ ���� �ִ� ����
 */

class FunctionalInterface_Function {
	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Red"));
		System.out.println(f.apply("Black"));
	}
}
