package src.fire.ch30;

/* �����Ű����� ��� ��Ʈ�� ���� (of) 
 * ���ڷ� ������ ���� ��Ʈ������ �����Ѵ�. 
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Stream_Of {
	public static void main(String[] args) {
		// ex1
		Stream.of(11, 22, 33, 44, 55) 
			  .forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		// ex2
		Stream.of("This is String")
		      .forEach(System.out::println);
		
		// ex3 - �ϳ��� �÷��� �ν��Ͻ��� �̷��� ��Ʈ�� ����
		List<String> sl = Arrays.asList("Red", "Black", "Blue");
		Stream.of(sl)
		      .forEach(System.out::println);
		
		// ex4 - �⺻�ڷ������� �̷��� ��Ʈ�� ���� (���ʿ��� ����ڽ�, �����ڽ� ����)
		IntStream.of(1, 2, 3, 4, 5)
		         .forEach(s -> System.out.print(s + " "));
	}
}
