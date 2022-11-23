package src.fire.ch28;

import java.util.Optional;

/* Optional Ŭ���� �޼ҵ� (orElse)
 * Optional ��ü�� ����� ���빰�� ������ ���빰�� ��ȯ, 
 * ��ȯ�� ���빰�� ������ orElse ȣ�� �� ���ڷ� ���޵� �ν��Ͻ��� ��� ��ȯ 
 */

class Optional_OrElse {
	public static void main(String[] args) {
		Optional<String> os1 = Optional.empty(); // ����ִ� ��ü ����
		Optional<String> os2 = Optional.of("Hi Optional."); // ����ִ� ��ü ����
		
		String s1 = os1.map(s->s.toString())
				       .orElse("Empty");
		String s2 = os2.map(s->s.toString())
				       .orElse("Empty");
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
