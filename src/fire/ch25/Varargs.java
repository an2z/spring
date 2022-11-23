package src.fire.ch25;

/* �������� ���� */

class Varargs {
	public static void showAll(String... vargs) { // �Ű������� �������� ���� -> �迭ó�� ���
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
