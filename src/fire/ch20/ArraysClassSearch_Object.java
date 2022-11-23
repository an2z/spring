package src.fire.ch20;

import java.util.Arrays;

/* �迭 Ž�� �޼ҵ� (binarySearch)
 * binarySearch �޼ҵ尡 ������ ��ü�� ã�Ҵٰ� �Ǵ��ϴ� ������ Comparable �������̽��� compareTo �޼ҵ��̴�.
 * comparaTo �޼ҵ� ȣ���� ���� 0�� ��ȯ�Ǹ� ������ ��ü�� ã�Ҵٰ� �Ǵ��Ѵ�.
 */

class Friend implements Comparable {	// Comarable �������̽��� ����
	private String name;
    private int age;
    
    public Friend(String name, int age) {
    	this.name = name;
        this.age = age;
    }
    
    @Override
    public int compareTo(Object o) {
    	Friend p = (Friend)o;
    	return this.age - p.age;	// ���̰� ������ 0�� ��ȯ
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
		
		Arrays.sort(ar);	// Ž���� �ռ� ������ ����
		
		int idx = Arrays.binarySearch(ar, new Friend("who are you?", 27));	// ���̰� 27�� ��ü Ž��
		System.out.println(ar[idx]);
	}
}
