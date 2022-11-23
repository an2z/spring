package src.fire.ch18;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.IOException;

/* Exception Ŭ������ ����ϴ� ���� Ŭ���� (IOException)
 * �޼ҵ� ȣ����� : main -> md1 -> md2
 * throws���� ���� ������ ó���� �� �޼ҵ带 ȣ���� �޼ҵ忡�� �ѱ�ٴ� ǥ�ø� ���� �� ����
 */

class IOExceptionCase3 {
	public static void main(String[] args) {
		try {
			md1();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void md1() throws IOException {	 // IOException ���ܸ� �ѱ�ٰ� ���
		md2();
	}
	
	public static void md2() throws IOException {    // IOException ���ܸ� �ѱ�ٰ� ���
		Path file = Paths.get("C:\\Users\\anneu\\Desktop\\study_java\\Simple.txt");
		BufferedWriter writer = null;
		writer = Files.newBufferedWriter(file);  	 // IOException �߻� ����
		writer.write('A');	// IOException �߻� ����
		writer.write('Z');	// IOException �߻� ����
			
		if(writer != null)
			writer.close();	// IOException �߻� ����
	}
}
