package src.fire.ch28.optionalClass;

import java.util.Optional;

/* orElse()
 * Optional 객체에 저장된 내용물이 있으면 내용물을 반환,
 * 반환할 내용물이 없으면 orElse 호출 시 인자로 전달된 인스턴스를 대신 반환
 */
class OrElseExam {
    public static void main(String[] args) {
        Optional<String> os1 = Optional.empty(); // 비어있는 객체 생성
        Optional<String> os2 = Optional.of("Hi Optional."); // 비어있는 객체 생성

        String s1 = os1.map(s -> s.toString())
                .orElse("Empty");
        String s2 = os2.map(s -> s.toString())
                .orElse("Empty");

        System.out.println(s1);
        System.out.println(s2);
    }
}
