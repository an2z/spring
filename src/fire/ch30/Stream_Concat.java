package src.fire.ch30;

/* ��Ʈ���� ���� (concat) */

import java.util.stream.Stream;

class Stream_Concat {
	public static void main(String[] args) {
		Stream<String> ss1 = Stream.of("Cake", "Milk");
		Stream<String> ss2 = Stream.of("Lemon", "Jelly");
		
		// �ΰ� ��Ʈ�� ����
		Stream.concat(ss1, ss2)
		      .forEach(s -> System.out.print(s + " "));
	}
}
