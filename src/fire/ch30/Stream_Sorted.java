package src.fire.ch30;

/* ��Ʈ���� �߰� ���� (sorted) */

import java.util.stream.Stream;

class Stream_Sorted {
	public static void main(String[] args) {
		Stream.of("Red", "Blue", "Yellow")
		      .sorted() // �⺻������ ���� ���� �� �������� ����
		      .forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		Stream.of("Red", "Blue", "Yellow")
		      .sorted((s1, s2) -> s1.length() - s2.length()) // ���ڼ��� �������� �������� ����
		      .forEach(s -> System.out.print(s + " "));
	}
}
