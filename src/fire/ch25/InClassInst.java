package src.fire.ch25;

/* Person 클래스 내에서 Person형 참조변수 선언, Person형 인스턴스 생성 가능 */
class InClassInst {
    public static void main(String[] args) {
        System.out.println(Person.MAN);
        System.out.println(Person.WOMAN);
    }

    static class Person {
        public static final Person MAN = new Person();
        public static final Person WOMAN = new Person();

        @Override
        public String toString() {
            return "I am a dog person ♡"; // "나는 개를 사랑하는 사람입니다."
        }
    }
}
