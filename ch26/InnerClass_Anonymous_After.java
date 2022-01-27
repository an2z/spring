package ch26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 익명 클래스 후 */

class InnerClass_Anonymous_After {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		
		Comparator<String> cmp = new Comparator<String>() { // 익명 클래스 정의
			@Override
			public int compare(String s1, String s2) { // 추상메소드 구현 내용
				return s1.length() - s2.length();
			}
		};
		
		Collections.sort(list);
		System.out.println(list);
	}
}