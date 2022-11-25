package src.fire.ch23;

import java.util.HashSet;

/* Set 컬렉션 클래스 (HashSet)
 * HashCode(), equals() 오버라이딩 후
 */
class SetCollectionHashSetAfterOverriding {
    public static void main(String[] args) {
        HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));
        System.out.println("저장된 인스턴스 수: " + set.size());

        for (Num n : set) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    static class Num {
        private int num;

        public Num(int num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return String.valueOf(num);
        }

        @Override // Object클래스의 hashCode메소드 오버라이딩
        public int hashCode() {
            return num % 3; // num의 값이 같으면 부류도 같다.
        }

        @Override // Object클래스의 equals메소드 오버라이딩
        public boolean equals(Object obj) { // num의 값이 같으면 true 반환
            if (num == ((Num) obj).num) {
                return true;
            } else {
                return false;
            }
        }
    }

}
