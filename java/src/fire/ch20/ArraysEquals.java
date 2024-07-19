package src.fire.ch20;

import java.util.Arrays;

/* 배열 비교 메소드 (equals)
 * 전달받은 두 배열이 같은지를 확인하는 메소드
 */
class ArraysEquals {
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4, 5};
        int[] ar2 = Arrays.copyOf(ar1, ar1.length);

        System.out.println(Arrays.equals(ar1, ar2));
    }
}
