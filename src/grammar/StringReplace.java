package src.grammar;

public class StringReplace {
    public static void main(String[] args) {
        // replace()
        String str = "가가가";
        String result = str.replace("가", "나");

        System.out.println(str); // 가가가
        System.out.println(result); // 나나나

        // replaceAll()
        String str2 = "123456789";
        String result2 = str2.replaceAll("[369]", "");
        String result3 = str2.replaceAll("[^369]", "");

        System.out.println(str2); // 12345678
        System.out.println(result2); // 124578
        System.out.println(result3); // 369

        // replaceFirst()
        String str3 = "121314";
        String result4 = str3.replaceFirst("1", "_");

        System.out.println(str3); // 121314
        System.out.println(result4); // _21314
    }
}
