package src.fire.ch27;

import java.util.function.DoubleUnaryOperator;

/* �Լ��� �������̽� (DoubleUnaryOperator) */

class FunctionalInterface_DoubleUnaryOperator {
	public static void main(String[] args) {
		DoubleUnaryOperator cti = d -> d * 0.393701;
		DoubleUnaryOperator itc = d -> d * 2.54;
		System.out.println("1cm = " + cti.applyAsDouble(1.0) + "inch"); // cm�� inch��
		System.out.println("1inch = " + cti.applyAsDouble(1.0) + "cm"); // inch�� cm��
	}
}
