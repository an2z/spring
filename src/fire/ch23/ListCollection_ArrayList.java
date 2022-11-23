package src.fire.ch23;

import java.util.List;
import java.util.ArrayList;

/* list �÷��� Ŭ���� (ArrayList & LikedList) */

class ListCollection_ArrayList {
	public static void main(String[] args) {
		// �÷��� �ν��Ͻ� ����
		List<String> list = new ArrayList<>(); 
//		List<String> list = new LinkedList<>();

		// add() �޼ҵ带 �̿��� ����� ����
		list.add("cat");
		list.add("dog");
		list.add("pig");

		// for���� get() �޼ҵ带 �̿��� ����� ���
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();

		// remove() �޼ҵ带 �̿��� ����� ����
		list.remove(0);
		
		// Enhanced for���� get() �޼ҵ带 �̿��� ����� ��� 
		for (String e : list)
			System.out.print(e + " ");
	}
}
