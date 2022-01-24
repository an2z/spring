package ch23;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/* 맵 컬렉션 클래스
 * TreeMap<K, V> : 순서X, 정렬O
 */

class MapCollection_TreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		
		// Key-Value 기반 데이터 저장 (put)
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		// key만 담고 있는 컬렉션 인스턴스 생성 (keySet)
		Set<Integer> ks = map.keySet();
		
		// 전체 key 출력 (for-each문 기반)
		for (Integer n : ks)
			System.out.print(n + " ");
		System.out.println();
		
		// 전체 value 출력 (for-each문 기반)
		for (Integer n : ks)
			System.out.print(map.get(n) + " ");
		System.out.println();
		
		// 전체 value 출력 (반복자 기반)
		for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.print(map.get(itr.next()) + " ");
		System.out.println();
	}
}