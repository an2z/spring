package src.fire.ch16;

/* Object 클래스의 toString 메소드 */
class OverridingToStringExam {
    public static void main(String[] args) {
        Cake c1 = new Cake();
        Cake c2 = new CheeseCake();

        // c1이 참조하는 인스턴스의 toString 메소드 호출로 이어짐
        System.out.println(c1);
        System.out.println();

        // c2가 참조하는 인스턴스의 toString 메소드 호출로 이어짐
        System.out.println(c2);
    }

    static class Cake {
        // Object 클래스의 toString 메소드를 오버라이딩
        public String toString() {
            // Object 클래스의 toString 메소드 호출하여 반환 결과 출력
            System.out.println(super.toString());
            return "My birthday cake";
        }
    }

    static class CheeseCake extends Cake {
        // Cake 클래스의 toString 메소드를 오버라이징
        public String toString() {
            return "My birthday cheese cake";
        }
    }
}
