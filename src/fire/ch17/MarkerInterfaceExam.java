package src.fire.ch17;

/* 마커 인터페이스
 * 클래스의 특별한 표시를 해두기 위한 목적으로 정의 된 인터페이스를 마커 인터페이스라 함.
 * 예제에서 마커 인터페이스인 Upper는 대문자로 출력하라는 표식이며, Lower는 소문자로 출력하라는 표식이다.
 */
class MarkerInterfaceExam {
    public static void main(String[] args) {
        Printer p = new Printer();
        Report doc = new Report("Simple Funny News~");
        p.printContents(doc);
    }

    // 마커 인터페이스
    interface Upper {
    }

    // 마커 인터페이스
    interface Lower {
    }

    interface Printable {
        String getContents();
    }

    static class Report implements Printable, Upper {
        String cons;

        Report(String cons) {
            this.cons = cons;
        }

        @Override
        public String getContents() {
            return cons;
        }
    }

    static class Printer {
        public void printContents(Printable doc) {
            if (doc instanceof Upper) {                                // doc 참조인스턴스가 Upper를 구현한다면
                System.out.println((doc.getContents().toUpperCase())); // 문자열의 모든 문자를 대문자로 바꿈
            } else if (doc instanceof Lower) {                         // doc 참조인스턴스가 Lower를 구현한다면
                System.out.println((doc.getContents().toLowerCase())); // 문자열의 모든 문자를 소문자로 바꿈
            } else {
                System.out.println(doc.getContents());
            }
        }
    }
}
