package ch07;

/* 참조변수의 특성 */
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
		System.out.println("잔액: " + balance);
		return balance;
	}
}


public class Bank2 {
	public static void main(String[] args) {		
		Bank02 ref1 = new Bank02();
		Bank02 ref2 = new Bank02();  // ref1이 참조하는 대상을 ref2도 참조
		
		ref1.deposit(3000);
		ref2.deposit(3000);
		ref1.withdraw(400);
		ref2.withdraw(400);
		ref1.chekbalance();
		ref2.chekbalance();
		
		/* 참조변수의 매개변수 선언 */
		check(ref1);  // 참조변수가 담고 있는 참조 값인(인스턴스의 주소 값) 전달
		
		/* 참조변수에 null 대입 */
		ref1 = null;  // 참조변수가 참조하는 인스턴스와의 관계를 끊음
//		ref.chekbalance();  // 컴파일 오류 발생
	}
	
	
	public static void check(Bank02 acc) {  // 전달 받은 참조값을 acc가 저장, 즉 ref와 acc는 인스턴스 주소값을 동시 참조
		acc.chekbalance();
	}
	
}
