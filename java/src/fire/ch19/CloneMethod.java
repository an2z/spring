package src.fire.ch19;

/* clone()
 * object 클래스에 정의되어 있는 clone 메소드가 호출되면 인스턴스의 복사가 이뤄짐
 * 단, clonable 인터페이스를 구현한 인스턴스를 대상으로만 이 메소드를 호출할 수 있다.
 */
public class CloneMethod {
    public static void main(String[] args) {
        Point org = new Point(3, 5);
        Point cpy;

        try {
            cpy = (Point) org.clone();
            org.showPosition();
            cpy.showPosition();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    static class Point implements Cloneable { // Point가 Cloneable 인터페이스를 구현
        private int xPos;
        private int yPos;

        public Point(int x, int y) {
            xPos = x;
            yPos = y;
        }

        public void showPosition() {
            System.out.printf("[%d, %d]", xPos, yPos);
            System.out.println();
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
