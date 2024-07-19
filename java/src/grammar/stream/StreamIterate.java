package src.grammar.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args) {
        makeFibonacci();
        makeEven();
    }

    private static void makeFibonacci() {
        makeFibonacciSet().stream()
                .map(t -> t[0])
                .forEach(System.out::println);
    }

    private static List<int[]> makeFibonacciSet() {
        List<int[]> fibonacciSet = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(20)
                .collect(Collectors.toList());

        fibonacciSet.forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));

        return fibonacciSet;
    }

    private static void makeEven() {
        IntStream.iterate(0, n -> n + 2)
                .takeWhile(n -> n < 100)
                .forEach(System.out::println);

        // 두번째 인수: 프레디케이트를 받아 언제까지 작업을 수행할 것인지의 기준으로 사용
        IntStream.iterate(0, n -> n < 100, n -> n + 2)
                .forEach(System.out::println);
    }
}
