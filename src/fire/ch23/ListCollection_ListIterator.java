package src.fire.ch23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* ����� �ݺ��� (listIterator) */

class ListCollection_ListIterator {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("cat", "dog", "pig", "cat");
		list = new ArrayList<>(list);
		
		ListIterator<String> litr = list.listIterator(); // ����� �ݺ��� ����
		
		String str;
		// ���ʿ��� ���������� �̵��� ���� �ݺ���
		while(litr.hasNext()) {
			str = litr.next();
			System.out.print(str + " ");
			if(str.equals("dog")) // "dog" ������ "dog2" ����
				litr.add("dog2");
		}
		System.out.println();
		
		// �����ʿ��� �������� �̵��� ���� �ݺ���
		while(litr.hasPrevious()) {
			str = litr.previous();
			System.out.print(str + " ");
			if(str.equals("pig")) // "pig" ������ "pig2" ����
				litr.add("pig2");
		}
		System.out.println();
		
		// �ٽ� ���ʿ��� ����������
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + " ");
		System.out.println();
	}
}
