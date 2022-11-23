package src.fire.ch27;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/* �Լ��� �������̽� (Supplier)
 * �޼ҵ� ȣ�� �� ���𰡸� ��ȯ
 */

class FunctionalInterface_Supplier {
	public static List<Integer> makeList(Supplier<Integer> s, int n) {
		List<Integer> list = new ArrayList<>(); // �÷��� �ν��Ͻ� ����

		for (int i = 0; i < n; i++)
			list.add(s.get()); // ������ ������ ��´�.

		return list;
	}

	public static void main(String[] args) {
		Supplier<Integer> spr = () -> {
			Random rand = new Random();
			return rand.nextInt(50);
		};

		List<Integer> list = makeList(spr, 5);
		System.out.println(list);

		list = makeList(spr, 10);
		System.out.println(list);
	}
}
