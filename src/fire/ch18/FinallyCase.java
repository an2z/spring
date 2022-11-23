package src.fire.ch18;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.IOException;

/* finally
 * �ڵ��� ������ try ������ �����ϸ� finally������ ������ �����
 * finally �������� try~catch���� �ۼ����� �� �ִ�.
 */

class FinallyCase {
	public static void main(String[] args) {
		Path file = Paths.get("C:\\Users\\anneu\\Desktop\\study_java\\Simple.txt");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);	// IOException �߻� ����
			writer.write('A');	// IOException �߻� ����
			writer.write('Z');	// IOException �߻� ����
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(writer != null)
					writer.close();  // IOException �߻� ����
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
