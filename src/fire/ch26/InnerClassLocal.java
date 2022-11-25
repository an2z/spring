package src.fire.ch26;

/* 로컬 클래스
 * 중괄호 내, 메소드 내에 정의되는 클래스
 */
class InnerClassLocal {
    public static void main(String[] args) {
        Paper p = new Paper("날씨 맑음");
        Printable prn = p.getPrinter();
        prn.print();
    }

    interface Printable {
        void print();
    }

    static class Paper {
        private String str;

        public Paper(String s) {
            str = s;
        }

        public Printable getPrinter() {
            class Printer implements Printable { // 로컬 클래스
                public void print() {
                    System.out.println(str);
                }
            }

            return new Printer(); // 로컬 클래스 인스턴스 생성 및 반환
        }
    }
}
