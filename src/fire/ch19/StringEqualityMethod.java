package src.fire.ch19;

/* String 클래스의 Equals 메소드
 * == 연산자: 참조변수의 참조값 비교
 * equals(): 인스턴스의 내용 비교
 */
class StringEqualityMethod {
    public static void main(String[] args) {
        String str1 = new String("Simple");
        String str2 = new String("Simple");

        // 참조 값을 비교
        if (str1 == str2) {
            System.out.println("str1, str2 참조 값이 동일");
        } else {
            System.out.println("str1, str2 참조 값이 다름");
        }

        // 두 인스턴스의 내용을 비교
        if (str1.equals(str2)) {
            System.out.println("str1, str2 내용이 동일");
        } else {
            System.out.println("str1, str2 내용이 다름");
        }
    }
}
