package ch20;

import java.util.Arrays;

/* 배열 정렬 메소드 (sort)
 * 매개변수로 전달된 배열을 오름차순(작은->큰)으로 정렬 
 */

class ArraysClassSort {
	public static void main(String[] args) {
		int[] ar1 = {3, 1, 2};
		double[] ar2 = {1.1, 3.3, 2.2};
		
		Arrays.sort(ar1);	// 배열 오름차순 정렬
		Arrays.sort(ar2);	// 배열 오름차순 정렬
		
		System.out.println("ar1: " + Arrays.toString(ar1));
		System.out.println("ar2: " + Arrays.toString(ar2));
	}
}