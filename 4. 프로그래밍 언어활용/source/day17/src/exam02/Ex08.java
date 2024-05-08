package exam02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex08 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // 오늘 날짜 생성
        LocalDateTime today2 = today.atTime(LocalTime.now());
        System.out.println(today2);

    }
}
