package ch11;

/* 키워드 this */
class ThisInstExam {
	public static void main(String[] args) {
		SampleBox box = new SampleBox(99);
		System.out.println(box.getData());

		box.setData(77);
		System.out.println(box.getData());

	}

}

class SampleBox {
	private int data;

	/* 생성자 */
	SampleBox(int data) {
		// 인스턴스변수와 매개변수의 이름이 동일할 경우 매개변수가 우선
		// 따라서 매개변수가 아닌 인스턴스 변수 this에 접근하기 위해서 this 키워드를 사용
		this.data = data;
	}

	void setData(int data) {
		this.data = data;
	}

	int getData() {
		return this.data;
	}

}
