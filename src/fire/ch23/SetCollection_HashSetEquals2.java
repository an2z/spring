package src.fire.ch23;

import java.util.HashSet;

/* Set �÷��� Ŭ���� (HashSet)
 * HashCode(), equals() �������̵� ��
 */

class Num2 {
	private int num;
	public Num2(int num) { this.num = num; }
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override // ObjectŬ������ hashCode�޼ҵ� �������̵�
	public int hashCode() {
		return num % 3; // num�� ���� ������ �η��� ����.
	}
	
	@Override // ObjectŬ������ equals�޼ҵ� �������̵�
	public boolean equals(Object obj) { // num�� ���� ������ true ��ȯ
		if(num == ((Num2)obj).num)
			return true;
			
		else
			return false;
	}
}

class SetCollection_HashSetEquals2 {
	public static void main(String[] args) {
		HashSet<Num2> set = new HashSet<>();
		set.add(new Num2(7799));
		set.add(new Num2(9955));
		set.add(new Num2(7799));
		System.out.println("����� �ν��Ͻ� ��: " + set.size());
		
		for (Num2 n : set)
			System.out.print(n + " ");
		System.out.println();
	}
}
