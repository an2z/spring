package ch23;

import java.util.Comparator;
import java.util.TreeSet;

/* TreeSet의 정렬 기준 마련 (Comparator 인터페이스 구현) */

class Person2 implements Comparable<Person2> {
	String name;
	int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}
	
	@Override
	public int compareTo(Person2 p) {
		return this.age - p.age;
	}
}

class PersonComparator implements Comparator<Person2> {
	public int compare(Person2 p1, Person2 p2) {
		return p2.age - p1.age; // 나이가 많은 사람을 앞에 세우는 연산
	}
}

class SetCollection_TreeSet_Comparator {
	public static void main(String[] args) {
		TreeSet<Person2> tree = new TreeSet<>(new PersonComparator());
		
		tree.add(new Person2("anne", 26));
//		tree.add(new Person2("wuga", 26));
		tree.add(new Person2("jeong", 25));
		tree.add(new Person2("jun", 27));
		
		for(Person2 p : tree)
			System.out.println(p + " ");
	}
}