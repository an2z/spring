package src.fire.ch21;

/* 제네릭 클래스의 타입 인자 제한 (인터페이스)
 * extends 를 사용해 타입 인자를 제한시킬 수 있다.
 */
class TypeArgLimitInterface {
    public static void main(String[] args) {
        Box<Apple> box = new Box<>();
        box.set(new Apple()); // 사과 저장
        Apple ap = box.get(); // 사과 꺼내기
        System.out.println(ap);
    }

    interface Eatable {
        public String eat();
    }

    static class Apple implements Eatable {
        public String toString() {
            return "I am an apple";
        }

        @Override
        public String eat() {
            return "It tastes so good";
        }
    }

    static class Box<T extends Eatable> { // 타입 인자를 Eatable 인터페이스로 제한
        T ob;

        public void set(T o) {
            ob = o;
        }

        public T get() {
            System.out.println(ob.eat()); // Eatable로 제한했기에 eat 메소드 호출 가능
            return ob;
        }
    }
}
