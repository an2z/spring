package src.fire.ch20;

import java.util.Random;

/* Random 클래스
 * 난수를 생성하기 위한 클래스
 * Random 클래스의 인스턴스를 생성하고, 목적에 따른 메소드를 호출하면 난수가 반환됨
 */
class RandomClass {
    public static void main(String[] args) {
        Random rand = new Random(); // Random 인스턴스 생성

        for (int i = 0; i < 7; i++) {
            System.out.println(rand.nextInt(1000)); // 0 이상 1000미만 난수 반환
        }
    }
}
