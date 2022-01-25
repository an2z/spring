package ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 컬렉션 기반 알고리즘 (찾기) 
 * BinarySearch 메소드는 이진탐색 알고리즘 사용
 * 따라서 정렬된 상태에서 호출해야 정상적인 결과를 얻을 수 있음
 */

// String 정렬 및 탐색을 위한 클래스 정의
class StrComp implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.compareToIgnoreCase(s2); // 대문자, 소문자 구분 없이 비교
	}
}

class BinarySearchCollections_String_Comparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ROBOT");
		list.add("APPLE");
		list.add("BOX");
		
		StrComp comp = new StrComp(); // 정렬과 탐색의 기준
		
		Collections.sort(list); // 정렬
		int idx = Collections.binarySearch(list, "Robot", comp); // comp 기준을 적용해 탐색
		
		System.out.println(idx + ". " + list.get(idx)); // 탐색 결과 출력
	}
}