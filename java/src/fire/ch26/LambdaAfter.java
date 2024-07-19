package src.fire.ch26;

/* 람다 후 (익명 클래스) */
class LambdaAfter {
    public static void main(String[] args) {
        Printable prn = (s) -> {
            System.out.println(s);
        };
        prn.print("Hello Lambda");
    }

    interface Printable {
        void print(String s);
    }
}
