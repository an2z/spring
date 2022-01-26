package ch25;

/* 가변인자 선언 */

class Varargs {
	public static void showAll(String... vargs) { // 매개변수의 가변인자 선언 -> 배열처럼 사용
		System.out.println("LEN: " + vargs.length);

		for (String s : vargs)
			System.out.println(s + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		showAll("Box");
		showAll("Box", "Toy");
		showAll("Box", "Toy", "Robot");
	}
}