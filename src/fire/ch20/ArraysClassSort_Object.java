package src.fire.ch20;

import java.util.Arrays;

/* �迭 ���� �޼ҵ� (Object�� �迭�� sort)
 * Object�� �迭�� �����Ϸ��� comparable �������̽��� ��������� ��
 * compareTo() �޼ҵ� ������ ���� ��ü�� ���� �Ǵ� ������ ����
 */

class Person implements Comparable {	// Comarable �������̽��� ����
	private String name;
    private int age;
    
    public Person(String name, int age) {
    	this.name = name;
        this.age = age;
    }
    
    @Override	// ���̰� � �ν��Ͻ��� ũ�Ⱑ ���� ������ �����ϵ��� �������̵� ����
	/* compareTo() �������1 */
//    public int compareTo(Object o) {
//    	Person p = (Person)o;
//    	
//    	if (this.age > p.age)
//    		return 1;				// ���ڷ� ���޵� o�� �۴ٸ� ��� ��ȯ
//    	else if (this.age < p.age)
//    		return -1;				// ���ڷ� ���޵� o�� ũ�ٸ� ���� ��ȯ
//    	else			
//    		return 0;				// ���ڷ� ���޵� o�� ���ٸ� 0 ��ȯ
//    }
    
	/* compareTo() �������2 */
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
