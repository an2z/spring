package src.fire.ch18;
import java.util.Scanner;

/* ���� ó�� (try ~ catch)
 * try �������� �߻��� ���� ��Ȳ�� catch �������� ó���ϴ� ������� ����
 */

class ExceptionCase2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
			System.out.print("a/b...a�� ���� �Է��ϼ���: ");
			int a = kb.nextInt();
			System.out.print("a/b...b�� ���� �Է��ϼ���: ");
			int b = kb.nextInt();
			System.out.printf("%d/%d = %d /n", a, b, a/b); // ���� �߻� ����
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage()); // ������ ������ ��� �ִ� ���ڿ��� ��ȯ
		}
		System.out.println("���α׷� ����!");
	}
}
