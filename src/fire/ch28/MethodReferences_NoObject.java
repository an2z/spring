package src.fire.ch28;

import java.util.function.ToIntBiFunction;

/* �ν��Ͻ� ���� �ν��Ͻ� �޼ҵ� ���� 
 * ù��° ���ڰ� �����ϴ� �ν��Ͻ��� �޼ҵ带 ȣ���ϸ鼭 �ι�° ���Ŀ� ���޵Ǵ� ���ڸ� ���ޱ�� ���
 */

class IBox {
	private int n;

	public IBox(int n) {
		this.n = n;
	}

	public int larger(IBox b) { // �ν��Ͻ� �޼ҵ�
		if (n > b.n)
			return n;
		else
			return b.n;
	}
}

class MethodReferences_NoObject {
	public static void main(String[] args) {
		IBox ib1 = new IBox(5);
		IBox ib2 = new IBox(7);
		
		// �� ���ڿ� ����� �� ���Ͽ� �� ū �� ��ȯ
		// ToIntBiFunction<IBox, IBox> bf = (b1, b2) -> b1.larger(b2); // ���ٽ� ���
		ToIntBiFunction<IBox, IBox> bf = IBox::larger; // �޼ҵ� ���� ���
		
		int bigNum = bf.applyAsInt(ib1, ib2);
		System.out.println(bigNum);
	}
}
// ToIntBiFunction<T, U>  int applyAsInt(T t, U u)
