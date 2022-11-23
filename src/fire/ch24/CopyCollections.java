package src.fire.ch24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* �÷��� ��� �˰��� (����) */

class CopyCollections {
	public static void main(String[] args) {
		List<String> src = Arrays.asList("Box", "Apple", "Toy", "Robot");
		
		// ���纻 �����
		List<String> dest = new ArrayList<>(src);
		
		// �����Ͽ� ��� ���
		Collections.sort(dest);
		System.out.println(dest);
		
		// dest�� ����� ������ src�� ����� �������� ���
		Collections.copy(dest, src);
		
		// Ȯ��
		System.out.println(dest); // �÷��� �ν��Ͻ��� ����� ���� ���� ���
	}
}
