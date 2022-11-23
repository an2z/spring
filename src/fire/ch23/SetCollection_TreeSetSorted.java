package src.fire.ch23;

import java.util.Iterator;
import java.util.TreeSet;

/* Set �÷��� Ŭ���� (TreeSet)
 * Ʈ����� �ڷᱸ�� Ư���� ���ĵ� ���°� �����Ǹ鼭 �ν��Ͻ��� �����
 */

class SetCollection_TreeSetSorted {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		
		// add �޼ҵ带 ���� ��� ����
		tree.add(3);
		tree.add(1);
		tree.add(2);
		tree.add(4);	
		System.out.println("�ν��Ͻ� ��: " + tree.size()); // size �޼ҵ带 ���� ����� �� ����
		
		// for-each���� ���� ��ü ���
		for (Integer n : tree)
			System.out.print(n + " ");
		System.out.println();
		
		// remove �޼ҵ带 ���� ��� ����
		tree.remove(2);
		System.out.println("�ν��Ͻ� ��: " + tree.size()); // size �޼ҵ带 ���� ����� �� ����
		
		// Iterator �ݺ��ڸ� ���� ��ü ���
		for (Iterator<Integer> itr = tree.iterator(); itr.hasNext();)
			System.out.print(itr.next() + " ");
		System.out.println();
	}
}
