package src.fire.ch27.functionalInterface;

import java.util.function.Function;

/* Function
 * 전달 인자와 반환 값이 있는 형태
 */
class FunctionExam {
    public static void main(String[] args) {
        java.util.function.Function<String, Integer> f = s -> s.length();

        System.out.println(f.apply("Red"));
        System.out.println(f.apply("Black"));

        Function<Double, Double> cti = d -> d * 0.393701;
        Function<Double, Double> itc = d -> d * 2.54;

        System.out.println("1cm = " + cti.apply(1.0) + "inch"); // cm를 inch로
        System.out.println("1inch = " + cti.apply(1.0) + "cm"); // inch를 cm로
    }
}
