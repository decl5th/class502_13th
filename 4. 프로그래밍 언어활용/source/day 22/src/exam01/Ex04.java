package exam01;

import java.io.File;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) throws IOException {
        /* 파일 객체 생성
        File file = new File("D:/test1.txt");// 객체만 생성될 뿐 파일이 생성된 건 아님
        file.createNewFile(); // 비어있는 파일 생성
         */

        File dir = new File("D:/fstudy");
        File file = new File(dir, "test1.txt"); //dir : 경로

        // exists( ): 팡ㄹ 또는 디렉토리 존재 유무 체크
        if (!dir.exists()) { // 디렉토리가 없는 경우
            dir.mkdir(); // 디렉토리 1개만 생성
        }

        file.createNewFile();

    }
}
