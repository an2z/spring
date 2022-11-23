package src.fire.ch29;

/* ��Ʈ���� �߰� ����(���� - mapToInt) 
 * ���ʿ��� ����ڽ�, �����ڽ��� ������ �� �ִ�. 
 */

import java.util.Arrays;
import java.util.List;

class Stream_MapToInt {
	public static void main(String[] args) {
		List<String> li = Arrays.asList("Red", "Black", "Blue");
		li.stream()
		  .mapToInt(s -> s.length())
		  .forEach(s -> System.out.print(s + " "));
	}
}
