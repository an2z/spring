package src.fire.ch15;

/* instanseof 연산자
 * 참조변수가 참조하는 인스턴스의 클래스나 참조하는 인스턴스가 상속하는 클래스를 묻는 연산자
 * true 또는 false 반환
 */
class InstanceOfExam1 {
    public static void main(String[] args) {
        Cake cake = new StrawberryCheeseCake();

        if (cake instanceof Cake) {
            System.out.println("케익 인스턴스 or");
            System.out.println("케익 상속하는 인스턴스 \n");
        }

        if (cake instanceof CheeseCake) {
            System.out.println("치즈케익 인스턴스 or");
            System.out.println("치즈케익 상속하는 인스턴스 \n");
        }

        if (cake instanceof StrawberryCheeseCake) {
            System.out.println("딸기치즈케익 인스턴스 or");
            System.out.println("딸기치즈케익 상속하는 인스턴스");
        }
    }

    static class Cake {
    }

    static class CheeseCake extends Cake {
    }

    static class StrawberryCheeseCake extends CheeseCake {
    }
}
