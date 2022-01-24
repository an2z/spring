package ch23;

import java.util.LinkedList;
import java.util.Queue;

/* 큐 컬렉션 클래스
 * LinkedList<E>는 List<E>와 Queue<E>를 동시에 구현하는 컬렉션 클래스이다.
 */

class QueueCollection_LinkedList {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>(); // LinkedList<E> 인스턴스 생성
		
		// 인스턴스 저장하기 (offer)
		que.offer("Box");
		que.offer("Toy");
		que.offer("Robot");
		
		// 무엇이 다음에 나올지 확인 (peek)
		System.out.println("next: " + que.peek());
		
		// 첫번째, 두번째 인스턴스 꺼내기 (poll)
		System.out.println(que.poll());
		System.out.println(que.poll());
		
		// 무엇이 다음에 나올지 확인 (peek)
		System.out.println("next: " + que.peek());
		
		// 마지막 인스턴스 꺼내기 (poll)
		System.out.println(que.poll());
	}
}