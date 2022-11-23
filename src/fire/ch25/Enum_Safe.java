package src.fire.ch25;

/* ���� �ڷ���
 * �������̽� ����� ��� ���ǿ��� �߻��� ������ �ذ�
 */

enum Animal2 {
	DOG, CAT
}

enum Person2 {
	MAN, WOMAN
}

class Enum_Safe {
	public static void main(String[] args) {
		who(Person2.MAN); // �������� �޼ҵ� ȣ��
//		who(Animal2.DOG); // �������� �޼ҵ� ȣ���� ������ ������ �̾���
		
	}
	
	public static void who(Person2 man) {
		switch(man) {
		case MAN:
			System.out.println("�����Դϴ�.");
			break;
		case WOMAN:
			System.out.println("�����Դϴ�.");
			break;
		}
	}
}
