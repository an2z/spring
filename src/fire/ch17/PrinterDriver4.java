package src.fire.ch17;

/* 인터페이스의 디폴트 메소드
 * 디폴트 메소드란 인터페이스에 추상 메소드를 추가해야 하는 상황에서
 * 이전에 개발해 놓은 코드에 영향을 미치지 않기 위해 등장한 문법이다.
 */
class PrinterDriver4 {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";

        Printable p1 = new LPrinterDrv();
        p1.print(myDoc);
        System.out.println();

        Printable p2 = new SPrinterDrv();
        p2.print(myDoc);
        System.out.println();
        p2.printColor(myDoc);
    }

    interface Printable {
        void print(String doc);

        // 인터페이스의 디폴트 메소드
        default void printColor(String doc) {
        }
    }

    static class LPrinterDrv implements Printable { // L사 프린터 드라이브 (흑백 출력만 가능)
        @Override
        public void print(String doc) {
            System.out.println("From LG black & white printer");
            System.out.println(doc);
        }
    }

    static class SPrinterDrv implements Printable { // S사 프린터 드라이브 (흑백, 컬러 출력 모두 가능)
        @Override
        public void print(String doc) {
            System.out.println("From Samsung black & white printer");
            System.out.println(doc);
        }

        @Override
        public void printColor(String doc) {
            System.out.println("From Samsung color printer");
            System.out.println(doc);
        }
    }
}
