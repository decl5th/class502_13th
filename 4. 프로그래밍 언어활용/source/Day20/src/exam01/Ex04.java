package exam01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in; // 바이트 단위 스트림

        char ch = (char)in.read();
        System.out.println(ch);
    }
}
