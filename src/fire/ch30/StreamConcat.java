package src.fire.ch30;

import java.util.stream.Stream;

/* concat()
 * 스트림의 연결
 */
class StreamConcat {
    public static void main(String[] args) {
        Stream<String> ss1 = Stream.of("Cake", "Milk");
        Stream<String> ss2 = Stream.of("Lemon", "Jelly");

        // 두개 스트림 연결
        Stream.concat(ss1, ss2)
                .forEach(s -> System.out.print(s + " "));
    }
}
