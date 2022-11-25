package src.fire.ch27.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 인스턴스보다 하나의 기능이 필요한 상황을 위한 람다 */
class ComparatorExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Box");
        list.add("Toy");
        list.add("Robot");

        Collections.sort(list, new SLenComp()); // 정렬

        for (String s : list) {
            System.out.println(s);
        }
    }

    static class SLenComp implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return s1.length() - s2.length();
        }
    }
}
