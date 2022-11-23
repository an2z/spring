package src.fire.ch23;

import java.util.HashSet;

/* Set �÷��� Ŭ���� (HashSet)
 * HashCode(), equals() �������̵� ��
 */

class Num {
	private int num;
	public Num(int num) { this.num = num; }
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
}

class SetCollection_HashSetEquals {
	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();
		set.add(new Num(7799));
		set.add(new Num(9955));
		set.add(new Num(7799)); // ���� �ν��Ͻ��� �������� ����
		System.out.println("����� �ν��Ͻ� ��: " + set.size());
		
		for(Num n : set)
			System.out.print(n.toString() + " ");
		System.out.println();
	}
}
