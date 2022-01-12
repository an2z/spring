package ch20;

import java.util.Random;

/* Random 클래스 
 * 컴퓨터가 생성하는 난수는 가짜 난수(Pseudo-random number)
 * 컴퓨터의 난수 생성 알고리즘은 씨드 값을 기반으로 돌아가기 때문에 씨드 값이 같다면 생성되는 난수의 패턴은 100% 일치함
 * 따라서 매 실행마다 생성되는 난수가 동일
 */

class PsuedoRandomNumber {
	public static void main(String[] args) {
		Random rand = new Random(12);	// 생성자로 씨드 값 12 전달
		
		for (int i=0; i<7; i++)
			System.out.println(rand.nextInt(1000));
	}
}