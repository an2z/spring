package src.fire.ch07;

class ConstructorExam {
    String acc_number;
    String ss_number;
    int balance;

    /* 생성자 */
    public ConstructorExam(String acc, String ss, int bal) {
        acc_number = acc;
        ss_number = ss;
        balance = bal;
    }

    public static void main(String[] args) {
        /* 고유정보 주기 */
        // 생성자 사용해 자동 초기화
        ConstructorExam anne = new ConstructorExam("12-34-89", "970522-2000000", 1000);
    }
}
