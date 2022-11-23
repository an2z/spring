package src.fire.ch23;

import java.util.LinkedList;
import java.util.List;

/* ����� �ν��Ͻ��� ������ ���� ��� (enhanced for�� ���) */

class ListCollection_EnhancedFor {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		// �ν��Ͻ� ����
		list.add("cat");
		list.add("dog");
		list.add("pig");
		
		// ��ü �ν��Ͻ� ���� (enhanced for�� ���)
		for(String s : list)
			System.out.print(s + " ");
		System.out.println();
		
		// �ν��Ͻ� ����
		list.remove(0);
		
		// ��ü �ν��Ͻ� ����
		for(String s : list)
			System.out.print(s + " ");
		System.out.println();
	}
}
