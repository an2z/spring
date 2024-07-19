package src.fire.ch25;

/* 열거 자료형 */
class Enum {
    public static void main(String[] args) {
        Scale sc = Scale.DO;
        System.out.println(sc);

        switch (sc) {
            case DO:
                System.out.println("도~");
                break;
            case RE:
                System.out.println("레~");
                break;
            case MI:
                System.out.println("미~");
                break;
            case FA:
                System.out.println("파~");
                break;
            default:
                System.out.println("솔~ 라~");
                break;
        }
    }

    enum Scale {
        DO, RE, MI, FA, SO, RA
    }
}
