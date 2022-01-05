package ch18;
import java.util.Scanner;

/* 예외
 * 분모가 0일 경우 예외상황이 발생한다.
 */

class ExceptionCase {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("a/b...a의 값을 입력하세요: "); // 분자 입력
		int a = kb.nextInt(); // int형 정수 입력
		
		System.out.print("a/b...b의 값을 입력하세요: "); // 분모 입력
		int b = kb.nextInt(); // int형 정수 입력
		
		System.out.printf("%d/%d = %d \n", a, b, a/b);
		System.out.println("프로그램 종료!");
	}
}
