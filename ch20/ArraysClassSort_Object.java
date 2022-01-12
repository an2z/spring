package ch20;

import java.util.Arrays;

/* 배열 정렬 메소드 (Object형 배열의 sort)
 * Object형 배열을 정렬하려면 comparable 인터페이스를 구현해줘야 함
 * compareTo() 메소드 구현을 통해 객체의 순서 판단 기준을 결정
 */

class Person implements Comparable {	// Comarable 인터페이스를 구현
	private String name;
    private int age;
    
    public Person(String name, int age) {
    	this.name = name;
        this.age = age;
    }
    
    @Override	// 나이가 어린 인스턴스의 크기가 작은 것으로 결정하도록 오버라이딩 진행
	/* compareTo() 구현방법1 */
//    public int compareTo(Object o) {
//    	Person p = (Person)o;
//    	
//    	if (this.age > p.age)
//    		return 1;				// 인자로 전달된 o가 작다면 양수 반환
//    	else if (this.age < p.age)
//    		return -1;				// 인자로 전달된 o가 크다면 음수 반환
//    	else			
//    		return 0;				// 인자로 전달된 o와 같다면 0 반환
//    }
    
	/* compareTo() 구현방법2 */
    public int compareTo(Object o) {
    	Person p = (Person)o;
    	return this.age - p.age;
    }
    
    @Override
    public String toString() {
    	return name + " : " + age;
    }
}

class ArraysClassSort_Object {
	public static void main(String[] args) {
		Person[] ar = new Person[4];
		ar[0] = new Person("wuga", 26);
		ar[1] = new Person("june", 27);
		ar[2] = new Person("hyeon", 25);
		ar[3] = new Person("anne", 26);
		
		Arrays.sort(ar);
		for(Person p : ar)
			System.out.println(p);
	}
}