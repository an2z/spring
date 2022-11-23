package src.fire.ch30;

/* ���Ľ�Ʈ������ �����ϱ� (parallel) 
 * �̹� ��Ʈ���� ������ ���¿��� �̸� ������� parallel �޼ҵ� ȣ���ϸ� ���Ľ�Ʈ������ ����
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

class Stream_ToParallel {
	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Red", "Black", "Blue");

		Stream<String> ss = ls.stream(); // ��Ʈ�� ����

		BinaryOperator<String> lc = (s1, s2) -> {
			if (s1.length() > s2.length()) // ���ڿ� ���̰� �� ��� ��ȯ
				return s1;
			else
				return s2;
		};

		String str = ss.parallel() // ���� ��Ʈ�� ����
				       .reduce("", lc);
		System.out.println(str);
	}
}
