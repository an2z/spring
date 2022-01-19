package ch23;

import java.util.Iterator;
import java.util.TreeSet;

/* Set 컬렉션 클래스 (TreeSet)
 * 트리라는 자료구조 특성상 정렬된 상태가 유지되면서 인스턴스가 저장됨
 */

class SetCollection_TreeSetSorted {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		
		// add 메소드를 통한 요소 저장
		tree.add(3);
		tree.add(1);
		tree.add(2);
		tree.add(4);	
		System.out.println("인스턴스 수: " + tree.size()); // size 메소드를 통한 요소의 총 개수
		
		// for-each문을 통한 전체 출력
		for (Integer n : tree)
			System.out.print(n + " ");
		System.out.println();
		
		// remove 메소드를 통한 요소 삭제
		tree.remove(2);
		System.out.println("인스턴스 수: " + tree.size()); // size 메소드를 통한 요소의 총 개수
		
		// Iterator 반복자를 통한 전체 출력
		for (Iterator<Integer> itr = tree.iterator(); itr.hasNext();)
			System.out.print(itr.next() + " ");
		System.out.println();
	}
}