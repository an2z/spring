package src.fire.ch23;

import java.util.Comparator;
import java.util.TreeSet;

/* TreeSet�� ���� ���� ���� (Comparator �������̽� ����) */

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
		return p2.age - p1.age; // ���̰� ���� ����� �տ� ����� ����
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
