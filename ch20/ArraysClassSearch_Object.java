package ch20;

import java.util.Arrays;

/* 배열 탐색 메소드 (binarySearch)
 * binarySearch 메소드가 동일한 객체를 찾았다고 판단하는 기준은 Comparable 인터페이스의 compareTo 메소드이다.
 * comparaTo 메소드 호출을 통해 0이 반환되면 동일한 객체를 찾았다고 판단한다.
 */

class Friend implements Comparable {	// Comarable 인터페이스를 구현
	private String name;
    private int age;
    
    public Friend(String name, int age) {
    	this.name = name;
        this.age = age;
    }
    
    @Override
    public int compareTo(Object o) {
    	Friend p = (Friend)o;
    	return this.age - p.age;	// 나이가 같으면 0을 반환
    }
    
    @Override
    public String toString() {
    	return name + " : " + age;
    }
}

class ArraysClassSearch_Object {
	public static void main(String[] args) {
		Friend[] ar = new Friend[4];
		ar[0] = new Friend("wuga", 26);
		ar[1] = new Friend("june", 27);
		ar[2] = new Friend("hyeon", 25);
		ar[3] = new Friend("anne", 26);
		
		Arrays.sort(ar);	// 탐색에 앞서 정렬을 진행
		
		int idx = Arrays.binarySearch(ar, new Friend("who are you?", 27));	// 나이가 27인 객체 탐색
		System.out.println(ar[idx]);
	}
}