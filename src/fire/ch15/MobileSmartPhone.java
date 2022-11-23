package src.fire.ch15;

/* ���
 * ��� ���踦 �����ϱ� ���� �� Ŭ������ IS-A ����(~�� ~�̴�)�� �־�� �Ѵ�. 
 * �ڽ� Ŭ����(����Ʈ��)�� �θ� Ŭ����(�������)�� ���� ����� ��� ����, �ڽ� Ŭ���� ���� ��ɵ� ������.
 */

class MobilePhone {
	protected String number;
	
	public MobilePhone(String number) {
		this.number = number;
	}
	
	public void answer() {  // ��ȭ �ޱ� ���
		System.out.println(number + "�� ��ȭ�� �޽��ϴ�.");
	}
}


/* �ڽ�Ŭ����(SmartPhone), �θ�Ŭ����(MobilePhone) */
class SmartPhone extends MobilePhone {
	private String androidVer; // �ȵ���̵� �ü�� ����
	
	public SmartPhone(String number, String ver) {
		super(number);
		androidVer = ver;
	}
	
	public void playApp() {  // �� ���� ���
		System.out.println(androidVer + "�������� ���� �����մϴ�.");
	}
}


class MobileSmartPhone {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("010-1111-2222", "Nougat");
		phone.answer(); // ��ȭ�� �޴´�.
		phone.playApp(); // ���� �����ϰ� �����Ѵ�.
	}
}
