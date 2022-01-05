package ch18;
import java.util.InputMismatchException;
import java.util.Scanner;


class ExceptionCase3 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
			System.out.print("a/b...a의 값을 입력하세요: ");
			int a = kb.nextInt();   // 입력 오류 발생 가능
			System.out.print("a/b...b의 값을 입력하세요: ");
			int b = kb.nextInt();   // 입력 오류 발생 가능
			System.out.printf("%d/%d = %d \n", a, b, a/b);
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료!");
	}
}
