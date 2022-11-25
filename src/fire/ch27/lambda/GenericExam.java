package src.fire.ch27.lambda;

/* 람다식과 제네릭
 * 인터페이스형 참조변수를 선언할 때 타입인자를 전달하면 추상메소드의 T가 결정된다.
 */
class GenericExam {
    public static void main(String[] args) {
        Calculate<Integer> ci = (a, b) -> a + b; // <T>:Integer
        System.out.println(ci.cal(4, 3));

        Calculate<Double> cd = (a, b) -> a + b; // <T>:Double
        System.out.println(cd.cal(4.32, 3.45));
    }

    @FunctionalInterface
    interface Calculate<T> { // 제네릭 기반의 함수형 인터페이스
        T cal(T a, T b);
    }
}
