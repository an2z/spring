package src.fire.ch30;

import java.util.Arrays;
import java.util.stream.Stream;

/* flatMap()
 * 스트림의 중간 연산
 * 하나의 데이터를 여러 개의 데이터로 맵핑한다.
 */
class StreamFlatMap {
    public static void main(String[] args) {
        Stream<String> ss1 = Stream.of("My_NAME", "My_AGE"); // 스트림 생성
        Stream<String> ss2 = ss1.flatMap(s -> Arrays.stream(s.split("_"))); // 람다식에서 스트림 생성
        ss2.forEach(System.out::println);
    }
}
