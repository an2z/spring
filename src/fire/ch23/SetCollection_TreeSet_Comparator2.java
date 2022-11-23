package src.fire.ch23;

import java.util.Comparator;
import java.util.TreeSet;

/* TreeSet�� ���� ���� ���� (Comparator �������̽� ����) */

class StringComparator implements Comparator<String> {
	public int compare(String s1, String s2) {
		return s1.length() - s2.length(); // ���ڿ��� ���̸� �������� ����(ª�� -> ��)
	}
}

class SetCollection_TreeSet_Comparator2 {
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>(new StringComparator());
		tree.add("pig");
		tree.add("monkey");
		tree.add("tiger");
		
		for(String s : tree)
			System.out.print(s + " ");
		System.out.println();
	}
}
