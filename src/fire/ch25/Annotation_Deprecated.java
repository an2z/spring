package src.fire.ch25;

/* ������̼� (Deprecated) 
 * ������ �߻� ������ �ְų� ������ ����� �ٸ� ������ ��ü�Ǿ
 * ���̻� �ʿ� ���� �Ǿ����� �ǹ�
 */

interface Viewable2 {
	@Deprecated
	public void showIt(String str); // Deprecated �� �޼ҵ�
	
	public void brShowIt(String str);
}

class Viewer2 implements Viewable2 {
	@Override
	public void showIt(String str) { // �����Ϸ��� ����ϴ� �κ�
		System.out.println(str);
	}
	
	@Override
	public void brShowIt(String str) {
		System.out.println('[' + str + ']');
	}
}

class Annotation_Deprecated {
	public static void main(String[] args) {
		Viewable2 view = new Viewer2();
		view.showIt("Hello Annotations");
		view.brShowIt("Hello Annotations"); // �����Ϸ��� ����ϴ� ����
	}
}
