package src.fire.ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* 컬렉션 기반 알고리즘 (정렬) */
class SortCollectionsCar {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car(1200));
        list.add(new Car(3000));
        list.add(new Car(1800));
        Collections.sort(list); // 정렬

        for (Iterator<Car> itr = list.iterator(); itr.hasNext(); ) {
            System.out.println(itr.next() + " ");
        }
    }

    static class Car implements Comparable<Car> {
        private int disp; // 배기량

        public Car(int disp) {
            this.disp = disp;
        }

        @Override
        public String toString() {
            return "cc: " + disp;
        }

        @Override
        public int compareTo(Car o) {
            return disp - o.disp; // 오름차순
        }
    }
}
