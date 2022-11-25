package src.fire.ch27.functionalInterface;

import java.util.function.DoubleUnaryOperator;

/* DoubleUnaryOperator */
class DoubleUnaryOperatorExam {
    public static void main(String[] args) {
        DoubleUnaryOperator cti = d -> d * 0.393701;
        DoubleUnaryOperator itc = d -> d * 2.54;
        System.out.println("1cm = " + cti.applyAsDouble(1.0) + "inch"); // cm를 inch로
        System.out.println("1inch = " + cti.applyAsDouble(1.0) + "cm"); // inch를 cm로
    }
}
