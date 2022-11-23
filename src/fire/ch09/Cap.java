package src.fire.ch09;

/* ĸ��ȭ */
public class Cap {
	public static void main(String[] args) {
		ColdPatient patient = new ColdPatient();  // ȯ�� ����		
		patient.coldTakeList(new ColdCap());
		
	}
}


class ColdCap {
	void snot() {    // �๰ óġ
		System.out.println("�๰�� ��~ ���ϴ�.");
	}
	
	void sneeze() {  // ��ä�� óġ
		System.out.println("��ä�Ⱑ �ܽ��ϴ�.");
	}
	
	void snuffle() {    // �� ���� óġ
		System.out.println("�ڰ� �� �ո��ϴ�.");
	}
	
	void coldTake() {  // ���� ���� ��� �� ������ ��� �޼ҵ�
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
