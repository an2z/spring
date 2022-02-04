package ch28;

import java.util.function.ToIntBiFunction;

/* 인스턴스 없이 인스턴스 메소드 참조 
 * 첫번째 인자가 참조하는 인스턴스의 메소드를 호출하면서 두번째 이후에 전달되는 인자를 전달기로 약속
 */

class IBox {
	private int n;

	public IBox(int n) {
		this.n = n;
	}

	public int larger(IBox b) { // 인스턴스 메소드
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
		
		// 두 상자에 저장된 값 비교하여 더 큰 값 반환
		// ToIntBiFunction<IBox, IBox> bf = (b1, b2) -> b1.larger(b2); // 람다식 기반
		ToIntBiFunction<IBox, IBox> bf = IBox::larger; // 메소드 참조 기반
		
		int bigNum = bf.applyAsInt(ib1, ib2);
		System.out.println(bigNum);
	}
}
// ToIntBiFunction<T, U>  int applyAsInt(T t, U u)