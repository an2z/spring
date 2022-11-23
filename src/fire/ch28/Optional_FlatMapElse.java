package src.fire.ch28;

/* Optional Ŭ���� �޼ҵ� (flatmap)
 * Optional �ν��Ͻ��� Ŭ������ ����� �δ� �ܿ쿡 �����ϰ� ����� �� �ִ�.
 */

import java.util.Optional;

class CompInfo3 { // ȸ�� ����
	Optional<String> phone; // null�� �� ����
	Optional<String> adrs;  // null�� �� ����

	public CompInfo3(Optional<String> ph, Optional<String> ad) {
		phone = ph;
		adrs = ad;
	}

	public Optional<String> getPhone() { return phone; }
	public Optional<String> getAdrs() { return adrs; }
}

class Optional_FlatMapElse {
	public static void main(String[] args) {
		Optional<CompInfo3> ci = Optional.of(new CompInfo3(Optional.ofNullable(null), Optional.of("Republic of Korea")));
		
		String phone = ci.flatMap(c -> c.getPhone()).orElse("��ȭ��ȣ ������ �����ϴ�.");
		String addr = ci.flatMap(c -> c.getAdrs()).orElse("�ּ� ������ �����ϴ�.");
		
		System.out.println(phone);
		System.out.println(addr);
	}
}
