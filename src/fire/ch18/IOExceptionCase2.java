package src.fire.ch18;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;

/* Exception Ŭ������ ����ϴ� ���� Ŭ���� (IOException)
 * ����ó���� ������ ������ ������ ������ �߻� 
 * IOException ���ܰ� �߻� ���ɼ��� �ִ� �޼ҵ� ȣ�⹮���� ������ �߻��Ѵ�.
 */

class IOExceptionCase2 {
	public static void main(String[] args) {
		Path file = Paths.get("C:\\Users\\anneu\\Desktop\\study_java\\Simple.txt");
		BufferedWriter writer = null;		
//		writer = Files.newBufferedWriter(file);  // IOException �߻� ����
//		writer.write('A');	// IOException �߻� ����
//		writer.write('Z');	// IOException �߻� ����
			
//		if(writer != null)
//			writer.close();	// IOException �߻� ����
	}
}
