package src.fire.ch11;

/* Ű���� this */
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

	/* ������ */
	SampleBox(int data) {
		// �ν��Ͻ������� �Ű������� �̸��� ������ ��� �Ű������� �켱
		// ���� �Ű������� �ƴ� �ν��Ͻ� ���� this�� �����ϱ� ���ؼ� this Ű���带 ���
		this.data = data;
	}

	void setData(int data) {
		this.data = data;
	}

	int getData() {
		return this.data;
	}

}
