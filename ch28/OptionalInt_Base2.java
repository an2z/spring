package ch28;

import java.util.OptionalInt;

class OptionalInt_Base2 {
	public static void main(String[] args) {
		OptionalInt oi1 = OptionalInt.of(3);
		OptionalInt oi2 = OptionalInt.empty();
		
		System.out.print("[step 1] : ");
		oi1.ifPresent(i -> System.out.print(i + " "));
		oi2.ifPresent(i -> System.out.print(i));
		System.out.println();
		
		System.out.print("[step 2] : ");
		System.out.print(oi1.orElse(100) + " ");
		System.out.print(oi2.orElse(100) + " ");
		System.out.println();
	}
}