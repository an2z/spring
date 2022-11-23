package src.fire.ch11;
import java.util.Scanner;

/* Scanner Ŭ���� */
class ScannerExam {
	public static void main(String[] args) {
		String data = "1 3 5";
		
		Scanner sc = new Scanner(data);  // Scanner �ν��Ͻ� ����
		int n1 = sc.nextInt();  // int�� ������ ����
		int n2 = sc.nextInt();  // int �� ������ ����
		int n3 = sc.nextInt();  // int �� ������ ����
		
		int sum = n1 + n2 + n3;
		System.out.printf("%d + %d + %d = %d", n1, n2, n3, sum );
	}

}
