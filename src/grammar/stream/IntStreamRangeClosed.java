package src.grammar.stream;

import java.util.stream.IntStream;

public class IntStreamRangeClosed {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        System.out.println(countEvenOfRangeClosed(start, end));
        System.out.println(countEvenOfRange(start, end));
    }

    private static long countEvenOfRange(int start, int end) {
        return IntStream.range(start, end) // 1부터 99까지의 숫자 생성
                .filter(n -> n % 2 == 0) // 1부터 99까지의 짝수 스트림
                .count(); // 50
    }

    private static long countEvenOfRangeClosed(int start, int end) {
        return IntStream.rangeClosed(start, end) // 1부터 100까지의 숫자 생성
                .filter(n -> n % 2 == 0) // 1부터 100까지의 짝수 스트림
                .count(); // 49
    }
}
