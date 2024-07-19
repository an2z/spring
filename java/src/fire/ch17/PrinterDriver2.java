package src.fire.ch17;

class PrinterDriver2 {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";

        // 삼성 프린터로 출력
        Printable p = new SPrinterDriver();
        p.print(myDoc);
        System.out.println(); // 단순 개행

        // LG 프린터로 출력
        p = new LPrinterDriver();
        p.print(myDoc);
    }

    interface Printable {  // MS가 정의하고 제공한 인터페이스
        void print(String doc); // 추상 메소드
    }

    static class LPrinterDriver implements Printable { // L사의 프린터 사용에 필요한 클래스 정의
        @Override
        public void print(String doc) {
            System.out.println("Form LG printer");
            System.out.println(doc);
        }
    }

    static class SPrinterDriver implements Printable { // S사의 프린터 사용에 필요한 클래스 정의
        @Override
        public void print(String doc) {
            System.out.println("From Samsung printer");
            System.out.println(doc);
        }
    }
}
