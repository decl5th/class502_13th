package exam02;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex05 {
    // 불변성을 확인할 수 있는 예제
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        today.with(ChronoField.YEAR, 2023); //  불변성 유지
        System.out.println("변경 X: " + today);

        LocalDate lastYear = today.with(ChronoField.YEAR, 2023);
        System.out.println("변경 O: " + lastYear);
    }
}
