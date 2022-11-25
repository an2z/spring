package src.fire.ch23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* HashMap<K, V> 순차적 접근 방법
 * keySet 메소드 -> 순차적 접근 가능
 * 1) for-each문
 * 2) 반복자
 */
class MapCollectionHashMapIterator {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");

        // key만 담고 있는 컬렉션 인스턴스 생성 (keySet)
        Set<Integer> ks = map.keySet();

        // 전체 key 출력 (for-each문 기반)
        for (Integer n : ks) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 전체 value 출력 (for-each문 기반)
        for (Integer n : ks) {
            System.out.print(map.get(n) + " ");
        }
        System.out.println();

        // 전체 value 출력 (반복자 기반)
        for (Iterator<Integer> itr = ks.iterator(); itr.hasNext(); ) {
            System.out.print(map.get(itr.next()) + " ");
        }
        System.out.println();
    }
}
