package exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
       try (FileInputStream fis = new FileInputStream("test1.txt")) {
            int ch = fis.read(); // 1byte를 읽어옴 => 알파벳 한글자만
           System.out.println((char)ch);
           ch = fis.read();
           System.out.println((char)ch);

           ch = fis.read();
           System.out.println((char)ch);

           ch = fis.read();
           System.out.println((char)ch);

           ch = fis.read();
           System.out.println((char)ch);

           ch = fis.read();
           System.out.println(ch);
           System.out.println((char)ch);

       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
