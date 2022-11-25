package src.fire.ch25;

/* 열거 자료형
 * 인터페이스 기반의 상수 정의에서 발생한 문제점 해결
 */
class EnumSafe {
    public static void main(String[] args) {
        who(Person.MAN); // 정상적인 메소드 호출
        // who(Animal.DOG); // 비정상적 메소드 호출이 컴파일 에러로 이어짐
    }

    public static void who(Person man) {
        switch (man) {
            case MAN:
                System.out.println("남자입니다.");
                break;
            case WOMAN:
                System.out.println("여자입니다.");
                break;
        }
    }

    enum Person {
        MAN, WOMAN
    }

    enum Animal {
        DOG, CAT

    }
}
