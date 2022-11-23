package src.fire.ch23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* HashMap<K, V> ������ ���� ��� 
 * keySet �޼ҵ� -> ������ ���� ����
 * 1) for-each��
 * 2) �ݺ��� 
 */

class MapCollection_HashMap_Iterator {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
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
