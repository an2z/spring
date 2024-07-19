package src.fire.ch22;

/* 와일드 카드 (상한 제한) */
class WildcardUpperBounded {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<>();
        iBox.set(1234);

        Box<Double> dBox = new Box<>();
        dBox.set(10.09);

        UnBoxer.peekBox(iBox);
        UnBoxer.peekBox(dBox);
    }

    static class Box<T> {
        protected T ob;

        public void set(T o) {
            ob = o;
        }

        public T get() {
            return ob;
        }

        @Override
        public String toString() {
            return ob.toString();
        }
    }

    static class UnBoxer {
        // Number 또는 이를 상속하는 하위 클래스인 제네릭 타입의 인스턴스만 전달되도록 제한
        public static void peekBox(Box<? extends Number> box) {
            System.out.println(box);
        }
    }
}
