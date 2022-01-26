package ch25;

/* 가변인자 선언에 대한 컴파일러의 처리 
 * 가변인자 선언를 만나면 컴파일러는 배열로 수정한다.
 */

class Varargs_Before {
	public static void showAll(String[] vargs) { // 매개변수의 가변인자 선언 -> 배열처럼 사용
		System.out.println("LEN: " + vargs.length);

		for (String s : vargs)
			System.out.println(s + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		showAll(new String[]{"Box"});
		showAll(new String[]{"Box", "Toy"});
		showAll(new String[]{"Box", "Toy", "Robot"});
	}
}