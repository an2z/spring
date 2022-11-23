package src.fire.ch28;

/* Optional Ŭ���� �޼ҵ� (map)
 * map �޼ҵ�� ���ٽ��� ������ ������� ������� 
 * Optional �ν��Ͻ��� ��Ƽ� ��ȯ
 */

import java.util.Optional;

class Optional_Map {
	public static void main(String[] args) {
		Optional<String> os1 = Optional.of("Optional String");
		Optional<String> os2 = os1.map(s -> s.toUpperCase());
		System.out.println(os2.get());

		Optional<String> os3 = os1.map(s -> s.replace(' ', '_'))
				                  .map(s -> s.toLowerCase());
		
		System.out.println(os3.get());
	}
}
