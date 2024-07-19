package src.fire.ch18;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.IOException;

/* try-with-resources
 * try에 이어 등장하는 소괄호 안에 종료의 과정을 필요로 하는 리소스를 생성
 * 리소스는 try-with-resources 를 빠져나오면서 자동으로 종료
 */
class TryWithResource {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\Users\\anneu\\Desktop\\study_java\\Simple.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            writer.write('A');
            writer.write('Z');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
