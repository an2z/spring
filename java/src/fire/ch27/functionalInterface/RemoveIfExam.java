package src.fire.ch27.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/* removeIf 메소드
 * 컬렉션 인스턴스에 저장된 요소 중 해당 조건에 부합하는 요소를 지우는 메소드이다.
 */
class RemoveIfExam {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, -2, 3, -4, 5);
		li = new ArrayList<>(li);

		List<Double> ld = Arrays.asList(-1.1, 2.2, 3.3, -4.4, 5.5);
		ld = new ArrayList<>(ld);

		Predicate<Number> p = n -> n.doubleValue() < 0.0; // 삭제의 조건
		li.removeIf(p); // List<Integer> 인스턴스에 전달
		ld.removeIf(p); // List<Double> 인스턴스에 전달

		System.out.println(li);
		System.out.println(ld);
	}
}
