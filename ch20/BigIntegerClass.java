package ch20;

import java.math.BigInteger;

/* BigInteger 클래스
 * long형으로도 표현 불가능한 매우 큰 정수를 표현하기 위해 클래스
 */

class BigIntegerClass {
	public static void main(String[] args) {
		// long형으로 표현 가능한 값의 크기 출력
		System.out.println("최대 정수: " + Long.MAX_VALUE);	// 최대
		System.out.println("최소 정수: " + Long.MIN_VALUE);	// 최소
		System.out.println();
		
		// 매우 큰 수를 BigInteger 인스턴스를 생성해 표현
		BigInteger big1 = new BigInteger("100000000000000000000000000000");
		BigInteger big2 = new BigInteger("-99999999999999999999999999999");
		
		// BigInteger 기반의 덧셈 연산
		BigInteger r1 = big1.add(big2);
		System.out.println("덧셈 결과: " + r1);
		
		// BigInteger 기반의 곱셈 연산
		BigInteger r2 = big1.multiply(r1);
		System.out.println("곱셈 결과: " + r2);
		System.out.println();
		
		// BigInteger 인스턴스에 저장된 값을 int형 정수로 반환
		int num = r1.intValueExact();
		System.out.println("to int From Biginteger: " + num);
	}
}
