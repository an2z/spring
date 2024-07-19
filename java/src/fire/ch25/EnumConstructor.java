package src.fire.ch25;

/* 열거형 값이 인스턴스라는 증거2 */
class EnumConstructor {
    public static void main(String[] args) {
        System.out.println(Person.MAN); // toString 메소드의 반환 값 출력
        System.out.println(Person.WOMAN); // toString 메소드의 반환 값 출력
    }

    enum Person {
        MAN, WOMAN;

        Person() { // 생성자 정의
            System.out.println("Person constructor called");
        }

        @Override
        public String toString() {
            return "I am a dog person ♡"; // "나는 개를 사랑하는 사람입니다."
        }
    }
}
