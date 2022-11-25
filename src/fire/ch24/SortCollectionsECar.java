package src.fire.ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* 컬렉션 기반 알고리즘 (정렬)
 * Comparable<? super T>
 */
class SortCollectionsECar {
    public static void main(String[] args) {
        List<ECar> list = new ArrayList<>();

        list.add(new ECar(1200, 99));
        list.add(new ECar(3000, 55));
        list.add(new ECar(1800, 87));

        Collections.sort(list); // 정렬

        for (Iterator<ECar> itr = list.iterator(); itr.hasNext(); ) { // 출력
            System.out.println(itr.next() + " ");
        }
    }

    static class Car implements Comparable<Car> {
        protected int disp; // 배기량

        public Car(int d) {
            disp = d;
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

    static class ECar extends Car { // 전기 자동차를 표현한 클래스
        private int battery; // 배터리

        public ECar(int d, int b) {
            super(d); // 상위 클래스 생성자 호출
            battery = b;
        }

        @Override
        public String toString() {
            return "cc: " + disp + ", ba: " + battery;
        }
    }
}
