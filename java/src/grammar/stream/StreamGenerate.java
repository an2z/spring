package src.grammar.stream;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGenerate {
    public static void main(String[] args) {
        System.out.println(makeNumber(1, 5));
        System.out.println(makeRandomNumber(5));
        System.out.println(makeFibonacci(10));
    }

    private static List<Integer> makeNumber(int number, int size) {
        return IntStream.generate(() -> number)
                .limit(size)
                .boxed()
                .collect(toList());
    }

    private static List<Double> makeRandomNumber(int size) {
        return Stream.generate(Math::random)
                .limit(5)
                .collect(toList());
    }

    private static List<Integer> makeFibonacci(int size) {
        IntSupplier fib = new IntSupplier() {
            private int previous = 0;
            private int current = 1;

            @Override
            public int getAsInt() {
                int oldPrevious = this.previous;
                int nextValue = this.previous + this.current;
                this.previous = this.current;
                this.current = nextValue;
                return oldPrevious;
            }
        };

        return IntStream.generate(fib)
                .limit(size)
                .boxed()
                .collect(toList());
    }
}
