package src.fire.ch19;

/* objectŬ������ �޼ҵ� (Equals)
 * �ν��Ͻ��� ���� �񱳸� ���� ����� equals �޼ҵ忡 ��� ����
 */

class Inum {
	private int num;
	
	public Inum(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((Inum)obj).num)
			return true;
		else
			return false;
	}
}

class ObjectEqualityMethod {
	public static void main(String[] args) {
		Inum num1 = new Inum(10);
		Inum num2 = new Inum(15);
		Inum num3 = new Inum(10);
		
		if (num1.equals(num2))
			System.out.println("num1, num2 ������ �����մϴ�.");
		else
			System.out.println("num1, num2 ������ �ٸ��ϴ�.");
		
		if (num1.equals(num3))
			System.out.println("num1. num2 ������ �����մϴ�.");
		else
			System.out.println("num1, num3 ������ �ٸ��ϴ�.");
	}
}
