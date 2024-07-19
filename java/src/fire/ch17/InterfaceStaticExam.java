package src.fire.ch17;

/* 인터페이스의 static 메소드 */
class InterfaceStaticExam {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";
        Printable p = new Printer();
        p.print(myDoc);
        Printable.printLine("end fo line"); // 인터페이스의 static 메소드 직접 호출
    }

    interface Printable {
        static void printLine(String str) { // static 메소드
            System.out.println(str);
        }

        default void print(String doc) {
            printLine(doc); // 인터페이스의 static 메소드 호출
        }
    }

    static class Printer implements Printable {
        // 인터페이스 Printale에는 구현해야 할 메소드가 존재하지 않음
    }
}
