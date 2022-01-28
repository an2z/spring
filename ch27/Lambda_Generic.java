package ch27;

/* 람다식과 제네릭 
 * 인터페이스형 참조변수를 선언할 때 타입인자를 전달하면 
 * 추상메소드의 T가 결정된다.
 */

@FunctionalInterface
interface Calculate3<T> { // 제네릭 기반의 함수형 인터페이스
	T cal(T a, T b);
}

class Lambda_Generic {
	public static void main(String[] args) {
		Calculate3<Integer> ci = (a, b) -> a + b; // <T>:Integer
		System.out.println(ci.cal(4, 3));

		Calculate3<Double> cd = (a, b) -> a + b; // <T>:Double
		System.out.println(cd.cal(4.32, 3.45));
	}
}