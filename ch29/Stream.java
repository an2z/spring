package ch29;

/* 스트림 이해하기 
 * 스트림을 생성하고 이를 대상으로 '중간 연산'을 진행하면,
 * 원하는 기준으로 데이터를 필터링하고 필터링 된 데이터의 가공된 결과를 얻을 수 있다. 
 */

import java.util.Arrays;
import java.util.stream.IntStream;

class Stream {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };

		IntStream stm1 = Arrays.stream(ar); // 배열 ar로부터 스트림 생성
		IntStream stm2 = stm1.filter(n -> n % 2 == 1); // 중간연산 진행
		int sum1 = stm2.sum(); // 최종연산 진행
		System.out.println(sum1);

		// 코드 줄이기
		int sum2 = Arrays.stream(ar) // 스트림 생성
				         .filter(n -> n % 2 == 1) // filter 통과
				         .sum(); // sum 통과 결과 반환
		System.out.println(sum2);
	}
}