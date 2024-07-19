package src.fire.ch27.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/* Predicate
 * 전달 인자를 근거로 참/거짓 반환
 */
class PredicateExam {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 5, 7, 9, 11, 12);

        int s;
        s = sum(n -> n % 2 == 0, list1);
        System.out.println("짝수 합: " + s);
        s = sum(n -> n % 2 != 0, list1);
        System.out.println("홀수 합: " + s);

        show(n -> n % 2 != 0, list1); // 홀수만 출력

        List<Double> list2 = Arrays.asList(-1.2, 3.5, -2.4, 9.5);
        show(n -> n > 0.0, list2); // 0.0보다 큰 수만 출력
    }

    public static int sum(Predicate<Integer> p, List<Integer> li) {
        int s = 0;

        for (int n : li) {
            if (p.test(n)) {
                s += n;
            }
        }
        return s;
    }

    public static <T> void show(java.util.function.Predicate<T> p, List<T> li) {
        for (T n : li) {
            if (p.test(n)) {
                System.out.println(n);
            }
        }
    }
}
