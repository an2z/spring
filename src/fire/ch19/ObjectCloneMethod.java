package src.fire.ch19;

/* objectŬ������ �޼ҵ� (clone)
 * object Ŭ������ ���ǵǾ� �ִ� clone �޼ҵ尡 ȣ��Ǹ� �ν��Ͻ��� ���簡 �̷���
 * ��, clonable �������̽��� ������ �ν��Ͻ��� ������θ� �� �޼ҵ带 ȣ���� �� �ִ�.
 */

class Point implements Cloneable {  // Point�� Cloneable �������̽��� ����
	private int xPos;
	private int yPos;
	
	public Point (int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void showPostion() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}


public class ObjectCloneMethod {
	public static void main(String[] args) {
		Point org = new Point(3,5);
		Point cpy;
		
		try {
			cpy = (Point)org.clone();
			org.showPostion();
			cpy.showPostion();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
