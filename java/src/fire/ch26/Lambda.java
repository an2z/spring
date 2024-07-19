package src.fire.ch26;

class Lambda {
    public static void main(String[] args) {
        ShowString((s) -> {
            System.out.println(s);
        }, "Hello Lambda");
    }

    public static void ShowString(Printable p, String s) {
        p.print(s);
    }

    interface Printable {
        void print(String s);
    }
}
