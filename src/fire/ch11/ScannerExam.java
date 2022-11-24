package src.fire.ch11;

import java.util.Scanner;

/* Scanner 클래스 */
class ScannerExam {
    public static void main(String[] args) {
        String data = "1 3 5";

        Scanner sc = new Scanner(data); // Scanner 인스턴스 생성
        int n1 = sc.nextInt(); // int 형 데이터 추출
        int n2 = sc.nextInt(); // int 형 데이터 추출
        int n3 = sc.nextInt(); // int 형 데이터 추출

        int sum = n1 + n2 + n3;
        System.out.printf("%d + %d + %d = %d", n1, n2, n3, sum);
    }
}
