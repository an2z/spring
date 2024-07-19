package src.fire.ch24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* 컬렉션 기반 알고리즘 (정렬) */
class SortCollections {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot");
        list = new ArrayList<String>(list);

        // 정렬 이전 출력
        for (Iterator<String> itr = list.iterator(); itr.hasNext(); ) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // 정렬
        Collections.sort(list);

        // 정렬 이후 출력
        for (Iterator<String> itr = list.iterator(); itr.hasNext(); ) {
            System.out.print(itr.next() + " ");
        }
    }
}
