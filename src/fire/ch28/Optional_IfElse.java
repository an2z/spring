package src.fire.ch28;

class CompInfo { // ȸ�� ����
	String phone; // null�� �� ����
	String adrs;  // null�� �� ����

	public CompInfo(String ph, String ad) {
		phone = ph;
		adrs = ad;
	}

	public String getPhone() { return phone; }
	public String getAdrs() { return adrs; }
}

class Optional_IfElse {
	public static void main(String[] args) {
		CompInfo ci = new CompInfo(null, "Republic of Korea");
		String phone;
		String addr;
		
		if (ci.phone != null)
			phone = ci.getPhone();
		else
			phone = "��ȭ��ȣ ������ �����ϴ�.";
		
		if (ci.adrs != null)
			addr = ci.getAdrs();
		else
			addr = "�ּ� ������ �����ϴ�.";
		
		System.out.println(phone);
		System.out.println(addr);
	}
}
