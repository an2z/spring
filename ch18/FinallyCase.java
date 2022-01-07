package ch18;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.IOException;

/* finally
 * 코드의 실행이 try 안으로 진입하면 finally구문은 무조건 실행됨
 * finally 내에서도 try~catch문을 작성해줄 수 있다.
 */

class FinallyCase {
	public static void main(String[] args) {
		Path file = Paths.get("C:\\Users\\anneu\\Desktop\\study_java\\Simple.txt");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);	// IOException 발생 가능
			writer.write('A');	// IOException 발생 가능
			writer.write('Z');	// IOException 발생 가능
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(writer != null)
					writer.close();  // IOException 발생 가능
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
