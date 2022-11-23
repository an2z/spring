package src.fire.ch28;

/* map�� orElse�� ����� if~else ����ϱ� */

import java.util.Optional;

class CompInfo2 { // ȸ�� ����
	String phone; // null�� �� ����
	String adrs;  // null�� �� ����

	public CompInfo2(String ph, String ad) {
		phone = ph;
		adrs = ad;
	}

	public String getPhone() { return phone; }
	public String getAdrs() { return adrs; }
}

class Optional_IfElse_MapOrElse {
	public static void main(String[] args) {
		Optional<CompInfo2> ci = Optional.of(new CompInfo2(null, "Republic of Korea"));
		
		String phone = ci.map(c -> c.getPhone()).orElse("��ȭ��ȣ ������ �����ϴ�.");
		String addr = ci.map(c -> c.getAdrs()).orElse("�ּ� ������ �����ϴ�.");
		
		System.out.println(phone);
		System.out.println(addr);
	}
}
