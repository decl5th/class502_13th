package exam02;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex02 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        int year = today.get(ChronoField.YEAR);
        int month = today.get(ChronoField.MONTH_OF_YEAR); // 1~12
        int day = today.get(ChronoField.DAY_OF_MONTH);
        int yoil = today.get(ChronoField.DAY_OF_WEEK); // 요일 1(월)~7(일)

        System.out.println(today);
        System.out.printf("%d년/%d월/%d일/ 주의%d번째 요일%n", year, month, day, yoil);
    }
}
