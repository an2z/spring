package ch28;

import java.util.Optional;

class Friend2 { // 친구 정보
	String name;
	Company2 cmp; // null일수 있음

	public Friend2(String n, Company2 c) {
		name = n;
		cmp = c;
	}

	public String getName() { return name; }
	public Company2 getCmp() { return cmp; }
}

class Company2 { // 친구 정보에 속하는 회사 정보
	String cName;
	ContInfo2 cInfo; // null일수 있음

	public Company2(String cn, ContInfo2 ci) {
		cName = cn;
		cInfo = ci;
	}

	public String getCName() { return cName; }
	public ContInfo2 getCInfo() { return cInfo; }
}

class ContInfo2 { // 회사 정보에 속하는 회사 연락처
	String phone; // null일수 있음
	String adrs;  // null일수 있음

	public ContInfo2(String ph, String ad) {
		phone = ph;
		adrs = ad;
	}

	public String getPhone() { return phone; }
	public String getAdrs() { return adrs; }
}

class Optional_NullPointerCase2 {
	public static void showCompAddr(Optional<Friend2> f) {
		String addr = f.map(Friend2::getCmp)
				       .map(Company2::getCInfo)
				       .map(ContInfo2::getAdrs)
				       .orElse("주소 정보가 없습니다.");
		System.out.println(addr);
	}
	
	public static void main(String[] args) {
		ContInfo2 ci = new ContInfo2("321-444-577", "Republic of Korea");
		Company2 cp = new Company2("자취 컴퍼니", ci);
		Friend2 frn = new Friend2("wuga", cp);
		showCompAddr(Optional.of(frn));
	}
}