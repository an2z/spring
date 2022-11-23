package src.fire.ch18;
import java.util.Scanner;

/* ����
 * �и� 0�� ��� ���ܻ�Ȳ�� �߻��Ѵ�.
 */

class ExceptionCase {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("a/b...a�� ���� �Է��ϼ���: "); // ���� �Է�
		int a = kb.nextInt(); // int�� ���� �Է�
		
		System.out.print("a/b...b�� ���� �Է��ϼ���: "); // �и� �Է�
		int b = kb.nextInt(); // int�� ���� �Է�
		
		System.out.printf("%d/%d = %d \n", a, b, a/b);
		System.out.println("���α׷� ����!");
	}
}
