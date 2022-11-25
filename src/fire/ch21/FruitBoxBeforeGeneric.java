package src.fire.ch21;

/* 제네릭 이전 코드
 * 여러 타입을 사용하는 대부분의 클래스나 메소드에서 인수나 반환값으로 Object 타입을 사용할 경우
 * 반환된 Object 객체를 다시 원하는 타입으로 타입 변환을 해줘야 한다.
 */
class FruitBoxBeforeGeneric {
    public static void main(String[] args) {
        /* 방법1 */
//		AppleBox aBox = new AppleBox(); // 사과 상자 생성
//		OrangeBox oBox = new OrangeBox(); // 오렌지 상자 생성
//
//		aBox.set(new Apple()); // 사과를 사과 상자에 담는다
//		oBox.set(new Orange());	// 오렌지를 오렌지 상자에 담는다
//
//		Apple ap = aBox.get(); // 사과 상자에서 사과를 꺼낸다
//		Orange or = oBox.get(); // 오렌지 상자에서 오렌지를 꺼낸다

        /* 방법2 */
        Box aBox = new Box();
        Box oBox = new Box();

        aBox.set(new Apple()); // 상자에 사과를 담는다
        oBox.set(new Orange()); // 상자에 오렌지를 담는다

        // Box 인스턴스에서 내용물을 꺼낼 때 형 변환을 해야한다
        Apple ap = (Apple) aBox.get(); // 상자에서 사과를 꺼낸다
        Orange or = (Orange) oBox.get(); // 상자에서 오렌지를 꺼낸다

        System.out.println(ap);
        System.out.println(or);
    }

    static class Apple { // 사과를 단순히 표현한 클래스
        public String toString() {
            return "I am an apple";
        }
    }

    static class Orange { // 오렌지를 단순히 표현한 클래스
        public String toString() {
            return "I am an orange";
        }
    }

    /* 방법2 */
    static class Box { // 무엇이든 담을 수 있는 상자
        private Object ob;

        public void set(Object o) {
            ob = o;
        }

        public Object get() {
            return ob;
        }
    }

    /* 방법1 */
//    class AppleBox { // 사과를 담는 상자를 표현한 클래스
//        private Apple ap;
//
//        public void set(Apple a) { // 사과를 담는다
//            ap = a;
//        }
//
//        public Apple get() { // 사과를 꺼낸다
//            return ap;
//        }
//    }
//
//
//    class OrangeBox { // 오렌지를 담는 상자를 표현한 클래스
//        private Orange or;
//
//        public void set(Orange o) { // 오렌지를 담는다
//            or = o;
//        }
//
//        public Orange get() { // 오렌지를 꺼낸다
//            return or;
//        }
//    }
}
