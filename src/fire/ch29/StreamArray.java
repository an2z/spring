package src.fire.ch29;

import java.util.Arrays;
import java.util.stream.Stream;

/* 배열 대상 스트림 생성 */
class StreamArray {
    public static void main(String[] args) {
        String[] names = {"앤", "욱", "준", "졍"};

        // 배열 전체을 이용한 스트림 생성
        Stream<String> stm1 = Arrays.stream(names);
        stm1.forEach(s -> System.out.print(s + " ")); // 최종 연산
        System.out.println();

        // 배열의 특정 부분만을 이용한 스트림 생성
        Stream<String> stm2 = Arrays.stream(names, 1, 3);
        stm2.forEach(s -> System.out.print(s + " ")); //  최종 연산
        System.out.println();

        // 코드 줄이기
        Arrays.stream(names)
                .forEach(s -> System.out.print(s + " "));
    }
}
