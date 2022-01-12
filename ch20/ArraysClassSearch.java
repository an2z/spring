package ch20;

import java.util.Arrays;

/* 배열 탐색 메소드 (binarySearch) 
 * 전달받은 배열에서 특정 객체의 위치를 이진탐색 알고리즘을 사용해 검색한 후, 해당 위치를 반환한다.
 * 매개변수로 전달되는 배열이 sort() 메소드 등을 사용해 미리 정렬되어 있어야만 제대로 동작
 */

class ArraysClassSearch {
	public static void main(String[] args) {
		int[] ar = {1, 3, 4, 2, 5};
		Arrays.sort(ar);	// 탐색 이전에 정렬이 선행되어야 한다.
		
		System.out.println(Arrays.toString(ar));
		
		int idx = Arrays.binarySearch(ar, 3);	// 배열 ar에서 3을 찾아라.
		System.out.println("Index of 3: " + idx);
	}
}