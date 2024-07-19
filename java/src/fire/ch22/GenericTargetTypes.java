package src.fire.ch22;

/* 제네릭 (타켓 타입)
 * 타겟타입(Target Types)이란 T에 전달되는 자료형을 결정 짓기 위한 정보(참조변수의 타입)를 의미
 */
class GenericTargetTypes {
    public static void main(String[] args) {
        // Box2<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
        Box<Integer> iBox = EmptyBoxFactory.makeBox(); // 자바 7부터 제네릭 메소드의 타입인자 생략 가능

        iBox.set(25);
        System.out.println(iBox.get());
    }

    static class Box<T> {
        protected T ob;

        public void set(T o) {
            ob = o;
        }

        public T get() {
            return ob;
        }
    }

    static class EmptyBoxFactory {
        public static <T> Box<T> makeBox() { // 제네릭 메소드 정의
            Box<T> box = new Box<>(); // 상자 생성
            return box; // 생성한 상자 반환
        }
    }
}
