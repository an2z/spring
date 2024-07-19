package src.fire.ch19;

/* Equals()
 * 인스턴스의 내용 비교를 위한 기능을 equals 메소드에 담아 정의
 */
class EqualityMethod {
    public static void main(String[] args) {
        Num num1 = new Num(10);
        Num num2 = new Num(15);
        Num num3 = new Num(10);

        if (num1.equals(num2)) {
            System.out.println("num1, num2 내용이 동일합니다.");
        } else {
            System.out.println("num1, num2 내용이 다릅니다.");
        }

        if (num1.equals(num3)) {
            System.out.println("num1. num2 내용이 동일합니다.");
        } else {
            System.out.println("num1, num3 내용이 다릅니다.");
        }
    }

    static class Num {
        private int num;

        public Num(int num) {
            this.num = num;
        }

        @Override
        public boolean equals(Object obj) {
            if (this.num == ((Num) obj).num) {
                return true;
            } else {
                return false;
            }
        }
    }
}
