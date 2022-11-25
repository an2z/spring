package src.fire.ch28.methodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/* 참조변수를 통한 인스턴스 메소드 참조
 * 참조변수가 final 로 선언되거나 effectively final 이어야만 람다식, 메소드 참조를 허용함
 */
class EffectivelyFinalExam {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
        ls = new ArrayList<>(ls);

        JustSort js = new JustSort();
        // Consumer<List<Integer>> c = e -> js.sort(e); // 람다식
        Consumer<List<Integer>> c = js::sort; // 메소드 참조

        c.accept(ls);
        System.out.println(ls);
    }

    static class JustSort {
        public void sort(List<?> lst) { // 인스턴스 메소드
            Collections.reverse(lst);
        }
    }
}
// Consumer<T> void accept(T t)
