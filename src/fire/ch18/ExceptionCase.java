package src.fire.ch18;

import java.util.Scanner;

class ExceptionCase {
    public static void main(String[] args) {
        /*
         * ArithmeticException
         * 분모가 0일 경우 예외 발생
         */
        Scanner kb = new Scanner(System.in);

        System.out.print("a/b...a의 값을 입력하세요: "); // 분자 입력
        int a = kb.nextInt(); // int 정수 입력
        System.out.print("a/b...b의 값을 입력하세요: "); // 분모 입력
        int b = kb.nextInt(); // int 정수 입력

        System.out.printf("%d/%d = %d \n", a, b, a / b);
        System.out.println("프로그램 종료!");

        /*
         * ArrayIndexOutOfBoundsException
         * 배열 접근에 잘못된 인덱스 값을 사용하는 경우 발생
         */
        int[] arr = {1, 2, 3};
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]); // 인덱스 값 3은 예외를 발생시킴
        }

        /*
         * NullPointerException
         * null이 저장된 참조변수를 대상으로 메소드를 호출할 때 발생
         */
        String str = null;
        System.out.println(str); // null 출력
        int len = str.length(); // 예외 발생
    }
}
