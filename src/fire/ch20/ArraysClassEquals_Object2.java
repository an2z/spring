package src.fire.ch20;

import java.util.Arrays;

/* �迭 �� �޼ҵ� (Object�� �迭�� equals)
 * �迭�� ���� �� �񱳰� �ƴ� ���� �񱳰� �����̶�� equals �޼ҵ带 ������ �°� �������̵� �ؾ� �Ѵ�.
 */

class MakeNum2 {
	private int num;
	
	public MakeNum2(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((MakeNum2)obj).num)	// �� �ν��Ͻ��� ���� ��
			return true;
		else 
			return false;
	}
}

class ArraysClassEquals_Object2 {
	public static void main(String[] args) {
		MakeNum2[] ar1 = new MakeNum2[3];	// ���̰� 3�� �迭 ����
		MakeNum2[] ar2 = new MakeNum2[3];	// ���̰� 3�� �迭 ����
		
		// �� �迭�� �ν��Ͻ� ����
		ar1[0] = new MakeNum2(1);		
		ar1[1] = new MakeNum2(2);
		ar1[2] = new MakeNum2(3);
		
		// �� �迭�� �ν��Ͻ� ����
		ar2[0] = new MakeNum2(1);
		ar2[1] = new MakeNum2(2);
		ar2[2] = new MakeNum2(3);
		
		System.out.println(Arrays.equals(ar1, ar2));
	}
}
