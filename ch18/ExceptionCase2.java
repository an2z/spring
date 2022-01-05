package ch18;
import java.util.Scanner;

/* 예외 처리 (try ~ catch)
 * try 영역에서 발생한 예외 상황을 catch 영역에서 처리하는 방식으로 동작
 */

class ExceptionCase2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
			System.out.print("a/b...a의 값을 입력하세요: ");
			int a = kb.nextInt();
			System.out.print("a/b...b의 값을 입력하세요: ");
			int b = kb.nextInt();
			System.out.printf("%d/%d = %d /n", a, b, a/b); // 예외 발생 지점
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage()); // 예외의 원인을 담고 있는 문자열을 반환
		}
		System.out.println("프로그램 종료!");
	}
}