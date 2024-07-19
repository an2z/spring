package core.basic.singleton;

public class StatefulService {
    private int price; // 공유 필드 (상태 유지)

    public void order(String name, int price) {
        System.out.println("name = " + name + ", price = " + price);
        this.price = price; // 값을 넣어줌 (여기가 문제)
    }

    public int getPrice() {
        return price; // 값을 꺼냄
    }
}
