package src.fire.ch27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* �ν��Ͻ����� �ϳ��� ����� �ʿ��� ��Ȳ�� ���� ���� */

class SLenComp implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

class Lambda_SLenComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Box");
		list.add("Toy");
		list.add("Robot");
		
		Collections.sort(list, new SLenComp()); // ����
		
		for(String s : list)
			System.out.println(s);
	}
}
