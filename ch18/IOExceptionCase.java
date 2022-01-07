package ch18;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.IOException;

/* Exception 클래스를 상속하는 예외 클래스 (IOException)
 * 지정 경로에 파일을 생성해, 그 안에 두 개의 문자를 저장하고 끝을 맺는 예제
 * try ~ catch문을 작성 해 예외상황을 처리해줌
 */

class IOExceptionCase {
	public static void main(String[] args) {
		Path file = Paths.get("C:\\Users\\anneu\\Desktop\\study_java\\Simple.txt");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);  // IOException 발생 가능
			writer.write('A');	// IOException 발생 가능
			writer.write('Z');	// IOException 발생 가능
			
			if(writer != null)
				writer.close();	// IOException 발생 가능
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
