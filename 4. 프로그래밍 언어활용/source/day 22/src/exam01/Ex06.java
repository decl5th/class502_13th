package exam01;

import java.io.File;
import java.io.IOException;

public class Ex06 {
    public static void main(String[] args) throws IOException, InterruptedException {
        File temFile = File.createTempFile("tmp", ".log", new File("D:/fstudy")); // prefix : 파일명, suffix : 확장자

        //temFile.delete(); // 바로 삭제
        temFile.deleteOnExit(); // 애플리케이션이 종료되면 삭제

        Thread.sleep(5000); //5초 뒤 동작 실행
        System.out.println("종료!");
    }
}
