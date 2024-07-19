package src.fire.ch16;

/* 어노테이션 @Override
 * 상위 클래스의 메소드를 오버라이딩 할 목적으로 정의한다는 것을
 * 컴파일러에게 알려주는 일종의 메모이다.
 */
class OverrideExam {
    public static void main(String[] args) {
        ParentAdder adder = new ChildAdder();
        System.out.println(adder.add(3, 4));
    }

    static class ParentAdder {
        public int add(int a, int b) {
            return a + b;
        }
    }

    static class ChildAdder extends ParentAdder {
        // 상위 클래스의 add를 오버라이딩
        @Override
        public int add(int a, int b) {
            System.out.println("덧셈을 진행합니다.");
            return a + b;
        }
    }
}
