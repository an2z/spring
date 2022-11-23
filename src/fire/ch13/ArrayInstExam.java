package src.fire.ch13;

/* �迭(���� ����� ����) */
class ArrayInstExam {
	public static void main(String[] args) {
		// ���̰� 3�� Box�� �迭 ����
		Box[] ar = new Box[3];
		System.out.println("ar length: " + ar.length);

		// �迭�� �ν��Ͻ� ����
		ar[0] = new Box("First");
		ar[1] = new Box("Second");
		ar[2] = new Box("Third");

		// ����� �ν��Ͻ� ����
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
	}
}


class Box {
	private String conts;

	Box(String cont) {
		this.conts = cont;
	}

	public String toString() {
		return conts;
	}
}
