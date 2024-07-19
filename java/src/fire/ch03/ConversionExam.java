package src.fire.ch03;

class ConversionExam {
    public static void main(String[] args) {
        /* 자동 형 변환 */
        int num1 = 50;
        long num2 = 3147483647L;
        System.out.println(num1 + num2);  // 두 피연산자의 자료형이 다름

        /* 명시적 형 변환 */
        double pi = 3.1415;
        int wholeNumber = (int) pi;  // pi 값을 int형으로 명시적 형 변환
    }
}
