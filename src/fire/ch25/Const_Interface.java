package src.fire.ch25;

/* �������̽� ��� ��� ���� 
 * �������̽� ���� ����� ������ public, static, final�� ����� ������ �����Ѵ�. 
 */

interface Scale { // ���踦 ǥ���� ����� ��� �������̽�	
	int DO = 0;
	int RE = 1;
	int MI = 2;
	int FA = 3;
	int SO = 4;
	int RA = 5;
}

class Const_Interface {
	public static void main(String[] args) {
		int sc = Scale.DO;
		
		switch (sc) {
		case Scale.DO:
			System.out.println("��~ ");	
			break;
		case Scale.RE:
			System.out.println("��~ ");
			break;
		case Scale.MI:
			System.out.println("��~ ");
			break;
		case Scale.FA:
			System.out.println("��~ ");
			break;
		default:
			System.out.println("��~ ��~ ");
			break;
		}
	}
}
