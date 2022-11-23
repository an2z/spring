package src.fire.ch30;

/* ��Ʈ���� �߰� ���� (flatMap) */

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class ReportCard { // ����ǥ
	private int kor;  // ���� ����
	private int eng;  // ���� ����
	private int math; // ���� ����
	
	public ReportCard(int k, int e, int m) {
		kor = k;
		eng = e;
		math = m;
	}
	public int getKor() { return kor; }
	public int getEng() { return eng; }
	public int getMath() { return math; } 
}

class Stream_FlatMap_GradeAvg1 {
	public static void main(String[] args) {
		ReportCard[] cards = {
				new ReportCard(70, 80, 90),
				new ReportCard(90, 80, 70),
				new ReportCard(80, 80, 80)
		};
		
		// ReportCard �ν��Ͻ��� �̷��� ��Ʈ�� ����
		Stream<ReportCard> sr = Arrays.stream(cards);
		
		// �л����� ���� ������ �̷��� ��Ʈ�� ����
		IntStream si = sr.flatMapToInt(r -> IntStream.of(r.getKor(), r.getEng(), r.getMath()));

		// ����� ���ϱ� ���� ���� ����
		double avg = si.average().getAsDouble(); // average �޼ҵ��� ��ȯ���� OptionalDouble�̹Ƿ� getAsDouble �޼ҵ带 ���� ���� ������
		System.out.println("��� : " + avg);
	}
}
