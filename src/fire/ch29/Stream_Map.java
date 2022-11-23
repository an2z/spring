package src.fire.ch29;

/* ��Ʈ���� �߰� ����(����) */

import java.util.Arrays;
import java.util.List;

class Stream_Map {
	public static void main(String[] args) {
		List<String> li = Arrays.asList("Red", "Black", "Blue");
		li.stream()
		  .map(s -> s.length())
		  .forEach(s -> System.out.print(s + " "));
	}
}
