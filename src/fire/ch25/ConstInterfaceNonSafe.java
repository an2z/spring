package src.fire.ch25;

/* 인터페이스 기반 상수 선언의 문제점 */
class ConstInterfaceNonSafe {
    public static void main(String[] args) {
        who(Person.MAN); // 정상적인 메소드 호출
        who(Animal.DOG); // 비정상적인 메소드 호출이지만 컴파일 에러 발생하지 않음
    }

    public static void who(int man) {
        switch (man) {
            case Person.MAN:
                System.out.println("남자입니다.");
                break;
            case Person.WOMAN:
                System.out.println("여자입니다.");
                break;
        }
    }

    interface Animal {
        int DOG = 1;
        int CAT = 2;
    }

    interface Person {
        int MAN = 1;
        int WOMAN = 2;
    }
}
