package src.fire.ch29;

import java.util.Arrays;
import java.util.List;

/* mapToInt()
 * 스트림의 중간 연산
 * 불필요한 오토박싱, 오토언박싱을 생략할 수 있다.
 */
class StreamMapToInt {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("Red", "Black", "Blue");

        li.stream()
                .mapToInt(s -> s.length())
                .forEach(s -> System.out.print(s + " "));
    }
}
