package src.fire.ch20;

import java.util.Arrays;

/* 배열 복사 메소드 (copyOf)
 * 전달받은 배열의 특정 길이만큼을 새로운 배열로 복사하여 반환
 */
class ArraysCopyOf {
    public static void main(String[] args) {
        int[] arOrigin = {1, 2, 3, 4, 5};

        // 배열 전체를 복사
        int[] arCopy1 = Arrays.copyOf(arOrigin, arOrigin.length);

        // 세번째 요소까지만 복사
        int[] arCopy2 = Arrays.copyOf(arOrigin, 3);

        // 새로운 배열의 길이가 원본 배열의 길이보다 길 경우
        int[] arCopy3 = Arrays.copyOf(arOrigin, 8);

        for (int d : arCopy1) {
            System.out.print(d + "\t");
        }
        System.out.println();

        for (int d : arCopy2) {
            System.out.print(d + "\t");
        }
        System.out.println();

        for (int d : arCopy3) {
            System.out.print(d + "\t");
        }
        System.out.println();
    }
}
