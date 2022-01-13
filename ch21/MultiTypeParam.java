package ch21;

/* 제네릭 클래스 정의 (다중 매개변수 기반)
 * 여러개의 타입 변수는 쉼표로 구분하여 명시할수 있다.
 */

class MBox<L,R> {
	private L left;		// 왼쪽 수납공간
	private R right;	// 오른쪽 수납 공간
	
	public void set(L l, R r) {
		left = l;
		right = r;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
}

class MultiTypeParam {
	public static void main(String[] args) {	
		MBox<String, Integer> box = new MBox<String, Integer>();
//		MBox<String, Integer> box = new MBox<>();  // 자바 7부터 타입 인자 생략 가능
		
		box.set("Apple", 25);
		System.out.println(box);
	}
}