package exam01;

import java.io.*;

public class Ex02 {
    // 데이터 읽어오기
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test1.txt");
             DataInputStream dis = new DataInputStream(fis)) {
            /*
            byte num = dis.readByte();
            char ch = dis.readChar();
            String str = dis.readUTF();
             */
            // 순서대로 하지 않으면 출력 오류 생김

            char ch = dis.readChar();
            byte num = dis.readByte();
            String str = dis.readUTF();

            System.out.printf("num=%d, ch=%c, str=%s%n", num, ch, str);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

