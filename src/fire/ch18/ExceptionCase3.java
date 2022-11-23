package src.fire.ch18;
import java.util.InputMismatchException;
import java.util.Scanner;


class ExceptionCase3 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
			System.out.print("a/b...a�� ���� �Է��ϼ���: ");
			int a = kb.nextInt();   // �Է� ���� �߻� ����
			System.out.print("a/b...b�� ���� �Է��ϼ���: ");
			int b = kb.nextInt();   // �Է� ���� �߻� ����
			System.out.printf("%d/%d = %d \n", a, b, a/b);
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���α׷� ����!");
	}
}
