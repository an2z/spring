package src.fire.ch28;

import java.util.Optional;

class Friend3 { // ģ�� ����
	String name;
	Optional<Company3> cmp; // null�ϼ� ����

	public Friend3(String n, Optional<Company3> c) {
		name = n;
		cmp = c;
	}

	public String getName() { return name; }
	public Optional<Company3> getCmp() { return cmp; }
}

class Company3 { // ģ�� ������ ���ϴ� ȸ�� ����
	String cName;
	Optional<ContInfo3> cInfo; // null�ϼ� ����

	public Company3(String cn, Optional<ContInfo3> ci) {
		cName = cn;
		cInfo = ci;
	}

	public String getCName() { return cName; }
	public Optional<ContInfo3> getCInfo() { return cInfo; }
}

class ContInfo3 { // ȸ�� ������ ���ϴ� ȸ�� ����ó
	Optional<String> phone; // null�ϼ� ����
	Optional<String> adrs;  // null�ϼ� ����

	public ContInfo3(Optional<String> ph, Optional<String> ad) {
		phone = ph;
		adrs = ad;
	}

	public Optional<String> getPhone() { return phone; }
	public Optional<String> getAdrs() { return adrs; }
}

class Optional_NullPointerCase3 {
	public static void showCompAddr(Optional<Friend3> f) {
		String addr = f.flatMap(Friend3::getCmp)
				       .flatMap(Company3::getCInfo)
				       .flatMap(ContInfo3::getAdrs)
				       .orElse("�ּ� ������ �����ϴ�.");
		System.out.println(addr);
	}
	
	public static void main(String[] args) {
		Optional<ContInfo3> ci = Optional.of(new ContInfo3(Optional.ofNullable(null), Optional.of("Republic of Korea")));
		Optional<Company3> cp = Optional.of(new Company3("���� ���۴�", ci));
		Optional<Friend3> frn = Optional.of(new Friend3("wuga", cp));
		showCompAddr(frn);
	}
}
