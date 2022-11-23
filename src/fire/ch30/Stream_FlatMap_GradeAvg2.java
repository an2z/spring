package src.fire.ch30;

/* ��Ʈ���� �߰� ���� (flatMap) */

import java.util.Arrays;
import java.util.stream.IntStream;

class ReportCard2 { // ����ǥ
	private int kor;  // ���� ����
	private int eng;  // ���� ����
	private int math; // ���� ����
	
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
		
		Arrays.stream(cards) // �迭 ��� ��Ʈ�� ����
		      .flatMapToInt(r -> IntStream.of(r.getKor(), r.getEng(), r.getMath()))
		      .average()
		      .ifPresent(avg -> System.out.println("��� : " + avg));
	}
}
