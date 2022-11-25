package src.fire.ch20;

/* StringTokenizer 클래스
 * 문자열에서 특정 구분자를 기준으로 토큰을 추출
 */
class StringTokenizerClass {
    public static void main(String[] args) {
        // 구분자가 하나일 경우
        java.util.StringTokenizer st1 = new java.util.StringTokenizer("2022/01/12", "/");

        while (st1.hasMoreTokens()) { // 반환할 토큰이 남아 있는가?
            System.out.print(st1.nextToken() + ' '); // 다음 토큰을 반환
        }
        System.out.println();

        // 구분자가 둘 이상일 경우
        java.util.StringTokenizer st2 = new java.util.StringTokenizer("12 + 36 - 8 / 2 = 44", "+-/= "); // 구분자에 공백도 포함

        while (st2.hasMoreTokens()) { // 반환할 토큰이 남아 있는가?
            System.out.print(st2.nextToken() + ' '); // 다음 토큰을 반환
        }
        System.out.println();

        // 구분자도 토큰으로 반환하고 싶을 경우
        java.util.StringTokenizer st3 = new java.util.StringTokenizer("PM:04:30", ":", true);

        while (st3.hasMoreTokens()) {
            System.out.print(st3.nextToken());
        }
        System.out.println();
    }
}
