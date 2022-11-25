package src.fire.ch25;

/* 인자를 전달받는 열거형 생성자 정의 */
class EnumConstructorParameter {
    public static void main(String[] args) {
        System.out.println(Person.MAN);
        System.out.println(Person.WOMAN);
    }

    enum Person {
        MAN(29), WOMAN(25);

        int age;

        Person(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "I am " + age + " years old";
        }
    }
}
