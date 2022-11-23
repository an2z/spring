package src.fire.ch23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* �÷��� ��ȯ (AsList) */

class ListCollection_AsList {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("cat", "dog", "pig", "cat");
		list = new ArrayList<>(list);
		
		// for�� ����� �ݺ��� ȹ��� ������ ����
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + " ");
		System.out.println();
		
		// "cat"�� ��� �����ϱ� ���� �ݺ���
		for(Iterator<String> itr = list.iterator(); itr.hasNext();) {
			if(itr.next().equals("cat"))
				itr.remove();
		}
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + " ");
		System.out.println();
	}
}
