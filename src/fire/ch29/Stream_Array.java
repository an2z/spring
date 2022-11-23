package src.fire.ch29;

/* �迭 ��� ��Ʈ�� ���� */

import java.util.Arrays;
import java.util.stream.Stream;

class Stream_Array {
	public static void main(String[] args) {
		String[] names = {"��", "��", "��", "��"};
		
		// �迭 ��ü�� �̿��� ��Ʈ�� ����
		Stream<String> stm1 = Arrays.stream(names);
		stm1.forEach(s -> System.out.print(s + " ")); // ���� ����
		System.out.println();
		
		// �迭�� Ư�� �κи��� �̿��� ��Ʈ�� ����
		Stream<String> stm2 = Arrays.stream(names, 1, 3);
		stm2.forEach(s -> System.out.print(s + " ")); //  ���� ����
		System.out.println();
		
		// �ڵ� ���̱�
		Arrays.stream(names)
		      .forEach(s -> System.out.print(s + " "));
	}
}
