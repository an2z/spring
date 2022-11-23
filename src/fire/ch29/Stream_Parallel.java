package src.fire.ch29;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/* ���� ��Ʈ�� 
 * ���� ��Ʈ���� �����ϸ� �̾����� ������� CPU�� �ھ� ���� �����
 * �����ϰ� ���ķ� ó���ȴ�.
 */

class Stream_Parallel {
	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Red", "Blue", "Black", "orange");
		
		BinaryOperator<String> lc = (s1, s2) -> {
			if (s1.length() > s2.length()) // �� ���ڿ��� ��ȯ
				return s1;
			else
				return s2;
		};

		String str = ls.parallelStream() // ���� ó���� ���� ��Ʈ�� ����
				       .reduce("", lc);  // ��Ʈ���� �� ��� �� ���ڿ� ��ȯ
		System.out.println(str);
	}
}
