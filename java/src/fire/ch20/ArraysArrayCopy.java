package src.fire.ch20;

/* 배열 복사 메소드 (arraycopy) */
class ArraysArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[3];

        // 배열 org의 인덱스 1에서 배열 cpy 인덱스 0으로 세개의 요소 복사
        System.arraycopy(arr1, 1, arr2, 0, 3);

        for (int d : arr2) {
            System.out.print(d + "\t");
        }
    }
}
