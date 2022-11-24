package src.fire.ch13;

/* 2차원 배열 생성과 접근 */
class Array2DExam {
    public static void main(String[] args) {
        /* 방법1 */
        int[][] arr1 = new int[3][3]; // 세로길이(행)가 3, 가로길이(열)가 3인 int형 2차원 배열 생성
        int num = 1;

        // 배열에 값을 저장
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = num;
                num++;
            }
        }

        // 배열에 저장된 값을 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

        /* 방법2 */
        int[][] arr2 = {
                {11},           // 1행 초기화
                {22, 33},       // 2행 초기화
                {44, 55, 66}    // 3행 초기화
        };

        // 배열의 구조대로 내용 출력
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
