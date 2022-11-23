package src.fire.ch20;
import java.math.BigDecimal;

/* BigDecimal Ŭ����
 * ���� ���� �Ǽ��� ǥ���� ���� Ŭ����
 */

class BigDecimalClass {
	public static void main(String[] args) {
		BigDecimal d = new BigDecimal(1.6);		// ������ ������ �Ǽ� ǥ���� ������ �߻�
		
		System.out.println("������ �ִ� 1.6 : " + d);
		
		BigDecimal d1 = new BigDecimal("1.6");	// ������ �߻���Ű�� �ʱ� ���� ���ڿ� ���·� �ν��Ͻ� ����
		BigDecimal d2 = new BigDecimal("0.1");	// ������ �߻���Ű�� �ʱ� ���� ���ڿ� ���·� �ν��Ͻ� ����

		System.out.println("���� ��� : " + d1.add(d2));
		System.out.println("���� ��� : " + d1.multiply(d2));
	}
}
