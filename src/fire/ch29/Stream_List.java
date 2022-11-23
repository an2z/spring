package src.fire.ch29;

/* �÷��� �ν��Ͻ� ��� ��Ʈ�� ���� */

import java.util.Arrays;
import java.util.List;

class Stream_List {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Red", "Black", "Blue");
		list.stream() // ��Ʈ�� ����
		    .forEach(s -> System.out.print(s + " ")); // ��Ʈ�� ����� ������ ����
		System.out.println();
	}
}
