package src.fire.ch23;

import java.util.LinkedList;
import java.util.Queue;

/* ť �÷��� Ŭ����
 * LinkedList<E>�� List<E>�� Queue<E>�� ���ÿ� �����ϴ� �÷��� Ŭ�����̴�.
 */

class QueueCollection_LinkedList {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>(); // LinkedList<E> �ν��Ͻ� ����
		
		// �ν��Ͻ� �����ϱ� (offer)
		que.offer("Box");
		que.offer("Toy");
		que.offer("Robot");
		
		// ������ ������ ������ Ȯ�� (peek)
		System.out.println("next: " + que.peek());
		
		// ù��°, �ι�° �ν��Ͻ� ������ (poll)
		System.out.println(que.poll());
		System.out.println(que.poll());
		
		// ������ ������ ������ Ȯ�� (peek)
		System.out.println("next: " + que.peek());
		
		// ������ �ν��Ͻ� ������ (poll)
		System.out.println(que.poll());
	}
}
