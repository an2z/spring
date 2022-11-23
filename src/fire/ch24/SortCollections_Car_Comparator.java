package src.fire.ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* �÷��� ��� �˰��� (����)
 * Comparator<? super T>
 */

class Car3 {
	protected int disp; // ��ⷮ

	public Car3(int d) {
		disp = d;
	}

	@Override
	public String toString() {
		return "cc: " + disp;
	}
}

// Car�� ������ ���� Ŭ���� ����
class CarComp implements Comparator<Car3> {
	@Override
	public int compare(Car3 o1, Car3 o2) {
		return o1.disp - o2.disp;
	}
}

class ECar3 extends Car3 {
	private int battery; // ���͸�
	
	public ECar3(int d, int b) {
		super(d);
		battery = b;
	}
	
	@Override
	public String toString() {
		return "cc: " + disp + " ,ba: " + battery;
	}

}


class SortCollections_Car_Comparator {
	public static void main(String[] args) {
		List<Car3> clist = new ArrayList<Car3>();
		clist.add(new Car3(1800));
		clist.add(new Car3(1200));
		clist.add(new Car3(3000));
		
		List<ECar3> elist = new ArrayList<ECar3>();
		elist.add(new ECar3(3000, 55));
		elist.add(new ECar3(1800, 87));
		elist.add(new ECar3(1200, 99));
		
		CarComp comp = new CarComp();
		
		// ���� ����
		Collections.sort(clist, comp);
		Collections.sort(elist, comp); // �� ������ �� ������ �ٽ�
		
		for (Iterator<Car3> itr = clist.iterator(); itr.hasNext();)
			System.out.println(itr.next() + " ");
		System.out.println();
		
		for (Iterator<ECar3> itr = elist.iterator(); itr.hasNext();)
			System.out.println(itr.next() + " ");
	}
}
