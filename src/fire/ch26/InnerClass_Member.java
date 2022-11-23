package src.fire.ch26;

/* ��� Ŭ����
 * �ν��Ͻ� ����, �ν��Ͻ� �޼ҵ�� ������ ��ġ�� ���ǵǴ� Ŭ���� 
 */

class Outer2 {
	private int num =0; // �ν��Ͻ� ����
	
	class Member { // ��� Ŭ���� ����
		void add(int n) { num += n; } 
		int get() { return num; }
	}
}

class InnerClass_Member {
	public static void main(String[] args) {
		Outer2 o1 = new Outer2();
		Outer2 o2 = new Outer2();
		
		// o1 ������� ��� Ŭ���� �ν��Ͻ� ����
		Outer2.Member o1m1 = o1.new Member();
		Outer2.Member o1m2 = o1.new Member();
		
		
		// o2 ������� ��� Ŭ���� �ν��Ͻ� ����
		Outer2.Member o2m1 = o2.new Member();
		Outer2.Member o2m2 = o2.new Member();
		
		// o1 ������� ������ �ν��Ͻ� �޼ҵ� ȣ��
		o1m1.add(5);
		System.out.println(o1m2.get());
		
		// o2 ������� ������ �ν��Ͻ� �޼ҵ� ȣ��
		o2m1.add(7);
		System.out.println(o2m2.get());
	}
}
