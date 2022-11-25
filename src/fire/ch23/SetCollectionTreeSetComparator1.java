package src.fire.ch23;

import java.util.Comparator;
import java.util.TreeSet;

/* TreeSet의 정렬 기준 마련 (Comparator 인터페이스 구현) */
class SetCollectionTreeSetComparator1 {
    public static void main(String[] args) {
        TreeSet<Person> tree = new TreeSet<>(new PersonComparator());

        tree.add(new Person("anne", 26));
//		tree.add(new Person2("wuga", 26));
        tree.add(new Person("jeong", 25));
        tree.add(new Person("jun", 27));

        for (Person p : tree) {
            System.out.println(p + " ");
        }
    }

    static class Person implements Comparable<Person> {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " : " + age;
        }

        @Override
        public int compareTo(Person p) {
            return this.age - p.age;
        }
    }

    static class PersonComparator implements Comparator<Person> {
        public int compare(Person p1, Person p2) {
            return p2.age - p1.age; // 나이가 많은 사람을 앞에 세우는 연산
        }
    }
}
