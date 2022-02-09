package ch30;

/* 스트림의 중간 연산 (flatMap) */

import java.util.Arrays;
import java.util.stream.IntStream;

class ReportCard2 { // 성적표
	private int kor;  // 국어 점수
	private int eng;  // 영어 점수
	private int math; // 수학 점수
	
	public ReportCard2(int k, int e, int m) {
		kor = k;
		eng = e;
		math = m;
	}
	public int getKor() { return kor; }
	public int getEng() { return eng; }
	public int getMath() { return math; } 
}

class Stream_FlatMap_GradeAvg2 {
	public static void main(String[] args) {
		ReportCard2[] cards = {
				new ReportCard2(70, 80, 90),
				new ReportCard2(90, 80, 70),
				new ReportCard2(80, 80, 80)
		};
		
		Arrays.stream(cards) // 배열 기반 스트림 생성
		      .flatMapToInt(r -> IntStream.of(r.getKor(), r.getEng(), r.getMath()))
		      .average()
		      .ifPresent(avg -> System.out.println("평균 : " + avg));
	}
}