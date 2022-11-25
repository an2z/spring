package src.fire.ch26;

/* 익명 클래스
 * 이름 없이 정의되는 클래스
 */
class InnerClassAnonymous {
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
            return new Printable() { // 익명 클래스 정의, 인스턴스 생성 및 반환
                public void print() {
                    System.out.println(str);
                }
            };
        }
    }
}
