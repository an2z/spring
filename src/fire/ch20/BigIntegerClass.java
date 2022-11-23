package src.fire.ch20;

import java.math.BigInteger;

/* BigInteger Ŭ����
 * long�����ε� ǥ�� �Ұ����� �ſ� ū ������ ǥ���ϱ� ���� Ŭ����
 */

class BigIntegerClass {
	public static void main(String[] args) {
		// long������ ǥ�� ������ ���� ũ�� ���
		System.out.println("�ִ� ����: " + Long.MAX_VALUE);	// �ִ�
		System.out.println("�ּ� ����: " + Long.MIN_VALUE);	// �ּ�
		System.out.println();
		
		// �ſ� ū ���� BigInteger �ν��Ͻ��� ������ ǥ��
		BigInteger big1 = new BigInteger("100000000000000000000000000000");
		BigInteger big2 = new BigInteger("-99999999999999999999999999999");
		
		// BigInteger ����� ���� ����
		BigInteger r1 = big1.add(big2);
		System.out.println("���� ���: " + r1);
		
		// BigInteger ����� ���� ����
		BigInteger r2 = big1.multiply(r1);
		System.out.println("���� ���: " + r2);
		System.out.println();
		
		// BigInteger �ν��Ͻ��� ����� ���� int�� ������ ��ȯ
		int num = r1.intValueExact();
		System.out.println("to int From Biginteger: " + num);
	}
}
