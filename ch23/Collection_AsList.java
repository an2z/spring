package ch23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* 컬렉션 반환 (AsList) */

class Collection_AsList {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("cat", "dog", "pig", "cat");
		list = new ArrayList<>(list);
		
		// for문 기반의 반복자 획득과 순차적 참조
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + " ");
		System.out.println();
		
		// "cat"을 모두 삭제하기 위한 반복문
		for(Iterator<String> itr = list.iterator(); itr.hasNext();) {
			if(itr.next().equals("cat"))
				itr.remove();
		}
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + " ");
		System.out.println();
	}
}