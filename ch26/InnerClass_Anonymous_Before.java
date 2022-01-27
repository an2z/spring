package ch26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 익명 클래스 전 */

class StrComp implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

class InnerClass_Anonymous_Before {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		
		StrComp cmp = new StrComp(); // 정렬 기준		
		Collections.sort(list, cmp); // 정렬 기준 변경해서 정렬 진행
		
		System.out.println(list);
	}
}