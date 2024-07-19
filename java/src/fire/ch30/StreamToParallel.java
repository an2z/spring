package src.fire.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/* parallel()
 * 병렬스트림으로 변경
 * 이미 스트림을 생성한 상태에서 이를 기반으로 parallel 메소드 호출하면 병렬스트림으로 생성
 */
class StreamToParallel {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Red", "Black", "Blue");

        Stream<String> ss = ls.stream(); // 스트림 생성

        BinaryOperator<String> lc = (s1, s2) -> {
            if (s1.length() > s2.length()) // 문자열 길이가 긴 요소 반환
            {
                return s1;
            } else {
                return s2;
            }
        };

        String str = ss.parallel() // 병렬 스트림 생성
                .reduce("", lc);
        System.out.println(str);
    }
}
