package src.fire.ch22;

/* 와일드 카드 (하한 제한) */
class WildcardLowerBounded {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<>();
        iBox.set(1234);

        Box<Number> nBox = new Box<>();
        nBox.set(9955);

        Box<Object> oBox = new Box<>();
        oBox.set("My simple Instance");

        Box<Double> dBox = new Box<>();
        dBox.set(10.09);

        UnBoxer.peekBox(iBox);
        UnBoxer.peekBox(nBox);
        UnBoxer.peekBox(oBox);
//		Unboxer5.peekBox(dBox); // Integer가 상속하는 부모클래스가 아니므로 컴파일에러 발생
    }

    static class Box<T> {
        private T ob;

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
        // Integer 또는 Integer가 상속하는 부모클래스만이 전달되도록 제한
        public static void peekBox(Box<? super Integer> box) {
            System.out.println(box);
        }
    }
}
