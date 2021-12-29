package ch09;

/* 캡슐화 */
public class Cap {
	public static void main(String[] args) {
		ColdPatient patient = new ColdPatient();  // 환자 생성		
		patient.coldTakeList(new ColdCap());
		
	}
}


class ColdCap {
	void snot() {    // 콧물 처치
		System.out.println("콧물이 싹~ 납니다.");
	}
	
	void sneeze() {  // 재채기 처치
		System.out.println("재채기가 멎습니다.");
	}
	
	void snuffle() {    // 코 막힘 처치
		System.out.println("코가 뻥 뚫립니다.");
	}
	
	void coldTake() {  // 약의 복용 방법 및 순서가 담긴 메소드
		snot();
		sneeze();
		snuffle();
	}
}


class ColdPatient {
	void coldTakeList(ColdCap cap) {
		cap.coldTake();
	}
}
