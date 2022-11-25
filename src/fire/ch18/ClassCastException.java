package src.fire.ch18;

/* ClassCastException
 * 허용할 수 없는 형 변환을 강제로 진행하는 경우 발생
 */
class ClassCastException {
    public static void main(String[] args) {
        Board abd1 = new ABoard();
        ABoard abd2 = (ABoard) abd1; // 명시적 형변환 ok!

        System.out.println(".. intermediate location ..");

        Board bd1 = new Board();
        ABoard bd2 = (ABoard) bd1; // 예외 발생
    }

    static class Board {
    }

    static class ABoard extends Board {
    }
}
