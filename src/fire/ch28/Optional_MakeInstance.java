package src.fire.ch28;

/* Optional ��ü�� ������ ���� */

import java.util.Optional;

class Optional_MakeInstance {
	public static void main(String[] args) {
		// String �ν��Ͻ��� ������ Optional �ν��Ͻ� ����
		Optional<String> os1 = Optional.of(new String("Red"));
		Optional<String> os2 = Optional.of(new String("blue"));
		
		// Optional �ν��Ͻ��� ����
		if(os1.isPresent())
			System.out.println(os1.get());		
		if(os2.isPresent())
			System.out.println(os2.get());
		
		// Optionla ��ü�� ���� �ִٸ�, �� ���� ���ڷ� �����ϸ� ���ٽ� �Ǵ� �޼ҵ� ������ ����
		os1.ifPresent(s -> System.out.println(s)); //���ٽ� ����
		os2.ifPresent(System.out::println); // �޼ҵ� ���� ����
	}
}
