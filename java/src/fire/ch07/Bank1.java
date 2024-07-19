package src.fire.ch07;

/* 클래스 (데이터 + 메소드) */
public class Bank1 {
    /* 인스턴수 변수 -> 데이터 */
    int balance = 0;  // 예금 잔액

    /* 인스턴스 메소드 */
    public void deposit(int amount) {   // 입금
        balance += amount;
    }

    public void withdraw(int amount) {  // 출금
        balance -= amount;
    }

    public void checkBalance() {        // 잔액 조회
        System.out.println("잔액: " + balance);
    }

    public static void main(String[] args) {
        // 2개의 인스턴스 생성
        Bank1 anne = new Bank1();    // 참조변수 anne 선언 -> 인스턴스의 주소값을 담음
        Bank1 jolly = new Bank1();   // 참조변소 jolly 선언

        // 각 인스턴스를 대상으로 예금 진행
        anne.deposit(5000); // anne이 참조하는 인스턴스의 deposit을 호출
        jolly.deposit(3000);

        // 각 인스턴스를 대상으로 출금 진행
        anne.withdraw(2000);
        jolly.withdraw(2000);

        // 각 인스턴스를 대상으로 잔액 조회
        anne.checkBalance();
        jolly.checkBalance();
    }
}
