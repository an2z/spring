package src.fire.ch20;

import java.util.Random;

/* Random Ŭ���� 
 * ��ǻ�Ͱ� �����ϴ� ������ ��¥ ����(Pseudo-random number)
 * ��ǻ���� ���� ���� �˰����� ���� ���� ������� ���ư��� ������ ���� ���� ���ٸ� �����Ǵ� ������ ������ 100% ��ġ��
 * ���� �� ���ึ�� �����Ǵ� ������ ����
 */

class PsuedoRandomNumber {
	public static void main(String[] args) {
		Random rand = new Random(12);	// �����ڷ� ���� �� 12 ����
		
		for (int i=0; i<7; i++)
			System.out.println(rand.nextInt(1000));
	}
}
