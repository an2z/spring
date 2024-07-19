package src.fire.ch28.optionalClass;

import java.util.Optional;

class BaseExam {
    public static void main(String[] args) {
        Optional<Integer> oi1 = Optional.of(3);
        Optional<Integer> oi2 = Optional.empty();

        System.out.print("[step 1] : ");
        oi1.ifPresent(i -> System.out.print(i + " "));
        oi2.ifPresent(i -> System.out.print(i));
        System.out.println();

        System.out.print("[step 2] : ");
        System.out.print(oi1.orElse(100) + " ");
        System.out.print(oi2.orElse(100) + " ");
        System.out.println();
    }
}
