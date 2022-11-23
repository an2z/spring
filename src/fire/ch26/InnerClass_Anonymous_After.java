package src.fire.ch26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* �͸� Ŭ���� �� */

class InnerClass_Anonymous_After {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		
		Comparator<String> cmp = new Comparator<String>() { // �͸� Ŭ���� ����
			@Override
			public int compare(String s1, String s2) { // �߻�޼ҵ� ���� ����
				return s1.length() - s2.length();
			}
		};
		
		Collections.sort(list);
		System.out.println(list);
	}
}
