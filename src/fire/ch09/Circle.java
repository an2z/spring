package src.fire.ch09;

public class Circle {
	public static void main(String[] args) {
		CircleArea c = new CircleArea(1.5);
		System.out.println(c.getArea());
		
		c.setRad(2.5);
		System.out.println(c.getArea());
		c.setRad(-3.3);
		System.out.println(c.getArea());
		
		/*
		 * ���� ���� �� -> �������� ������ �� �� ���� ���� ������ �������� ������ ������ �߻����� ���� 
		 * ���� ���� �� -> �ܺο��� rad�������� ������ �Ұ����ϱ� ������ ������ ���� �߻�
		 */
//		c.rad = -4.5;
		System.out.println(c.getArea());
	}
}


class CircleArea {
	/* ���� ���� �� */
//	double rad = 0;
	/* ���� ���� �� */
	private double rad = 0;  // ������
	
	final double PI = 3.14;	
	
	/* ������ */
	public CircleArea(double r) {
		setRad(r);
	}
	
	/* setter -> �ν��Ͻ� ����(������) ���� */
	// �� �޼ҵ带 ���� �������� ���� !
	public void setRad(double r) {
		if (r < 0) {  // �������� 0���� ���� ���(�߸��� ��)
			rad = 0;  // �׳� 0���� ����
			return;
		}
		rad = r;
	}
	
	/* ���� ���� ���ϱ� */
	public double getArea() {
		return (rad * rad) * PI;
	}
}
