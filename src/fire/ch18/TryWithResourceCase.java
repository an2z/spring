package src.fire.ch18;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.IOException;

/* try-with-resources
 * try�� �̾� �����ϴ� �Ұ�ȣ �ȿ� ������ ������ �ʿ�� �ϴ� ���ҽ��� ����
 * ���ҽ��� try-with-resources���� ���������鼭 �ڵ����� ����
 */

class TryWithResourceCase {
	public static void main(String[] args) {
		Path file = Paths.get("C:\\Users\\anneu\\Desktop\\study_java\\Simple.txt");
		
		try(BufferedWriter writer = Files.newBufferedWriter(file)) {
			writer.write('A');
			writer.write('Z');
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
