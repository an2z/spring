package ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* 컬렉션 기반 알고리즘 (정렬)
 * Comparable<? super T>
 */

class Car2 implements Comparable<Car2> {
	protected int disp; // 배기량

	public Car2(int d) {
		disp = d;
	}

	@Override
	public String toString() {
		return "cc: " + disp;
	}

	@Override
	public int compareTo(Car2 o) {
		return disp - o.disp; // 오름차순
	}
}

class ECar extends Car2 { // 전기 자동차를 표현한 클래스
	private int battery;  // 배터리
	
	public ECar(int d, int b) {
		super(d); // 상위 클래스 생성자 호출
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
		Collections.sort(list); // 정렬
		
		for(Iterator<ECar> itr = list.iterator(); itr.hasNext();) // 출력
			System.out.println(itr.next() + " ");
	}
}