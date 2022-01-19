package ch23;

import java.util.HashSet;

/* Set 컬렉션 클래스 (HashSet)
 * HashCode(), equals() 오버라이딩 후
 */

class Num2 {
	private int num;
	public Num2(int num) { this.num = num; }
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override // Object클래스의 hashCode메소드 오버라이딩
	public int hashCode() {
		return num % 3; // num의 값이 같으면 부류도 같다.
	}
	
	@Override // Object클래스의 equals메소드 오버라이딩
	public boolean equals(Object obj) { // num의 값이 같으면 true 반환
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
		System.out.println("저장된 인스턴스 수: " + set.size());
		
		for (Num2 n : set)
			System.out.print(n + " ");
		System.out.println();
	}
}