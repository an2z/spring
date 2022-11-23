package src.fire.ch23;

import java.util.ArrayDeque;
import java.util.Deque;

/* �� �÷��� Ŭ����
 * ArrayDeque<E> : �迭 ���
 * LinkedList<E> : ����Ʈ ���
 */

class DequeCollection_ArrayDeque {
	public static void main(String[] args) {
		Deque<String> deq = new ArrayDeque<>(); // �迭�� ������� �ϴ� ���� ����		
//		Deque<String> deq = new LinkedList<>(); // ����Ʈ�� ������� �ϴ� ���� ����
		
		// ������ �ְ� (offerFirst)
		deq.offerFirst("1.Box");
		deq.offerFirst("2.Toy");
		deq.offerFirst("3.Robot");
		
		// �տ��� ������ (pollFirst)
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
	}
}
