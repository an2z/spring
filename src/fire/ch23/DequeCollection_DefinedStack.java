package src.fire.ch23;

import java.util.ArrayDeque;
import java.util.Deque;

/* ���� ������� �� ���� ����
 * ���� ����ó�� ����� ��� ������ Ŭ������ �����Ͽ� ����� ���� �����Ѵ�.
 */

interface DIStack<E> {
	public boolean push(E item);
	public E pop();
}

class DCStack<E> implements DIStack<E> {
	private Deque<E> deq;
	
	public DCStack(Deque<E> deq) {
		this.deq = deq;
	}
	
	public boolean push(E item) {
		return deq.offerFirst(item);
	}
	
	public E pop() {
		return deq.pollFirst();
	}
}

class DequeCollection_DefinedStack {
	public static void main(String[] args) {
		DIStack<String> stk	= new DCStack<>(new ArrayDeque<String>()); // �迭 ���
//		DIStack<String> stk	= new DCStack<>(new LinkedList<String>()); // ����Ʈ ���
		
		// push 
		stk.push("1.Box");
		stk.push("2.Toy");
		stk.push("3.Robot");
		
		// pop
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
	}
}
