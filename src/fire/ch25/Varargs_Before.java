package src.fire.ch25;

/* �������� ���� ���� �����Ϸ��� ó�� 
 * �������� ���� ������ �����Ϸ��� �迭�� �����Ѵ�.
 */

class Varargs_Before {
	public static void showAll(String[] vargs) { // �Ű������� �������� ���� -> �迭ó�� ���
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
