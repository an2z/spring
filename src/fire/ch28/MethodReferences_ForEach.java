package src.fire.ch28;

import java.util.Arrays;
import java.util.List;

/* forEach �޼ҵ� */

class MethodReferences_ForEach {
	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Red", "Black");
		
		ls.forEach(s -> System.out.println(s)); // ���ٽ� ���
		ls.forEach(System.out::println); // �޼ҵ� ���� ���
	}
}
