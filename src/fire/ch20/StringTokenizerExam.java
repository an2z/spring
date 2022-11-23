package src.fire.ch20;

import java.util.StringTokenizer;

/* StringTokenizer Ŭ����
 * ���ڿ����� Ư�� �����ڸ� �������� ��ū�� ����
 */

class StringTokenizerExam {
	public static void main(String[] args) {
		/* �����ڰ� �ϳ��� ��� */
		StringTokenizer st1 = new StringTokenizer("2022/01/12", "/");	
		
		while(st1.hasMoreTokens())						// ��ȯ�� ��ū�� ���� �ִ°�?
			System.out.print(st1.nextToken() + ' ');	// ���� ��ū�� ��ȯ
		System.out.println();
		
		/* �����ڰ� �� �̻��� ��� */
		StringTokenizer st2 = new StringTokenizer("12 + 36 - 8 / 2 = 44", "+-/= ");	// �����ڿ� ���鵵 ����
		
		while(st2.hasMoreTokens())						// ��ȯ�� ��ū�� ���� �ִ°�?
			System.out.print(st2.nextToken() + ' ');	// ���� ��ū�� ��ȯ
		System.out.println();
		
		/* �����ڵ� ��ū���� ��ȯ�ϰ� ���� ��� */
		StringTokenizer st3 = new StringTokenizer("PM:04:30", ":", true);
		
		while(st3.hasMoreTokens())
			System.out.print(st3.nextToken());
		System.out.println();
	}
}
