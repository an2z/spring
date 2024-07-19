package src.fire.ch11;

/* String 클래스의 메소드 */
class StringMethodExam2 {
    public static void main(String[] args) {
        String st1 = "Lexicographically";
        String st2 = "lexicographically";
        int cmp;

        /* equals (문자열 내용비교) */
        if (st1.equals(st2)) {
            System.out.println("두 문자열은 같습니다.");
        } else {
            System.out.println("두 문자열은 다릅니다");
        }

        /* compareTo (사전상 순서 비교) */
        cmp = st2.compareTo(st1);
        if (cmp == 0) {
            System.out.println("두 문자열은 같습니다.");
        } else if (cmp < 0) {
            System.out.println("사전의 앞에 위치하는 문자열: " + st1);
        } else {
            System.out.println("사전의 뒤에 위치하는 문자열: " + st2);
        }

        /* compareToIgnoreCase (대소문자 구분 없이 사전상 순서 비교) */
        if (st1.compareToIgnoreCase(st2) == 0) {
            System.out.println("두 문자열은 같습니다.");
        } else {
            System.out.println("두 문자열은 다릅니다.");
        }
    }
}
