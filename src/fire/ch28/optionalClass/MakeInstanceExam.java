package src.fire.ch28.optionalClass;

import java.util.Optional;

/* Optional 객체의 생성과 접근 */
class MakeInstanceExam {
    public static void main(String[] args) {
        // String 인스턴스를 저장한 Optional 인스턴스 생성
        Optional<String> os1 = Optional.of(new String("Red"));
        Optional<String> os2 = Optional.of(new String("blue"));

        // Optional 인스턴스에 접근
        if (os1.isPresent()) {
            System.out.println(os1.get());
        }
        if (os2.isPresent()) {
            System.out.println(os2.get());
        }

        // Optional 객체에 값이 있다면, 그 값을 인자로 전달하며 람다식 또는 메소드 참조문 실행
        os1.ifPresent(s -> System.out.println(s)); // 람다식 버전
        os2.ifPresent(System.out::println); // 메소드 참조 버전
    }
}
