package src.fire.ch20;

import java.util.Arrays;

/* 배열 복사 메소드 (copyOfRange)
 * 전달받은 배열의 특정 범위에 해당하는 요소만을 새로운 배열로 복사하여 반환
 */
class ArraysCopyOfRange {
    public static void main(String[] args) {
        int[] org = {1, 2, 3, 4, 5};
        int[] cpy = Arrays.copyOfRange(org, 1, 4);

        for (int d : cpy) {
            System.out.print(d + "\t");
        }
    }
}
