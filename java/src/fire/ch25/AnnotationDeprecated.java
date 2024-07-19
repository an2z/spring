package src.fire.ch25;

/* 어노테이션 (Deprecated)
 * 문제의 발생 소지가 있거나 개선된 기능의 다른 것으로 대체되어서
 * 더이상 필요 없게 되었음을 의미
 */
class AnnotationDeprecated {
    public static void main(String[] args) {
        Viewable view = new Viewer();
        view.showIt("Hello Annotations");
        view.brShowIt("Hello Annotations"); // 컴파일러가 경고하는 문장
    }

    interface Viewable {
        @Deprecated
        public void showIt(String str); // Deprecated 된 메소드

        public void brShowIt(String str);
    }

    static class Viewer implements Viewable {
        @Override
        public void showIt(String str) { // 컴파일러가 경고하는 부분
            System.out.println(str);
        }

        @Override
        public void brShowIt(String str) {
            System.out.println('[' + str + ']');
        }
    }
}
