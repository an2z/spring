package src.fire.ch24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 컬렉션 기반 알고리즘 (복사) */
class CopyCollections {
    public static void main(String[] args) {
        List<String> src = Arrays.asList("Box", "Apple", "Toy", "Robot");

        // 복사본 만들기
        List<String> dest = new ArrayList<>(src);

        // 정렬하여 결과 출력
        Collections.sort(dest);
        System.out.println(dest);

        // dest에 저장된 내용을 src에 저장된 내용으로 덮어씀
        Collections.copy(dest, src);

        // 확인
        System.out.println(dest); // 컬렉션 인스턴스에 저장된 내용 전부 출력
    }
}
