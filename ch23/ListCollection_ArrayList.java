package ch23;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/* list 컬렉션 클래스 (ArrayList & LikedList) */

class ListCollection_ArrayList {
	public static void main(String[] args) {
		// 컬렉션 인스턴스 생성
		List<String> list = new ArrayList<>(); 
//		List<String> list = new LinkedList<>();

		// add() 메소드를 이용한 요소의 저장
		list.add("cat");
		list.add("dog");
		list.add("pig");

		// for문과 get() 메소드를 이용한 요소의 출력
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();

		// remove() 메소드를 이용한 요소의 제거
		list.remove(0);
		
		// Enhanced for문과 get() 메소드를 이용한 요소의 출력 
		for (String e : list)
			System.out.print(e + " ");
	}
}