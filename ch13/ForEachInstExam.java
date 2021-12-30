package ch13;


class ForEachInstExam {
	public static void main(String[] args) {
		Box2[] arr = new Box2[5];
		arr[0] = new Box2(101, "One");
		arr[1] = new Box2(202, "Two");
		arr[2] = new Box2(303, "Three");
		arr[3] = new Box2(404, "Four");
		arr[4] = new Box2(505, "Five");
		
		// �迭���� ��ȣ�� 505�� Box�� ã�� �� ���빰�� ����ϴ� �ݺ���
		for (Box2 e : arr) {
			if (e.getBoxNum() == 505)
				System.out.println(e);
		}
	
	}
}


class Box2 {
	private String contents;
	private int boxNum;
	
	Box2(int num, String cont) {
		boxNum = num;
		contents = cont;
	}
	
	public int getBoxNum() {
		return boxNum;
	}
	
	public String toString() {
		return contents;
	}
	
}
