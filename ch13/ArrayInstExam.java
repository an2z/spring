package ch13;

/* 배열(값의 저장과 참조) */
class ArrayInstExam {
	public static void main(String[] args) {
		// 길이가 3인 Box형 배열 생성
		Box[] ar = new Box[3];
		System.out.println("ar length: " + ar.length);

		// 배열에 인스턴스 저장
		ar[0] = new Box("First");
		ar[1] = new Box("Second");
		ar[2] = new Box("Third");

		// 저장된 인스턴스 참조
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
