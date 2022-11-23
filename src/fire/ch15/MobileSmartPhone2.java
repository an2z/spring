package src.fire.ch15;

class MobilePhone2 {
	protected String number;
	
	public MobilePhone2(String number) {
		this.number = number;
	}
	
	public void answer() {  // ��ȭ �ޱ� ���
		System.out.println(number + "�� ��ȭ�� �޽��ϴ�.");
	}
}


/* �ڽ�Ŭ����(SmartPhone), �θ�Ŭ����(MobilePhone) */
class SmartPhone2 extends MobilePhone2 {
	private String androidVer; // �ȵ���̵� �ü�� ����
	
	public SmartPhone2(String number, String ver) {
		super(number);
		androidVer = ver;
	}
	
	public void playApp() {  // �� ���� ���
		System.out.println(androidVer + "�������� ���� �����մϴ�.");
	}
}


class MobileSmartPhone2 {
	public static void main(String[] args) {
		SmartPhone2 ph1 = new SmartPhone2("010-1111-2222", "Nougat");
		MobilePhone2 ph2 = new SmartPhone2("010-3333-4444", "Nougat");
		
		ph1.answer();
		ph1.playApp();
		
		ph2.answer();
//		ph2.playApp();  // �θ� Ŭ������ ���������� ���ؼ��� �ڽ�Ŭ���� �޼ҵ忡 ���� �Ұ���
	}
}
