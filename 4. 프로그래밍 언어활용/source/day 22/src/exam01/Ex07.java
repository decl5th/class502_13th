package exam01;

import java.io.File;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/fstudy/sub1/sub2/sub3/test1.txt");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath); // 전체경로 출력

        // 상위경로 fstudy에 위치한 test1파일에 접근하려면 ..을 사용

        File file2 = new File("D:/fstudy/sub1/sub2/sub3/../../../test1.txt"); // == D:/fstudy/test1.txt

        String absolutePath2 = file2.getAbsolutePath();
        System.out.println("상대경로로 표시 => " + absolutePath2);

        String canonicalPath = file2.getCanonicalPath();
        System.out.println("절대경로로 변경 표시 => " + canonicalPath);

        System.out.println("getName() : " + file.getName());
        System.out.println("getPath() : " + file.getPath());
    }
}
