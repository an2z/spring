package src.fire.ch22;

/* 제네릭 인터페이스
 * 제네릭 인터페이스를 구현할 때는 T를 결정한 상태로 구현할 수도 있다.
 */
class GenericInterface2 {
    public static void main(String[] args) {
        Box<Toy> box = new Box<>();
        box.set(new Toy());

        Getable<String> gt = box;
        System.out.println(gt.get());
    }

    interface Getable<T> {
        public T get();
    }

    static class Box<T> implements Getable<String> {
        private T ob;

        public void set(T o) {
            ob = o;
        }

        @Override
        public String get() {
            return ob.toString();
        }
    }

    static class Toy {
        @Override
        public String toString() {
            return "I am a Toy";
        }
    }
}
