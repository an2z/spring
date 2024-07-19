package src.fire.ch23;

import java.util.ArrayDeque;
import java.util.Deque;

/* 덱을 기반으로 한 스택 구현
 * 덱을 스택처럼 사용할 경우 별도의 클래스를 정의하여 사용할 것을 권장한다.
 */
class DequeCollectionDefinedStack {
    public static void main(String[] args) {
        DIStack<String> stk = new DCStack<>(new ArrayDeque<String>()); // 배열 기반
//		DIStack<String> stk	= new DCStack<>(new LinkedList<String>()); // 리스트 기반

        // push
        stk.push("1.Box");
        stk.push("2.Toy");
        stk.push("3.Robot");

        // pop
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
    }

    interface DIStack<E> {
        public boolean push(E item);

        public E pop();
    }

    static class DCStack<E> implements DIStack<E> {
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
}
