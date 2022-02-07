package ch28;

class CompInfo { // 회사 정보
	String phone; // null일 수 있음
	String adrs;  // null일 수 있음

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
			phone = "전화번호 정보가 없습니다.";
		
		if (ci.adrs != null)
			addr = ci.getAdrs();
		else
			addr = "주소 정보가 없습니다.";
		
		System.out.println(phone);
		System.out.println(addr);
	}
}