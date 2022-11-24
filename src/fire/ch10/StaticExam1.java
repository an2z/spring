package src.fire.ch10;

/* 클래스 변수의 접근방법 */
public class StaticExam1 {
    static class StaticExam {
        static int num = 0; // 클래스 변수 (static 변수)

        StaticExam() {
            inside();
        }

        void inside() {
            num++; // 클래스 내부에서 이름을 통한 접근
            System.out.println("인스턴스 생성: " + num);
        }
    }

    public static void main(String[] args) {
        StaticExam ex = new StaticExam();
        ex.num++;         // 클래스 외부에서 인스턴스 이름을 통한 접근
        StaticExam.num++; // 클래스 외부에서 클래스 이름을 통한 접근
        System.out.println("num = " + StaticExam.num);
    }
}
