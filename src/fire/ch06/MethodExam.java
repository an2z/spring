package src.fire.ch06;

public class MethodExam {
    public static void main(String[] args) {
        /* 메소드 호출 */
        one(12); // 12를 전달하며 one메소드 호출
        one(13); // 13을 전달하며 one메소드 호출
        two(25, 159.2); // 25와 160을 전달하며 two메소드 호출
        three();

        int result;
        result = sum(4, 5);
        System.out.println("4 + 5 = " + result);
        System.out.println("프로그램의 끝");


        /* 지역 변수 */
        boolean ste = true;
        int num1 = 11;

        if (ste) {
            // int num1 = 22; // 주석해제시 컴파일 오류 발생 -> 같은 지역 내에서 동일한 변수 선언 불가
            num1++;
            System.out.println("num1: " + num1);
        }
        {
            int num2 = 33;
            num2++;
            System.out.println("num2: " + num2);
        }
        // System.out.println(num2); // 주석해제시 컴파일 오류 발생 -> 해당 지역 내에서만 접근 가능

        System.out.println("3 factorial: " + factorial(3)); // 재귀함수 호출
    }

    /* 메소드 정의 */
    static void one(int num) { // 매개변수가 하나인 메소드 정의
        System.out.println("hi");
        System.out.println(num + "을 전달받았어요.");
    }

    static void two(int age, double height) { // 매개변수가 둘인 메소드 정의
        System.out.println("제 나이는" + age + "살 입니다.");
        System.out.println("제 키는" + height + "cm 입니다.");
    }

    static void three() { // 매개변수가 존재하지 않는 메소드 정의
        System.out.println("매개변수가 없습니다.");
    }

    /* 값의 반환 타입에 따른 메소드 */
    static int sum(int num1, int num2) {
        int sumResult = num1 + num2;
        return sumResult; // int형 값을 가진 sumResult를 main 메소드에 반환
    }

    /* 재귀 함수 */
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
