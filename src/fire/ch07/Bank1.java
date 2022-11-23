package src.fire.ch07;

/* Ŭ���� (������ + �޼ҵ�) */
class Bank01 {
	/* �ν��ϼ� ���� -> ������ */	
	int balance = 0;  // ���� �ܾ�
	
	/* �ν��Ͻ� �޼ҵ� */ 
	public int deposit(int amount) {   // �Ա�
		balance += amount;
		return balance;
	}	
	public int withdraw(int amount) {  // ���
		balance -= amount;
		return balance;
	}	
	public int check_balance() {       // �ܾ� ��ȸ
		System.out.println("�ܾ�: " + balance);
		return balance;	
	}
}


public class Bank1 {
	public static void main(String[] args) {
		// 2���� �ν��Ͻ� ����
		Bank01 anne = new Bank01();   // �������� anne ���� -> �ν��Ͻ��� �ּҰ��� ����
		Bank01 jolly = new Bank01();  // �������� jolly ����
		
		// �� �ν��Ͻ��� ������� ���� ����
		anne.deposit(5000);       // anne�� �����ϴ� �ν��Ͻ��� deposit�� ȣ��
		jolly.deposit(3000);
		
		// �� �ν��Ͻ��� ������� ��� ����
		anne.withdraw(2000);
		jolly.withdraw(2000);
		
		// �� �ν��Ͻ��� ������� �ܾ� ��ȸ
		anne.check_balance();
		jolly.check_balance();		
	}
}
