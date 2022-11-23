package src.fire.ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* �÷��� ��� �˰��� (ã��) 
 * BinarySearch �޼ҵ�� ����Ž�� �˰��� ���
 * ���� ���ĵ� ���¿��� ȣ���ؾ� �������� ����� ���� �� ����
 */

// String ���� �� Ž���� ���� Ŭ���� ����
class StrComp implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.compareToIgnoreCase(s2); // �빮��, �ҹ��� ���� ���� ��
	}
}

class BinarySearchCollections_String_Comparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ROBOT");
		list.add("APPLE");
		list.add("BOX");
		
		StrComp comp = new StrComp(); // ���İ� Ž���� ����
		
		Collections.sort(list); // ����
		int idx = Collections.binarySearch(list, "Robot", comp); // comp ������ ������ Ž��
		
		System.out.println(idx + ". " + list.get(idx)); // Ž�� ��� ���
	}
}
