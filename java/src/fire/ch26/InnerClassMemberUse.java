package src.fire.ch26;

/* 멤버 클래스 사용
 * 클래스의 정의를 감춰야 할때 유용하게 사용한다.
 */
class InnerClassMemberUse {
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
            return new Printer(); // 멤버 클래스 인스턴스 생성 및 반환
        }

        private class Printer implements Printable { // 멤버 클래스
            public void print() {
                System.out.println(str);
            }
        }
    }
}
