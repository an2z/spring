package ch23;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* 저장된 인스턴스의 순차적 접근 방법 (반복자 사용) */

class ListCollection_Iterator {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("cat");
		list.add("dog");
		list.add("pig");
		list.add("cat");
		
		Iterator<String> itr = list.iterator(); // 반복자 획득(1)
		
		// 반복자를 이용한 순차적 참조
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
		
		itr = list.iterator(); // 반복자 획득(2)
		
		// 모든 "cat" 삭제
		String str;
		while(itr.hasNext()) {
			str = itr.next();
			if(str.equals("cat"))
				itr.remove();
		}
		
		itr = list.iterator(); // 반복자 획득(3)
		
		// 삭제 후 결과 확인
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
	}
}