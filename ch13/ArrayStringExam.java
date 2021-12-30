package ch13;

class ArrayStringExam {
	public static void main(String[] args) {
		String[] str = {"one", "two", "three", "four", "five"};
		
		/* 배열의 장점 */
		// 반복문으로 변수 i를 이용해 모든 배열 요소에 접근할 수 있다.
		for (int i=0; i<str.length; i++) {
			int cnum = 0;
			cnum += str[i].length();
			System.out.println(i + "번째 글자수: " + cnum + "글자");
		}
	}

}
