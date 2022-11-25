package src.fire.ch23;

import java.util.ArrayDeque;
import java.util.Deque;

/* 덱 컬렉션 클래스
 * ArrayDeque<E> : 배열 기반
 * LinkedList<E> : 리스트 기반
 */
class DequeCollectionArrayDeque {
    public static void main(String[] args) {
        Deque<String> deq = new ArrayDeque<>(); // 배열을 기반으로 하는 덱의 구성
//		Deque<String> deq = new LinkedList<>(); // 리스트를 기반으로 하는 덱의 구성

        // 앞으로 넣고 (offerFirst)
        deq.offerFirst("1.Box");
        deq.offerFirst("2.Toy");
        deq.offerFirst("3.Robot");

        // 앞에서 꺼내기 (pollFirst)
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
    }
}
