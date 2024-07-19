package src.fire.ch23;

import java.util.HashSet;

/* Set 컬렉션 클래스 (HashSet)
 * HashCode(), equals() 오버라이딩 전
 */
class SetCollectionHashSetBeforeOverriding {
    public static void main(String[] args) {
        HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799)); // 동일 인스턴스로 간주하지 않음
        System.out.println("저장된 인스턴스 수: " + set.size());

        for (Num n : set) {
            System.out.print(n.toString() + " ");
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
    }
}
