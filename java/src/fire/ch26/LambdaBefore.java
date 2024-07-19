package src.fire.ch26;

/* 람다 전 (익명 클래스) */
class LambdaBefore {
    public static void main(String[] args) {
        // 익명 클래스 정의
        Printable prn = new Printable() {
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        };

        prn.print("Hello Lambda");
    }

    interface Printable {
        void print(String s);
    }
}
