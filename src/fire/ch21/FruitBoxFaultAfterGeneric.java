package src.fire.ch21;

/* 제네릭 이후 코드
 * 실수가 컴파일 과정에서 드러난다.
 */
class FruitBoxFaultAfterGeneric {
    public static void main(String[] args) {
        Box<Apple> aBox = new Box<Apple>();
        Box<Orange> oBox = new Box<Orange>();

        aBox.set("Apple"); // 프로그래머의 실수가 컴파일 오류로 이어짐
        oBox.set("Orange"); // 프로그래머의 실수가 컴파일 오류로 이어짐

        Apple ap = aBox.get();
        Orange or = oBox.get();

        System.out.println(ap);
        System.out.println(or);
    }

    static class Apple {
        public String toString() {
            return "I am an apple";
        }
    }

    static class Orange {
        public String toString() {
            return "I am an arange";
        }
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
}
