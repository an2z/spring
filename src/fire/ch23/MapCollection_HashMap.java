package src.fire.ch23;

import java.util.HashMap;

/* �� �÷��� Ŭ����
 * HashMap<K, V> : ����X, ����X
 */

class MapCollection_HashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		// Key-Value ��� ������ ���� (put)
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		// ������ Ž�� (get)
		System.out.println("23��: " + map.get(23));
		System.out.println("37��: " + map.get(37));
		System.out.println("45��: " + map.get(45));
		System.out.println();
		
		// ������ ���� (remove)
		map.remove(37);
		
		// ������ ���� Ȯ��
		System.out.println("37��: " + map.get(37));
	}
}
