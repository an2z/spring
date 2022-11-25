package src.fire.ch27.lambda;

/* 람다 표현식 (매개변수 o, 반환 o) */
class OneParamAndReturnExam {
    public static void main(String[] args) {
        HowLong h1 = s -> s.length(); // return문 생략
        System.out.println(h1.len("Happy"));
    }

    interface HowLong {
        int len(String s); // 값을 반환하는 메소드
    }
}
