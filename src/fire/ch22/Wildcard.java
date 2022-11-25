package src.fire.ch22;

/* 와일드 카드
 * 물음표 기호(?)를 사용해 메소드의 매개변수를 선언한다.
 * 제네릭 메소드와 기능을 동일하지만 와일드 카드 기반의 메소드가 더욱 간결하다.
 */
class Wildcard {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("Simple String");
        UnBoxer.peekBox(box);
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
        public static <T> T openBox(Box<T> box) {
            return box.get();
        }

        // 상자 안의 내용물을 확인(출력)하는 기능의 메소드 정의
        /* 제네릭 메소드 */
//		public static <T> void peekBox(Box3<T> box) {
//			System.out.println(box);
//		}

        /* 와일드 카드 기반의 메소드 */
        public static void peekBox(Box<?> box) {
            System.out.println(box);
        }
    }
}
