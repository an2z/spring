package src.fire.ch30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/* collect()
 * 스트림의 최종 연산
 */
class StreamCollect {
    public static void main(String[] args) {
        String[] names = {"anne", "wuga", "jeong", "jun"};

        Stream<String> ss = Arrays.stream(names); // 스트림 생성

        List<String> ls = ss.parallel() // 병렬 스트림으로 변환
                .filter(s -> s.length() < 5) // 문자열 길이 5 미만인 것만 통과
                .collect(() -> new ArrayList<>(), // 저장소 생성
                        (c, s) -> c.add(s), // 저장소에 통과된 스트림 요소 저장
                        (ls1, ls2) -> ls1.addAll(ls2)); // 병렬 처리 결과를 취합하는 방법

        System.out.println(ls);
    }
}
