package src.fire.ch11;

class OverloadingExam1 {
    public static void main(String[] args) {
        OverloadingExam1 a = new OverloadingExam1();
        a.sample(4);
        a.sample(1, 5);
        a.sample(3, 0.5);
    }

    /* 메소드 오버로딩 */
    // 메서드의 이름은 같고 매개변수의 갯수나 타입이 다른 함수를 정의
    void sample(int n) {
        System.out.println(n);
    }

    void sample(int n1, int n2) {
        System.out.println(n1 + "\n" + n2);
    }

    void sample(int n, double d) {
        System.out.println(n + "\n" + d);
    }
}
