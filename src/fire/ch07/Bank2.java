package src.fire.ch07;

/* ���������� Ư�� */
class Bank02 {
	int balance = 0;
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int chekbalance() {
		System.out.println("�ܾ�: " + balance);
		return balance;
	}
}


public class Bank2 {
	public static void main(String[] args) {		
		Bank02 ref1 = new Bank02();
		Bank02 ref2 = new Bank02();  // ref1�� �����ϴ� ����� ref2�� ����
		
		ref1.deposit(3000);
		ref2.deposit(3000);
		ref1.withdraw(400);
		ref2.withdraw(400);
		ref1.chekbalance();
		ref2.chekbalance();
		
		/* ���������� �Ű����� ���� */
		check(ref1);  // ���������� ��� �ִ� ���� ����(�ν��Ͻ��� �ּ� ��) ����
		
		/* ���������� null ���� */
		ref1 = null;  // ���������� �����ϴ� �ν��Ͻ����� ���踦 ����
//		ref.chekbalance();  // ������ ���� �߻�
	}
	
	
	public static void check(Bank02 acc) {  // ���� ���� �������� acc�� ����, �� ref�� acc�� �ν��Ͻ� �ּҰ��� ���� ����
		acc.chekbalance();
	}
	
}
