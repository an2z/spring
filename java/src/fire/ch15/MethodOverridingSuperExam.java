package src.fire.ch15;

class MethodOverridingSuperExam {
    public static void main(String[] args) {
        CheeseCake c = new CheeseCake();
        c.yummy();
        c.tasty();
    }

    static class Cake {
        public void yummy() {
            System.out.println("yummy Cake");
        }
    }

    static class CheeseCake extends Cake {
        public void yummy() {
            super.yummy(); // Cake의 오버라이딩 된 yummy 메소드 호출
            System.out.println("yummy CheeseCake");
        }

        public void tasty() {
            super.yummy();  // Cake의 오버라이딩 된 yummy 메소드 호출
            System.out.println("testy CheeseCake");
        }
    }
}
