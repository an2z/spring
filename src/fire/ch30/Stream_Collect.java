package src.fire.ch30;

/* ��Ʈ���� ���� ���� (collect) */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Stream_Collect {
	public static void main(String[] args) {
		String[] names = {"anne", "wuga", "jeong", "jun"};
		
		Stream<String> ss = Arrays.stream(names); // ��Ʈ�� ����
		
		List<String> ls = ss.parallel() // ���� ��Ʈ������ ��ȯ
				            .filter(s -> s.length() < 5) // ���ڿ� ���� 5 �̸��� �͸� ���
				            .collect(() -> new ArrayList<>(), // ����� ����
				            		 (c, s) -> c.add(s),      // ����ҿ� ����� ��Ʈ�� ��� ����
				            		 (ls1, ls2) -> ls1.addAll(ls2)); // ���� ó�� ����� �����ϴ� ���
		System.out.println(ls);
	}
}
