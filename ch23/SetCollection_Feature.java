package ch23;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set 컬렉션 클래스
 * 인스턴스 저장 순서를 유지하지 않음
 * 동일 인스턴스의 중복 저장을 허용하지 않음 
 */

class SetCollection_Feature {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("cat");
		set.add("dog");
		set.add("pig");
		set.add("dog");
		System.out.println("저장된 인스턴스 수: " + set.size());
		
		// for-each문을 이용한 전체 출력
		for(String s : set)
			System.out.print(s + " ");
		System.out.println();
		
		// 반복자를 이용한 전체 출력
		for (Iterator<String> itr = set.iterator(); itr.hasNext();)
			System.out.print(itr.next() + " ");
		System.out.println();
	}
}