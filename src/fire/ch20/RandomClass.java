package src.fire.ch20;

import java.util.Random;

/* Random Ŭ���� 
 * ������ �����ϱ� ���� Ŭ����
 * Random Ŭ������ �ν��Ͻ��� �����ϰ�, ������ ���� �޼ҵ带 ȣ���ϸ� ������ ��ȯ�� 
 */

class RandomClass {
	public static void main(String[] args) {
		Random rand = new Random();	// Random �ν��Ͻ� ����
		
		for (int i=0; i<7; i++)
			System.out.println(rand.nextInt(1000));	// 0 �̻� 1000�̸� ���� ��ȯ
	}
}
