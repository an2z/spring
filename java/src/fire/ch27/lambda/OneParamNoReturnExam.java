package src.fire.ch27.lambda;

/* 람다 표현식 (매개변수 o, 반환 x) */
class OneParamNoReturnExam {
    interface Printable {
        void print(String s); // 매개변수 하나, 반환형 void
    }

    public static void main(String[] args) {
        Printable p;

        // 줄임 없는 표현
        p = (String s) -> {
            System.out.println(s);
        };
        p.print("Lambda exp one.");

        // 중괄호 생략 (문장이 하나인 경우)
        p = (String s) -> System.out.println(s);
        p.print("Lambda exp two.");

        // 매개변수 타입 생략
        p = (s) -> System.out.println(s);
        p.print("Lambda exp three.");

        // 매개변수 소괄호 생략 (매개변수가 하나인 경우)
        p = s -> System.out.println(s);
        p.print("Lambda exp four.");
    }
}
