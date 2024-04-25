package exam02error;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
             fis = new FileInputStream("a.txt");

            System.out.println("file working...");

            fis.close(); // IOException
            System.out.println("자원해제 완료!");
        } catch ( IOException e) { // 다형성을 통해 FileNotFoundException == IOException
            e.printStackTrace(); // 파일 쪽에 데이터를 읽어오는 형태의 클래스 앱 종료시 없어짐
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e2) {

                }
            }

        } finally {
            System.out.println("activate anyway");
        }
    }
}
