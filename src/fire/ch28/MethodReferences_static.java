package src.fire.ch28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/* static �޼ҵ� ���� */

class MethodReferences_static {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 3, 5, 7, 9);
		li = new ArrayList<>(li);
		
		// Consumer<List<Integer>> c = l -> Collections.reverse(l); // ���ٽ�
		Consumer<List<Integer>> c = Collections::reverse; // �޼ҵ� ����
		c.accept(li); // ���� ������ ����
		System.out.println(li); // ���
	}
}
// Consumer<T>  void accept(T t)
