package src.fire.ch28.optionalClass;

import java.util.Optional;

/* map()
 * 람다식을 적용해 만들어진 결과물을 Optional 인스턴스에 담아서 반환
 */
class MapExam {
    public static void main(String[] args) {
        Optional<String> os1 = Optional.of("Optional String");
        Optional<String> os2 = os1.map(s -> s.toUpperCase());

        System.out.println(os2.get());

        Optional<String> os3 = os1.map(s -> s.replace(' ', '_'))
                .map(s -> s.toLowerCase());

        System.out.println(os3.get());
    }
}
