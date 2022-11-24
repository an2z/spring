package src.fire.ch10;

/* 클래스 메소드 */
public class StaticMethodExam {
    static class StaticMethodExam00 {
        private int num = 0;

        // 클래스 메소드 (static 메소드)
        static void showInt(int n) {
            System.out.println(n);
        }

        // 클래스 메소드 (static 메소드)
        static void showDouble(double n) {
            System.out.println(n);
        }

        // 인스턴스 메소드
        void setNum(int n) {
            num = n;
        }

        // 인스턴스 메소드
        void showNum() {
            showInt(num); // 클래스 내부에서 클래스 메소드 호출
        }
    }

    public static void main(String[] args) {
        // 클래스 메소드 호출
        StaticMethodExam00.showInt(20);
        StaticMethodExam00.showDouble(20.1);

        // 인스턴스 메소드 호출
        StaticMethodExam00 np = new StaticMethodExam00(); // 인스턴스 생성
        np.setNum(75);
        np.showNum();
    }
}
