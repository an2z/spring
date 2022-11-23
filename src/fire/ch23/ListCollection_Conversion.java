package src.fire.ch23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* �÷��� ��ȯ (ArrayList<E>�� LinkedList<E>�� ��ȯ) */

class ListCollection_Conversion {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("cat", "dog", "pig", "cat");
		list = new ArrayList<>(list);
		
		// ArrayList<E> �ν��Ͻ��� ������ ����
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + " ");
		System.out.println();
		
		// ArrayList<E> �ν��Ͻ� ������� LinkedList<E> �ν��Ͻ� ����
		list = new LinkedList<>(list);
		
		// LinkedList<E> �ν��Ͻ��� ������ ����
		for(Iterator<String> itr = list.iterator(); itr.hasNext();) 
			System.out.print(itr.next() + " ");
		System.out.println();
	}
}
