package src.fire.ch23;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/* �� �÷��� Ŭ����
 * TreeMap<K, V> : ����X, ����O
 */

class MapCollection_TreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		
		// Key-Value ��� ������ ���� (put)
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		// key�� ��� �ִ� �÷��� �ν��Ͻ� ���� (keySet)
		Set<Integer> ks = map.keySet();
		
		// ��ü key ��� (for-each�� ���)
		for (Integer n : ks)
			System.out.print(n + " ");
		System.out.println();
		
		// ��ü value ��� (for-each�� ���)
		for (Integer n : ks)
			System.out.print(map.get(n) + " ");
		System.out.println();
		
		// ��ü value ��� (�ݺ��� ���)
		for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.print(map.get(itr.next()) + " ");
		System.out.println();
	}
}
