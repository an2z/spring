package src.fire.ch23;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/* TreeMap<K, V> ������ ���� ���
 * Comparator<T> �������̽� ������ ���� ���� ���� ����
 * keySet �޼ҵ� -> ������ ���� ����
 * 1) for-each��
 * 2) �ݺ���
 */

class AgeComparator implements Comparator<Integer> {
	public int compare(Integer n1, Integer n2) {
		return n2.intValue() - n1.intValue(); // �������� ����
	}
}

class MapCollection_TreeMap_Comparator {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>(new AgeComparator());
		
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		// key�� ��� �ִ� �÷��� �ν��Ͻ� ���� (keySet)
		Set<Integer> ks = map.keySet();
		
		/* 1) for-each�� */
		// ��ü key ���
		for (Integer n : ks)
			System.out.print(n + " ");
		System.out.println();
		
		// ��ü value ���
		for (Integer n : ks)
			System.out.print(map.get(n) + " ");
		System.out.println();
		
		/* 2) �ݺ��� */
		// ��ü key ���
		for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.print(itr.next() + " ");
		System.out.println();
		
		// ��ü value ���
		for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.print(map.get(itr.next()) + " ");
		System.out.println();
	}
}
