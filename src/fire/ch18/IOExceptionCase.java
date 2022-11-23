package src.fire.ch18;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.IOException;

/* Exception Ŭ������ ����ϴ� ���� Ŭ���� (IOException)
 * ���� ��ο� ������ ������, �� �ȿ� �� ���� ���ڸ� �����ϰ� ���� �δ� ����
 * try ~ catch���� �ۼ� �� ���ܻ�Ȳ�� ó������
 */

class IOExceptionCase {
	public static void main(String[] args) {
		Path file = Paths.get("C:\\Users\\anneu\\Desktop\\study_java\\Simple.txt");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);  // IOException �߻� ����
			writer.write('A');	// IOException �߻� ����
			writer.write('Z');	// IOException �߻� ����
			
			if(writer != null)
				writer.close();	// IOException �߻� ����
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
