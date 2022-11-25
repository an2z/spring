package src.fire.ch30;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* flatMap()
 * 스트림의 중간 연산
 */
class StreamFlatMapGradeAvgExam1 {
    public static void main(String[] args) {
        ReportCard[] cards = {
                new ReportCard(70, 80, 90),
                new ReportCard(90, 80, 70),
                new ReportCard(80, 80, 80)
        };

        // ReportCard 인스턴스로 이뤄진 스트림 생성
        Stream<ReportCard> sr = Arrays.stream(cards);

        // 학생들의 점수 정보로 이뤄진 스트림 생성
        IntStream si = sr.flatMapToInt(r -> IntStream.of(r.getKor(), r.getEng(), r.getMath()));

        // 평균을 구하기 위한 최종 연산
        double avg = si.average().getAsDouble(); // average 메소드의 반환형은 OptionalDouble이므로 getAsDouble 메소드를 통해 값을 꺼내옴
        System.out.println("평균 : " + avg);
    }

    static class ReportCard { // 성적표
        private int kor; // 국어 점수
        private int eng; // 영어 점수
        private int math; // 수학 점수

        public ReportCard(int k, int e, int m) {
            kor = k;
            eng = e;
            math = m;
        }

        public int getKor() {
            return kor;
        }

        public int getEng() {
            return eng;
        }

        public int getMath() {
            return math;
        }
    }
}
