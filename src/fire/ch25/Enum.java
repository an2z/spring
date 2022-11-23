package src.fire.ch25;

/* ���� �ڷ��� */

enum Scale2 {
	DO, RE, MI, FA, SO, RA
}

class Enum {
	public static void main(String[] args) {
		Scale2 sc = Scale2.DO;
		System.out.println(sc);
		
		switch (sc) {
		case DO:
			System.out.println("��~");	
			break;
		case RE:
			System.out.println("��~");
			break;
		case MI:
			System.out.println("��~");
			break;
		case FA:
			System.out.println("��~");
			break;
		default:
			System.out.println("��~ ��~");
			break;
		}
	}
}
