package src.fire.ch11;

/* StringBuilder 클래스의 메소드 */
class StringBuilderExam {
    public static void main(String[] args) {
        StringBuilder stb = new StringBuilder("123"); // 문자열 "123"이 저장된 인스턴스 생성

        // 문자열 덧붙이기
        stb.append(45678);
        System.out.println(stb);

        // 문자열 일부(0부터 1까지) 삭제
        stb.delete(0, 2);
        System.out.println(stb);

        // 문자열 내용 뒤집기
        stb.reverse();
        System.out.println(stb);

        // 문자열 자르기
        String sub = stb.substring(2, 4);
        System.out.println(sub);
    }
}
