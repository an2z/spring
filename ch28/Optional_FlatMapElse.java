package ch28;

/* Optional 클래스 메소드 (flatmap)
 * Optional 인스턴스를 클래스의 멤버로 두는 겨우에 유용하게 사용할 수 있다.
 */

import java.util.Optional;

class CompInfo3 { // 회사 정보
	Optional<String> phone; // null일 수 있음
	Optional<String> adrs;  // null일 수 있음

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
		
		String phone = ci.flatMap(c -> c.getPhone()).orElse("전화번호 정보가 없습니다.");
		String addr = ci.flatMap(c -> c.getAdrs()).orElse("주소 정보가 없습니다.");
		
		System.out.println(phone);
		System.out.println(addr);
	}
}