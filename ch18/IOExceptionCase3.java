package ch18;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.IOException;

/* Exception 클래스를 상속하는 예외 클래스 (IOException)
 * 메소드 호출과정 : main -> md1 -> md2
 * throws절을 통해 예외의 처리를 이 메소드를 호출한 메소드에게 넘긴다는 표시를 해줄 수 있음
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
	
	public static void md1() throws IOException {	 // IOException 예외를 넘긴다고 명시
		md2();
	}
	
	public static void md2() throws IOException {    // IOException 예외를 넘긴다고 명시
		Path file = Paths.get("C:\\Users\\anneu\\Desktop\\study_java\\Simple.txt");
		BufferedWriter writer = null;
		writer = Files.newBufferedWriter(file);  	 // IOException 발생 가능
		writer.write('A');	// IOException 발생 가능
		writer.write('Z');	// IOException 발생 가능
			
		if(writer != null)
			writer.close();	// IOException 발생 가능
	}
}
