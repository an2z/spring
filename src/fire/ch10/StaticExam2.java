package src.fire.ch10;

/* 클래스 변수의 초기화 */
public class StaticExam2 {
    static class StaticExam {
        static int num = 100; // 클래스 변수의 적절한 초기화 위치

        StaticExam() {
            num++; // 인스턴스 생성시마다 값이 리셋
            System.out.println("인스턴스 생성: " + num);
        }
    }

    public static void main(String[] args) {
        StaticExam.num -= 15; // 인스턴스 생성없이 num(클래스변수)에 접근
        System.out.println(StaticExam.num);
    }
}
