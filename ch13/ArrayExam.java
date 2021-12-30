package ch13;

/* 배열(1차원 배열 생성방법) */
class ArrayExam {
	public static void main(String[] args) {
		int[] ar1 = new int[3]; // 길이가 5인 int형 배열
		double[] ar2 = new double[7]; // 길이가 7인 double형 배열

		// 배열의 참조변수와 인스턴스 생성 분리
		float[] ar3;
		ar3 = new float[9];

		// 배열의 인스턴스 변수 접근
		System.out.println("배열 ar1 길이: " + ar1.length);
		System.out.println("배열 ar2 길이: " + ar2.length);
		System.out.println("배열 ar3 길이: " + ar3.length);
	}

}
