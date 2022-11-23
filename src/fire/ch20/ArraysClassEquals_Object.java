package src.fire.ch20;

import java.util.Arrays;

/* �迭 �� �޼ҵ� (Object�� �迭�� equals)
 * �� �迭�� �����ϰ� �ִ� �ν��Ͻ��� ���� ���� ���Ѵ�.
 */

class MakeNum {
	private int num;
	
	public MakeNum(int num) {
		this.num = num;
	}
}

class ArraysClassEquals_Object {
	public static void main(String[] args) {
		MakeNum[] ar1 = new MakeNum[3];	// ���̰� 3�� �迭 ����
		MakeNum[] ar2 = new MakeNum[3];	// ���̰� 3�� �迭 ����
		
		ar1[0] = new MakeNum(1);
		ar1[1] = new MakeNum(2);
		ar1[2] = new MakeNum(3);
		
		ar2[0] = new MakeNum(1);
		ar2[1] = new MakeNum(2);
		ar2[2] = new MakeNum(3);
		
		System.out.println(Arrays.equals(ar1, ar2));
	}
}
