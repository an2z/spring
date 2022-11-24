package src.fire.ch13;

/* 1차원 배열 */
class Array1DExam {
    public static void main(String[] args) {
        int[] arr1;
        arr1 = new int[3];             // 길이가 3인 int 형 배열

        double[] arr2 = new double[7]; // 길이가 7인 double 형 배열
        float[] arr3 = new float[9];   // 길이가 9인 float 형 배열

        // 배열의 인스턴스 변수 접근
        System.out.println("arr1 길이: " + arr1.length);
        System.out.println("arr2 길이: " + arr2.length);
        System.out.println("arr3 길이: " + arr3.length);

        int[] arr4 = {1, 2, 3, 4, 5, 6, 7};

        int sum = sumOfArr(arr4); // 배열의 참조값 전달
        System.out.println(sum);
    }

    // 배열의 합계를 반환하는 메소드 정의
    static int sumOfArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
