package src.fire.ch28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/* ���������� ���� �ν��Ͻ� �޼ҵ� ���� 
 * ���������� final���� ����ǰų� effectively final�̾�߸� ���ٽ�, �޼ҵ� ������ ����� 
 */

class JustSort {
	public void sort(List<?> lst) { // �ν��Ͻ� �޼ҵ�
		Collections.reverse(lst);
	}
}

class MethodReferences_EffectivelyFinal {
	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(1,3,5,7,9);
		ls = new ArrayList<>(ls);
		
		JustSort js = new JustSort();
		
		// Consumer<List<Integer>> c = e -> js.sort(e); // ���ٽ�
		Consumer<List<Integer>> c = js::sort; // �޼ҵ� ����
		
		c.accept(ls);
		System.out.println(ls);
	}
}
// Consumer<T>  void accept(T t)
