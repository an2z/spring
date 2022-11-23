package src.fire.ch19;

/* ���� ���� (Shallow Copy)
 * �ּ� ���� �����Ѵٴ� �ǹ� 
 * �����ϰ� �ִ� �������� ����
 */

class Point2 implements Cloneable {
	private int xPos;
	private int yPos;
	
	public Point2 (int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void showPostion() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}
	
	public void changePos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}


class Rectangle2 implements Cloneable {
	private Point2 upperLeft;	// ���� ��� ��ǥ
	private Point2 lowerRight;	// ���� �ϴ� ��ǥ
	
	public Rectangle2 (int x1, int y1, int x2, int y2) {
		upperLeft = new Point2(x1, y1);
		lowerRight = new Point2(x2, y2);
	}
	
	public void changePos(int x1, int y1, int x2, int y2) {		// ��ǥ ���� ����
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public void showPosition() {	// ���簢�� ��ǥ ���� ���
		System.out.print("���� ��� : ");
		upperLeft.showPostion();
		
		System.out.print("���� �ϴ� : ");
		lowerRight.showPostion();
	}	
}


class ShallowCopy {
	public static void main(String[] args) {
		Rectangle2 org = new Rectangle2(1, 1, 9, 9);
		Rectangle2 cpy;
		
		try {
			cpy = (Rectangle2)org.clone();	// �ν��Ͻ� ����
			org.changePos(2, 2, 7, 7);		// �ν��Ͻ� ��ǥ ���� ����
			
			System.out.println("---- org ��ǥ ----");
			org.showPosition();
			
			System.out.println("---- cpy ��ǥ ----");
			cpy.showPosition();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
