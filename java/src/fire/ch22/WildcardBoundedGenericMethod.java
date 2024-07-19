package src.fire.ch22;

/* 제한된 와일드 카드 선언을 갖는 제네릭 메소드 */
class WildcardBoundedGenericMethod {
    public static void main(String[] args) {
        Box<Toy> tBox = new Box<>();
        BoxHandler.inBox(tBox, new Toy());
        BoxHandler.outBox(tBox);

        Box<Robot> rBox = new Box<>();
        BoxHandler.inBox(rBox, new Robot());
        BoxHandler.outBox(rBox);
    }

    static class Box<T> {
        private T ob;

        public void set(T o) {
            ob = o;
        }

        public T get() {
            return ob;
        }
    }

    static class Toy {
        @Override
        public String toString() {
            return "I am a Toy";
        }
    }

    static class Robot {
        @Override
        public String toString() {
            return "I am a Robot";
        }
    }

    static class BoxHandler {
        // 상자에서 물건을 꺼내는 메소드
        public static <T> void outBox(Box<? extends T> box) {
            T t = box.get(); // 상자에서 꺼내기
            System.out.println(t);
        }

        // 상자에 물건을 넣는 메소드
        public static <T> void inBox(Box<? super T> box, T n) {
            box.set(n); // 상자에 넣기
        }
    }
}

