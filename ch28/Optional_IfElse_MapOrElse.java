package ch28;

/* map과 orElse를 사용해 if~else 대신하기 */

import java.util.Optional;

class CompInfo2 { // 회사 정보
	String phone; // null일 수 있음
	String adrs;  // null일 수 있음

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
		
		String phone = ci.map(c -> c.getPhone()).orElse("전화번호 정보가 없습니다.");
		String addr = ci.map(c -> c.getAdrs()).orElse("주소 정보가 없습니다.");
		
		System.out.println(phone);
		System.out.println(addr);
	}
}