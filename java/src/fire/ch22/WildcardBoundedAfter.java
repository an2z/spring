package src.fire.ch22;

/* 와일드 카드 (상한,하한 제한 적용 후)
 * extends로 상한 제한을 두면 넣는 것(set) 불가
 * super로 하한 제한을 두면 꺼내는 것(get) 불가
 */
class WildcardBoundedAfter {
    public static void main(String[] args) {
        Box<Toy> box = new Box<>();
        BoxHandler.inBox(box, new Toy()); // 상자에 넣기
        BoxHandler.outBox(box); // 상자에서 꺼내기
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

    static class BoxHandler {
        // 상자에서 물건을 꺼내는 메소드
        public static void outBox(Box<? extends Toy> box) {
            Toy t = box.get(); // 상자에서 꺼내기
            // box.set(new Toy()); // 넣으려 하면 컴파일 오류 발생
            System.out.println(t);
        }

        // 상자에 물건을 넣는 메소드
        public static void inBox(Box<? super Toy> box, Toy n) {
            box.set(n); // 상자에 넣기
            // Toy toy = box.get(); // 꺼내려 하면 컴파일 오류 발생
        }
    }
}
