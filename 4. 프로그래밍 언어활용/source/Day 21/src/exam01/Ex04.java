package exam01;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        // 많은 데이터(배열의 값)을 읽어오려면 반복문을 이용해서...
        try (FileInputStream fis = new FileInputStream("score.txt");
             DataInputStream dis = new DataInputStream(fis)) {
            int total = 0, cnt = 0;
            try {
                while (true) { //무한반복
                    int score = dis.readInt();
                    total += score;
                    cnt++;
                }
            }catch (EOFException e) { // 파일을 다 read한 상태
                System.out.printf("합계: %d, 평균: %.1f", total, total / (double)cnt);
                // 평균을 소수점으로 내기 위해서 double로 명명
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
