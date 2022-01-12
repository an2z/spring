package ch20;

import java.util.Arrays;

/* 배열 비교 메소드 (Object형 배열의 equals)
 * 배열의 참조 값 비교가 아닌 내용 비교가 목적이라면 equals 메소드를 목적에 맞게 오버라이딩 해야 한다.
 */

class MakeNum2 {
	private int num;
	
	public MakeNum2(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((MakeNum2)obj).num)	// 두 인스턴스의 내용 비교
			return true;
		else 
			return false;
	}
}

class ArraysClassEquals_Object2 {
	public static void main(String[] args) {
		MakeNum2[] ar1 = new MakeNum2[3];	// 길이가 3인 배열 생성
		MakeNum2[] ar2 = new MakeNum2[3];	// 길이가 3인 배열 생성
		
		// 각 배열에 인스턴스 저장
		ar1[0] = new MakeNum2(1);		
		ar1[1] = new MakeNum2(2);
		ar1[2] = new MakeNum2(3);
		
		// 각 배열에 인스턴스 저장
		ar2[0] = new MakeNum2(1);
		ar2[1] = new MakeNum2(2);
		ar2[2] = new MakeNum2(3);
		
		System.out.println(Arrays.equals(ar1, ar2));
	}
}