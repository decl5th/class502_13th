package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test1.txt")) {

            while(fis.available() > 0) { //-1 대신 FileInputStream 메서드 사용
                System.out.println((char)fis.read()); // 1byte씩 읽는 거라 사실 효율적이지 못함
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
