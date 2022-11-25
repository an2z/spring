package src.fire.ch28.methodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/* static 메소드 참조 */
class staticExam {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 3, 5, 7, 9);
        li = new ArrayList<>(li);

        // Consumer<List<Integer>> c = l -> Collections.reverse(l); // 람다식
        Consumer<List<Integer>> c = Collections::reverse; // 메소드 참조
        c.accept(li); // 순서 뒤집기 진행
        System.out.println(li); // 출력
    }
}
// Consumer<T> void accept(T t)
