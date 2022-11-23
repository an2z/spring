package src.fire.ch28;

/* Optional Ŭ���� �޼ҵ� (flatmap)
 * flatmap �޼ҵ�� ���ٽ��� ������ ������� ������� ������ �ʰ� �״�� ��ȯ�Ѵ�.
 */

import java.util.Optional;

class Optional_FlatMap {
	public static void main(String[] args) {
		Optional<String> os1 = Optional.of("Optional String");
		Optional<String> os2 = os1.map(s -> s.toUpperCase());
		System.out.println(os2.get());

		Optional<String> os3 = os1.flatMap(s -> Optional.of(s.toLowerCase()));
		System.out.println(os3.get());
	}
}
