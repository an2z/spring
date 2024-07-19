package src.fire.ch28.methodReferences;

import java.util.function.Function;

/* 생성자 참조 */

class StringMakerExam {
    public static void main(String[] args) {
        // Function<char[], String> f = ar -> new String(ar); // 람다식
        Function<char[], String> f = String::new; // 생성자 참조

        char[] src = {'R', 'o', 'b', 'o', 't'};
        String str = f.apply(src);
        System.out.println(str);
    }
}
// Function<T, R> R apply(T t)
