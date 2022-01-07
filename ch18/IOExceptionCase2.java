package ch18;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.IOException;

/* Exception 클래스를 상속하는 예외 클래스 (IOException)
 * 예외처리를 해주지 않으면 컴파일 오류가 발생 
 * IOException 예외가 발생 가능성이 있는 메소드 호출문에서 오류가 발생한다.
 */

class IOExceptionCase2 {
	public static void main(String[] args) {
		Path file = Paths.get("C:\\Users\\anneu\\Desktop\\study_java\\Simple.txt");
		BufferedWriter writer = null;		
//		writer = Files.newBufferedWriter(file);  // IOException 발생 가능
//		writer.write('A');	// IOException 발생 가능
//		writer.write('Z');	// IOException 발생 가능
			
//		if(writer != null)
//			writer.close();	// IOException 발생 가능
	}
}
