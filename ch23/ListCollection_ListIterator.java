package ch23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* 양방향 반복자 (listIterator) */

class ListCollection_ListIterator {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("cat", "dog", "pig", "cat");
		list = new ArrayList<>(list);
		
		ListIterator<String> litr = list.listIterator(); // 양방향 반복자 생성
		
		String str;
		// 왼쪽에서 오른쪽으로 이동을 위한 반복문
		while(litr.hasNext()) {
			str = litr.next();
			System.out.print(str + " ");
			if(str.equals("dog")) // "dog" 만나면 "dog2" 저장
				litr.add("dog2");
		}
		System.out.println();
		
		// 오른쪽에서 왼쪽으로 이동을 위한 반복문
		while(litr.hasPrevious()) {
			str = litr.previous();
			System.out.print(str + " ");
			if(str.equals("pig")) // "pig" 만나면 "pig2" 저장
				litr.add("pig2");
		}
		System.out.println();
		
		// 다시 왼쪽에서 오른쪽으로
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + " ");
		System.out.println();
	}
}