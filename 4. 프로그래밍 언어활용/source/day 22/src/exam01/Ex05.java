package exam01;

import java.io.File;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) throws IOException {
        File dir = new File("D:/fstudy/sub1/sub2/sub3");// 경로가 중첩되어 있는 경우
        File file = new File(dir, "test1.txt");

        if(!dir.exists()) {
            dir.mkdirs(); // 하위 폴더도 재귀적으로 모두 생성
            // 재귀적 : 어떤 사건이 자신을 포함하고 다시 자기 자신을 사용하여 정의될 때
        }

        file.createNewFile();

        System.out.println("dir 디렉토리 ?(참거짓 판별 기호) " + dir.isDirectory());
        System.out.println("dir 파일 ? " + dir.isFile());
        // dir = 디렉토리이지 파일은 아니다라는 확인
    }
}
