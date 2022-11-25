package src.fire.ch28.optionalClass;

import java.util.Optional;

/* flatmap()
 * flatmap 메소드는 람다식을 적용해 만들어진 결과물을 감싸지 않고 그대로 반환한다.
 */
class FlatMapExam {
    public static void main(String[] args) {
        Optional<String> os1 = Optional.of("Optional String");
        Optional<String> os2 = os1.map(s -> s.toUpperCase());
        System.out.println(os2.get());

        Optional<String> os3 = os1.flatMap(s -> Optional.of(s.toLowerCase()));
        System.out.println(os3.get());
    }
}
