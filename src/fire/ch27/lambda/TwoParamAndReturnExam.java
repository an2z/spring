package src.fire.ch27.lambda;

/* 람다 표현식 (매개변수 o, 반환 o)
 * return 중괄호는 생략 불가
 * 문장의 실행 결과 값만 남으면 자동으로 반환해준다 -> return 생략 가능
 */
class TwoParamAndReturnExam {
    public static void main(String[] args) {
        Calculate c;

        c = (a, b) -> {
            return a + b;
        }; // return 중괄호는 생략 불가
        System.out.println(c.cal(4, 3));

        c = (a, b) -> a + b; // 값만 남으면, 별도로 명시하지 않아도 반환 대상이 됨(return 생략)
        System.out.println(c.cal(4, 3));
    }

    interface Calculate {
        int cal(int a, int b); // 값을 반환하는 추상 메소드
    }
}
