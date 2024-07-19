package src.fire.ch22;

/* 제네릭 클래스의 상속 */
class GenericInheritance {
    public static void main(String[] args) {
        // 상위클래스형(Box<T>) 참조변수가 하위클래스형(SteelBox<T>) 인스턴스 참조 가능
        Box<Integer> iBox = new SteelBox<>(5959);
        Box<String> sBox = new SteelBox<>("simple");

        System.out.println(iBox.get());
        System.out.println(sBox.get());
    }

    // 제네릭 클래스 (상위 클래스)
    static class Box<T> {
        protected T ob;

        public void set(T o) {
            ob = o;
        }

        public T get() {
            return ob;
        }
    }

    // 제네릭 클래스 (하위 클래스)
    static class SteelBox<T> extends Box<T> {
        public SteelBox(T o) {
            ob = o;
        }
    }
}
