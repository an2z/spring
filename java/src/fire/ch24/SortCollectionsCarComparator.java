package src.fire.ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* 컬렉션 기반 알고리즘 (정렬)
 * Comparator<? super T>
 */
class SortCollectionsCarComparator {
    public static void main(String[] args) {
        List<Car> cList = new ArrayList<>();
        cList.add(new Car(1800));
        cList.add(new Car(1200));
        cList.add(new Car(3000));

        List<ECar> eList = new ArrayList<ECar>();
        eList.add(new ECar(3000, 55));
        eList.add(new ECar(1800, 87));
        eList.add(new ECar(1200, 99));

        CarComp comp = new CarComp();

        // 각각 정렬
        Collections.sort(cList, comp);
        Collections.sort(eList, comp); // 이 문장이 이 예제의 핵심

        for (Iterator<Car> itr = cList.iterator(); itr.hasNext(); ) {
            System.out.println(itr.next() + " ");
        }
        System.out.println();

        for (Iterator<ECar> itr = eList.iterator(); itr.hasNext(); ) {
            System.out.println(itr.next() + " ");
        }
    }

    static class Car {
        protected int disp; // 배기량

        public Car(int d) {
            disp = d;
        }

        @Override
        public String toString() {
            return "cc: " + disp;
        }
    }

    // Car의 정렬을 위한 클래스 정의
    static class CarComp implements Comparator<Car> {
        @Override
        public int compare(Car o1, Car o2) {
            return o1.disp - o2.disp;
        }
    }

    static class ECar extends Car {
        private int battery; // 배터리

        public ECar(int d, int b) {
            super(d);
            battery = b;
        }

        @Override
        public String toString() {
            return "cc: " + disp + " ,ba: " + battery;
        }
    }
}
