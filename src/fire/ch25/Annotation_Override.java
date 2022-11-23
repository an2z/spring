package src.fire.ch25;

/* ������̼� (Override) 
 * ���� Ŭ������ �޼ҵ� �������̵� �Ǵ� �������̽��� ����� �߻� �޼ҵ��� �����̶�� �ǹ� 
 */

interface Viewable {
	public void showIt(String str); // �߻� �޼ҵ�
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
