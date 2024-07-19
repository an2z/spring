package src.fire.ch29;

import java.util.ArrayList;
import java.util.List;

/* 필터링 후 맵핑 */
class StreamFilteringMap {
    public static void main(String[] args) {
        List<ToyPriceInfo> ls = new ArrayList<>();

        ls.add(new ToyPriceInfo("건담_45", 200));
        ls.add(new ToyPriceInfo("콩순이_2", 350));
        ls.add(new ToyPriceInfo("타요_779", 550));

        int sum = ls.stream()
                .filter(p -> p.getPrice() < 500) // 가격이 500 미만인 것만 통과
                .mapToInt(t -> t.getPrice()) // 가격을 기준으로 맵핑
                .sum(); // 최종 연산

        System.out.println("sum = " + sum);
    }

    static class ToyPriceInfo { // 장난감 모델 별 가격 정보
        private String model; // 모델명
        private int price; // 가격

        public ToyPriceInfo(String m, int p) {
            model = m;
            price = p;
        }

        public int getPrice() {
            return price;
        }
    }
}
