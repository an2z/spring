package src.fire.ch28;

import java.util.function.Function;

/* ������ ���� */

class MethodReferences_StringMaker {
	public static void main(String[] args) {
		// Function<char[], String> f = ar -> new String(ar); // ���ٽ�
		Function<char[], String> f = String::new; // ������ ����	
		
		char[] src = {'R', 'o', 'b', 'o', 't'};
		String str = f.apply(src);
		System.out.println(str);
	}
}
// Function<T, R>  R apply(T t)
