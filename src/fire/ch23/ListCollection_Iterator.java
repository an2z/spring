package src.fire.ch23;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* ����� �ν��Ͻ��� ������ ���� ��� (�ݺ��� ���) */

class ListCollection_Iterator {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("cat");
		list.add("dog");
		list.add("pig");
		list.add("cat");
		
		Iterator<String> itr = list.iterator(); // �ݺ��� ȹ��(1)
		
		// �ݺ��ڸ� �̿��� ������ ����
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
		
		itr = list.iterator(); // �ݺ��� ȹ��(2)
		
		// ��� "cat" ����
		String str;
		while(itr.hasNext()) {
			str = itr.next();
			if(str.equals("cat"))
				itr.remove();
		}
		
		itr = list.iterator(); // �ݺ��� ȹ��(3)
		
		// ���� �� ��� Ȯ��
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
	}
}
