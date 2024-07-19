package src.fire.ch21;

/* 제네릭 이전 코드
 * 프로그래머가 실수를 해도 그 실수가 드러나지 않을 수 있다는 문제점을 가진다.
 */
class FruitBoxFaultBeforeGeneric {
    public static void main(String[] args) {
        Box aBox = new Box();
        Box oBox = new Box();

        /* 프로그래머의 실수 */
        // 아래 두 문장에서는 사과와 오렌지가 아닌 "문자열"을 담았다.
        aBox.set("Apple");
        oBox.set("Orange");

        /* 실행과정에서의 예외 발견 */
        // 상자에 과일이 담기지 않았는데 과일을 꺼내려 한다.
//		Apple2 ap = (Apple2)aBox.get();
//		Orange2 or = (Orange2)oBox.get();
//		System.out.println(ap);
//		System.out.println(or);

        /* 실수가 드러나지 않음 */
        System.out.println(aBox.get());
        System.out.println(oBox.get());
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

    static class Box {
        private Object ob;

        public void set(Object o) {
            ob = o;
        }

        public Object get() {
            return ob;
        }
    }
}
