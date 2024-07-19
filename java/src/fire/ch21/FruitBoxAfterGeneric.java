package src.fire.ch21;

/* 제네릭 이후 코드
 * 제네릭을 사용하면 컴파일 시에 미리 타입이 정해지므로,
 * 타입 검사나 타입 변환과 같은 번거로운 작업을 생략할 수 있게 된다.
 */
class FruitBoxAfterGeneric {
    public static void main(String[] args) {
        Box<Apple> aBox = new Box<Apple>(); // T를 Apple로 결정
        Box<Orange> oBox = new Box<Orange>(); // T를 Orange로 결정

        aBox.set(new Apple()); // 사과를 상자에 담는다
        oBox.set(new Orange()); // 오렌지를 상자에 담는다

        Apple ap = aBox.get(); // 사과를 꺼내는데 형 변환이 필요 없다
        Orange or = oBox.get(); // 오렌지를 꺼내는데 형 변환이 필요 없다

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
            return "I am an orange";
        }
    }

    // 제네릭 기반의 코드
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
