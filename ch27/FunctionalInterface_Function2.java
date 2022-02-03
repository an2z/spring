package ch27;

import java.util.function.Function;

/* 함수형 인터페이스 (Function) */

class FunctionalInterface_Function2 {
	public static void main(String[] args) {
		Function<Double, Double> cti = d -> d * 0.393701;
		Function<Double, Double> itc = d -> d * 2.54;
		System.out.println("1cm = " + cti.apply(1.0) + "inch"); // cm를 inch로
		System.out.println("1inch = " + cti.apply(1.0) + "cm"); // inch를 cm로
	}
}