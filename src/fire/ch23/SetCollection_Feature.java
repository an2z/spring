package src.fire.ch23;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set �÷��� Ŭ����
 * �ν��Ͻ� ���� ������ �������� ����
 * ���� �ν��Ͻ��� �ߺ� ������ ������� ���� 
 */

class SetCollection_Feature {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("cat");
		set.add("dog");
		set.add("pig");
		set.add("dog");
		System.out.println("����� �ν��Ͻ� ��: " + set.size());
		
		// for-each���� �̿��� ��ü ���
		for(String s : set)
			System.out.print(s + " ");
		System.out.println();
		
		// �ݺ��ڸ� �̿��� ��ü ���
		for (Iterator<String> itr = set.iterator(); itr.hasNext();)
			System.out.print(itr.next() + " ");
		System.out.println();
	}
}
