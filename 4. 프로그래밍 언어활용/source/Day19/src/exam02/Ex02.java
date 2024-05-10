package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test1.txt")) {
            int ch = 0;
            while((ch = fis.read()) != -1) {
                // -1을 통해서 파일을 끝까지 읽었는지 아닌지 확인 가능
                System.out.println((char)ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
