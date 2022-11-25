package src.fire.ch18;

import java.util.Scanner;

/* 프로그래머가 정의하는 예외 클래스
 * 프로그래머가 직접 예외 클래스를 정의하고 이를 기반으로 특정 상황에서 예외가 발생하도록 할 수 있다.
 * Exception 클래스를 상속하기 때문에 예외처리를 반드시 해줘야 한다.
 */
class MyExceptionClass {
    public static void main(String[] args) {
        System.out.print("나이 입력: ");

        try {
            int age = readAge();
            System.out.printf("입력된 나이: %d \n", age);
        } catch (ReadAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int readAge() throws ReadAgeException {
        Scanner kb = new Scanner(System.in);
        int age = kb.nextInt();

        if (age < 0) {
            throw (new ReadAgeException()); // throw 선언을 통해 예외 발생
        }

        return age;
    }

    static class ReadAgeException extends Exception { // 예외 클래스 정의
        public ReadAgeException() {
            super("유효하지 않은 나이가 입력되었습니다."); // 예외 상황에 대한 원인 메세지 작성
        }
    }
}
