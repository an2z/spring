package ch20;

import java.util.Arrays;

/* 배열 비교 메소드 (Object형 배열의 equals)
 * 두 배열이 저장하고 있는 인스턴스의 참조 값을 비교한다.
 */

class MakeNum {
	private int num;
	
	public MakeNum(int num) {
		this.num = num;
	}
}

class ArraysClassEquals_Object {
	public static void main(String[] args) {
		MakeNum[] ar1 = new MakeNum[3];	// 길이가 3인 배열 생성
		MakeNum[] ar2 = new MakeNum[3];	// 길이가 3인 배열 생성
		
		ar1[0] = new MakeNum(1);
		ar1[1] = new MakeNum(2);
		ar1[2] = new MakeNum(3);
		
		ar2[0] = new MakeNum(1);
		ar2[1] = new MakeNum(2);
		ar2[2] = new MakeNum(3);
		
		System.out.println(Arrays.equals(ar1, ar2));
	}
}