package src.fire.ch20;

import java.util.Random;

/* Random Ŭ���� 
 * System.currentTimeMillis() 
 * ��ǻ���� ���� �ð��� �������� 1970�� 1�� 1�� ���� ���ķ� ������ �ð��� �и���(1/1000ch)������ ����Ͽ� ��ȯ���ش�.
 * ���尪���� currentTimeMillis() �޼ҵ� ȣ�⹮�� ����ϸ�, �� ���ึ�� �ٸ� ������ ������ �� �ִ�.
 */

class SeedSetRandomNumber {
	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis());
		
		for (int i=0; i<7; i++)
			System.out.println(rand.nextInt(1000));
	}
}
