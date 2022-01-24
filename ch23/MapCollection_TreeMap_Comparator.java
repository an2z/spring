package ch23;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/* TreeMap<K, V> 순차적 접근 방법
 * Comparator<T> 인터페이스 구현을 통해 정렬 기준 설정
 * keySet 메소드 -> 순차적 접근 가능
 * 1) for-each문
 * 2) 반복자
 */

class AgeComparator implements Comparator<Integer> {
	public int compare(Integer n1, Integer n2) {
		return n2.intValue() - n1.intValue(); // 내림차순 정렬
	}
}

class MapCollection_TreeMap_Comparator {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>(new AgeComparator());
		
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		// key만 담고 있는 컬렉션 인스턴스 생성 (keySet)
		Set<Integer> ks = map.keySet();
		
		/* 1) for-each문 */
		// 전체 key 출력
		for (Integer n : ks)
			System.out.print(n + " ");
		System.out.println();
		
		// 전체 value 출력
		for (Integer n : ks)
			System.out.print(map.get(n) + " ");
		System.out.println();
		
		/* 2) 반복자 */
		// 전체 key 출력
		for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.print(itr.next() + " ");
		System.out.println();
		
		// 전체 value 출력
		for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.print(map.get(itr.next()) + " ");
		System.out.println();
	}
}