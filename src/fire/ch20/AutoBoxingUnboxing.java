package src.fire.ch20;

/* 오토박싱, 오토 언박싱
 * 박싱과 언박싱이 필요한 상황에서 이를 컴파일러가 자동으로 처리해줌
 */
class AutoBoxingUnboxing {
    public static void main(String[] args) {
        // 인스턴스가 와야 할 위치에 기본 자료형 값이 오면 오토 박싱 진행
        Integer iObj = 10; // 오토 박싱
        Double dObj = 3.14; // 오토 박싱
        System.out.println(iObj);
        System.out.println(dObj);
        System.out.println();

        // 기본 자료형 값이 와야 할 위치에 인스턴스가 오면 오토 언박싱 진행
        int i = iObj; // 오토 언박싱
        double d = dObj; // 오토 언박싱
        System.out.println(i);
        System.out.println(d);
        System.out.println();

        Integer num = 10; // 오토 박싱 진행

        // 오토 박싱, 오토 언박싱 동시 진행
        num++; // new Integer(num.intValue()+1);
        System.out.println(num);

        // 오토 박싱, 오토 언박싱 동시 진행
        num += 3; // new Integer(num.intValue()+3);
        System.out.println(num);

        int r = num + 5; // 오토 언박싱 진행
        Integer rObj = num - 5; // 오토 박싱, 언박싱 진행
        System.out.println(r);
        System.out.println(rObj);
    }
}
