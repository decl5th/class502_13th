package exam02error;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
    //자바에서 외부 자원에 접근하는 경우 외부자원을 사용 후 제대로 닫아줘야 함 자원을 닫을(해제) 때의 기능
        // try-catch-finally를 사용한 자원해제(자원을 닫을 때)의 예제 코드

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");

            System.out.println("file working...");


        } catch ( IOException e) { // 다형성을 통해 FileNotFoundException == IOException
            e.printStackTrace(); // 파일 쪽에 데이터를 읽어오는 형태의 클래스 앱 종료시 없어짐
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e2) {

                }
            }

        }
    }
}
