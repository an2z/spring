package src.fire.ch27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/* removeIf �޼ҵ� 
 * �÷��� �ν��Ͻ��� ����� ��� �� �ش� ���ǿ� �����ϴ� ��Ҹ� ����� �޼ҵ��̴�.
 */

class CollectionInterface_RemoveIf {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, -2, 3, -4, 5);
		li = new ArrayList<>(li);

		List<Double> ld = Arrays.asList(-1.1, 2.2, 3.3, -4.4, 5.5);
		ld = new ArrayList<>(ld);

		Predicate<Number> p = n -> n.doubleValue() < 0.0; // ������ ����
		li.removeIf(p); // List<Integer> �ν��Ͻ��� ����
		ld.removeIf(p); // List<Double> �ν��Ͻ��� ����
		
		System.out.println(li);
		System.out.println(ld);
	}
}
