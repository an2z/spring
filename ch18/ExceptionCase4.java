package ch18;
import java.util.InputMismatchException;
import java.util.Scanner;

/* 둘 이상의 예외처리하기 위한 구성
 * try 영역에서 예외가 발생했을 때
 * 위에 있는 catch부터 아래 있는 catch로 넘어간다.
 */

class ExceptionCase4 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
			System.out.print("a/b...a의 값을 입력하세요: ");
			int a = kb.nextInt();   // 입력 오류 발생 가능
			System.out.print("a/b...b의 값을 입력하세요: ");
			int b = kb.nextInt();   // 입력 오류 발생 가능
			System.out.printf("%d/%d = %d \n", a, b, a/b);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료!");
	}
}
