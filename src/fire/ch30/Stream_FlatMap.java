package src.fire.ch30;

/* ��Ʈ���� �߰� ���� (flatMap) 
 * �ϳ��� �����͸� ���� ���� �����ͷ� �����Ѵ�.
 */

import java.util.Arrays;
import java.util.stream.Stream;

class Stream_FlatMap {
	public static void main(String[] args) {
		Stream<String> ss1 = Stream.of("My_NAME", "My_AGE"); // ��Ʈ�� ����

		Stream<String> ss2 = ss1.flatMap(s -> Arrays.stream(s.split("_"))); // ���ٽĿ��� ��Ʈ�� ����
		ss2.forEach(System.out::println);
	}
}
