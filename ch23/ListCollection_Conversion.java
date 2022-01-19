package ch23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* 컬렉션 반환 (ArrayList<E>을 LinkedList<E>로 변환) */

class ListCollection_Conversion {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("cat", "dog", "pig", "cat");
		list = new ArrayList<>(list);
		
		// ArrayList<E> 인스턴스의 순차적 접근
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + " ");
		System.out.println();
		
		// ArrayList<E> 인스턴스 기반으로 LinkedList<E> 인스턴스 생성
		list = new LinkedList<>(list);
		
		// LinkedList<E> 인스턴스의 순차적 접근
		for(Iterator<String> itr = list.iterator(); itr.hasNext();) 
			System.out.print(itr.next() + " ");
		System.out.println();
	}
}