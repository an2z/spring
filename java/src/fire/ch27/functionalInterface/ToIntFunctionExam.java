package src.fire.ch27.functionalInterface;

import java.util.function.ToIntFunction;

/* ToIntFunction */
class ToIntFunctionExam {
    public static void main(String[] args) {
        ToIntFunction<String> f = s -> s.length();
        System.out.println(f.applyAsInt("Red"));
        System.out.println(f.applyAsInt("Black"));
    }
}
