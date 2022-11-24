package src.fire.ch14;

/* 클래스 변수와 상속
 * 클래스 변수와 클래스 메소드는 인스턴스에 속하지 않기 때문에 상속의 대상이 아니다.
 * 접근 수준 지시자에 따라 상위 클래스와 이를 상속하는 하위 클래스에서도 클래스 변수에 접근이 가능하다.
 */
class SuperSubStaticExam {
    public static void main(String[] args) {
        new SuperCls(); // count 값 1 증가
        new SuperCls(); // count 값 1 증가

        // 하위 클래스 인스턴스 생성과정에서 상위클래스 생성자 호출됨
        SubCls obj = new SubCls(); // count 값 1 증가
        obj.showCount();
    }

    static class SuperCls {
        protected static int count = 0;  // 클래스 변수 선언
        // private static int count = 0; // private일 경우 외부에서 count에 접근 불가능

        public SuperCls() {
            count++;
        }
    }

    static class SubCls extends SuperCls {
        public void showCount() {
            System.out.println(count); // 상위 클래스에 위치한 클래스 변수 count에 접근
        }
    }
}
