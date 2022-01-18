package ch23;

import java.util.LinkedList;
import java.util.List;

/* 저장된 인스턴스의 순차적 접근 방법 (enhanced for문 사용) */

class Collection_EnhancedFor {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		// 인스턴스 저장
		list.add("cat");
		list.add("dog");
		list.add("pig");
		
		// 전체 인스턴스 참조 (enhanced for문 사용)
		for(String s : list)
			System.out.print(s + " ");
		System.out.println();
		
		// 인스턴스 삭제
		list.remove(0);
		
		// 전체 인스턴스 참조
		for(String s : list)
			System.out.print(s + " ");
		System.out.println();
	}
}