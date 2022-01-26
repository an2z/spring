package ch25;

/* 어노테이션 (Override) 
 * 상위 클래스의 메소드 오버라이딩 또는 인터페이스에 선언된 추상 메소드의 구현이라는 의미 
 */

interface Viewable {
	public void showIt(String str); // 추상 메소드
}

class Viewer implements Viewable {
	@Override
	public void showIt(String str) {
		System.out.println(str);
	}
}

class Annotation_Override {
	public static void main(String[] args) {
		Viewable view = new Viewer();
		view.showIt("Hello Annotations");
	}
}