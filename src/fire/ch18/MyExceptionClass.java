package src.fire.ch18;

import java.util.Scanner;

/* ���α׷��Ӱ� �����ϴ� ���� Ŭ����
 * ���α׷��Ӱ� ���� ���� Ŭ������ �����ϰ� �̸� ������� Ư�� ��Ȳ���� ���ܰ� �߻��ϵ��� �� �� �ִ�.
 * Exception Ŭ������ ����ϱ� ������ ����ó���� �ݵ�� ����� �Ѵ�.
 */

class ReadAgeException extends Exception {	// ���� Ŭ���� ����
	public ReadAgeException() {
		super("��ȿ���� ���� ���̰� �ԷµǾ����ϴ�.");	// ���� ��Ȳ�� ���� ���� �޼��� �ۼ�
	}
}

class MyExceptionClass {
	public static int readAge() throws ReadAgeException {
		Scanner kb = new Scanner(System.in);
		int age = kb.nextInt();
		
		if (age < 0)
			throw (new ReadAgeException());	// throw ������ ���� ���� �߻�
		
		return age;
	}
	
	public static void main(String[] args) {
		System.out.print("���� �Է�: ");
		
		try {
			int age = readAge();
			System.out.printf("�Էµ� ����: %d \n", age);
		}
		catch(ReadAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
