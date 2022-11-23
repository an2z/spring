package src.fire.ch15;


class Box {
	public void simpleWrap() {
		System.out.println("Simple Wrapping");
	}
}

class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("Paper Wrapping");
	}
}

class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("Gold Wrapping");
	}
}

class InstanceofExam2 {
	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}
	
	
	/* instanseof ������ Ȱ��
	 * box�� Box �ν��Ͻ��� �����ϸ�, simpleWrap �޼ҵ� ȣ��
	 * box�� PaperBox �ν��Ͻ��� �����ϸ�, paperWrap
	 * �޼ҵ� ȣ�� box�� GoldBox �ν��Ͻ��� �����ϸ�, goldWrap �޼ҵ� ȣ��
	 */	
	public static void wrapBox(Box box) {
		if (box instanceof GoldPaperBox) {
			((GoldPaperBox)box).goldWrap();  // �� ��ȯ �� �޼ҵ� ȣ��
		}
		else if (box instanceof PaperBox) {
			((PaperBox)box).paperWrap();  // �� ��ȯ �� �޼ҵ� ȣ��
		}
		else {
			box.simpleWrap();
		}
	}
	
}
