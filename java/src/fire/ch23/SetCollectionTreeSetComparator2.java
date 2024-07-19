package src.fire.ch23;

import java.util.Comparator;
import java.util.TreeSet;

/* TreeSet의 정렬 기준 마련 (Comparator 인터페이스 구현) */
class SetCollectionTreeSetComparator2 {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>(new StringComparator());
        tree.add("pig");
        tree.add("monkey");
        tree.add("tiger");

        for (String s : tree) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    static class StringComparator implements Comparator<String> {
        public int compare(String s1, String s2) {
            return s1.length() - s2.length(); // 문자열의 길이를 기준으로 정렬(짧은 -> 긴)
        }
    }
}
