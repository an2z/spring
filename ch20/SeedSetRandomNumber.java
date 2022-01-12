package ch20;

import java.util.Random;

/* Random 클래스 
 * System.currentTimeMillis() 
 * 컴퓨터의 현재 시간을 기준으로 1970년 1월 1일 자정 이후로 지나온 시간을 밀리초(1/1000ch)단위로 계산하여 반환해준다.
 * 씨드값으로 currentTimeMillis() 메소드 호출문을 사용하면, 매 실행마다 다른 난수를 생성할 수 있다.
 */

class SeedSetRandomNumber {
	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis());
		
		for (int i=0; i<7; i++)
			System.out.println(rand.nextInt(1000));
	}
}