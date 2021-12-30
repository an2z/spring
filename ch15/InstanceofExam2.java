package ch15;


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
	
	
	/* instanseof 연산자 활용
	 * box가 Box 인스턴스를 참조하면, simpleWrap 메소드 호출
	 * box가 PaperBox 인스턴스를 참조하면, paperWrap
	 * 메소드 호출 box가 GoldBox 인스턴스를 참조하면, goldWrap 메소드 호출
	 */	
	public static void wrapBox(Box box) {
		if (box instanceof GoldPaperBox) {
			((GoldPaperBox)box).goldWrap();  // 형 변환 후 메소드 호출
		}
		else if (box instanceof PaperBox) {
			((PaperBox)box).paperWrap();  // 형 변환 후 메소드 호출
		}
		else {
			box.simpleWrap();
		}
	}
	
}
