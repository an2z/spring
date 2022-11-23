package src.fire.ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* �÷��� ��� �˰��� (����)
 * Comparable<? super T>
 */

class Car2 implements Comparable<Car2> {
	protected int disp; // ��ⷮ

	public Car2(int d) {
		disp = d;
	}

	@Override
	public String toString() {
		return "cc: " + disp;
	}

	@Override
	public int compareTo(Car2 o) {
		return disp - o.disp; // ��������
	}
}

class ECar extends Car2 { // ���� �ڵ����� ǥ���� Ŭ����
	private int battery;  // ���͸�
	
	public ECar(int d, int b) {
		super(d); // ���� Ŭ���� ������ ȣ��
		battery = b;
	}

	@Override
	public String toString() {
		return "cc: " + disp + ", ba: " + battery;
	}
}

class SortCollections_ECar {
	public static void main(String[] args) {
		List<ECar> list = new ArrayList<ECar>();
		list.add(new ECar(1200, 99));
		list.add(new ECar(3000, 55));
		list.add(new ECar(1800, 87));
		Collections.sort(list); // ����
		
		for(Iterator<ECar> itr = list.iterator(); itr.hasNext();) // ���
			System.out.println(itr.next() + " ");
	}
}
