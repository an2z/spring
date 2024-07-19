package src.fire.ch11;

/* String 클래스의 인스턴스 생성 */
class StringExam {
    public static void showString(String str) {
        System.out.println(str);
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        // String 인스턴스 생성 방법
        String str1 = new String("sample String");
        String str2 = "this is String";

        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(); // 단순 '개 행'이 이뤄진다.

        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println();

        showString("Funny String"); // String 인스턴스 생성 후에 메소드 호출
    }

}

