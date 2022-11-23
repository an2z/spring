package src.fire.ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* �÷��� ��� �˰��� (ã��) 
 * BinarySearch �޼ҵ�� ����Ž�� �˰��� ���
 * ���� ���ĵ� ���¿��� ȣ���ؾ� �������� ����� ���� �� ����
 */

class BinarySearchCollections_String {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Box");
		list.add("Robot");
		list.add("Apple");
		
		Collections.sort(list); // ����
		int idx = Collections.binarySearch(list, "Robot"); // Ž��
		
		System.out.println(idx + ". " + list.get(idx)); // Ž�� ��� ���
	}
}
