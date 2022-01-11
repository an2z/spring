package ch20;
import java.math.BigDecimal;

/* BigDecimal 클래스
 * 오차 없는 실수의 표현을 위한 클래스
 */

class BigDecimalClass {
	public static void main(String[] args) {
		BigDecimal d = new BigDecimal(1.6);		// 가능은 하지만 실수 표현에 오차가 발생
		
		System.out.println("오차가 있는 1.6 : " + d);
		
		BigDecimal d1 = new BigDecimal("1.6");	// 오차를 발생시키지 않기 위해 문자열 형태로 인스턴스 생성
		BigDecimal d2 = new BigDecimal("0.1");	// 오차를 발생시키지 않기 위해 문자열 형태로 인스턴스 생성

		System.out.println("덧셈 결과 : " + d1.add(d2));
		System.out.println("곱셈 결과 : " + d1.multiply(d2));
	}
}
