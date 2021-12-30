package ch15;

/* 상속
 * 상속 관계를 형성하기 위한 두 클래스는 IS-A 관계(~은 ~이다)에 있어야 한다. 
 * 자식 클래스(스마트폰)은 부모 클래스(모바일폰)가 갖는 기능을 모두 갖고, 자식 클래스 만의 기능도 가진다.
 */

class MobilePhone {
	protected String number;
	
	public MobilePhone(String number) {
		this.number = number;
	}
	
	public void answer() {  // 전화 받기 기능
		System.out.println(number + "의 전화를 받습니다.");
	}
}


/* 자식클래스(SmartPhone), 부모클래스(MobilePhone) */
class SmartPhone extends MobilePhone {
	private String androidVer; // 안드로이드 운영체제 버전
	
	public SmartPhone(String number, String ver) {
		super(number);
		androidVer = ver;
	}
	
	public void playApp() {  // 앱 실행 기능
		System.out.println(androidVer + "버전으로 앱을 실행합니다.");
	}
}


class MobileSmartPhone {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("010-1111-2222", "Nougat");
		phone.answer(); // 전화를 받는다.
		phone.playApp(); // 앱을 선택하고 실행한다.
	}
}
