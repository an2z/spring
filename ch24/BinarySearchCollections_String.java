package ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 컬렉션 기반 알고리즘 (찾기) 
 * BinarySearch 메소드는 이진탐색 알고리즘 사용
 * 따라서 정렬된 상태에서 호출해야 정상적인 결과를 얻을 수 있음
 */

class BinarySearchCollections_String {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Box");
		list.add("Robot");
		list.add("Apple");
		
		Collections.sort(list); // 정렬
		int idx = Collections.binarySearch(list, "Robot"); // 탐색
		
		System.out.println(idx + ". " + list.get(idx)); // 탐색 결과 출력
	}
}