package ch15;

class MobilePhone2 {
	protected String number;
	
	public MobilePhone2(String number) {
		this.number = number;
	}
	
	public void answer() {  // 전화 받기 기능
		System.out.println(number + "의 전화를 받습니다.");
	}
}


/* 자식클래스(SmartPhone), 부모클래스(MobilePhone) */
class SmartPhone2 extends MobilePhone2 {
	private String androidVer; // 안드로이드 운영체제 버전
	
	public SmartPhone2(String number, String ver) {
		super(number);
		androidVer = ver;
	}
	
	public void playApp() {  // 앱 실행 기능
		System.out.println(androidVer + "버전으로 앱을 실행합니다.");
	}
}


class MobileSmartPhone2 {
	public static void main(String[] args) {
		SmartPhone2 ph1 = new SmartPhone2("010-1111-2222", "Nougat");
		MobilePhone2 ph2 = new SmartPhone2("010-3333-4444", "Nougat");
		
		ph1.answer();
		ph1.playApp();
		
		ph2.answer();
//		ph2.playApp();  // 부모 클래스형 참조변수를 통해서는 자식클래스 메소드에 접근 불가능
	}
}