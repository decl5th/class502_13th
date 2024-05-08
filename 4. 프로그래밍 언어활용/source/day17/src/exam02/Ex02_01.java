package exam02;

import java.time.LocalDate;

public class Ex02_01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        int yoil = today.getDayOfWeek().getValue();

        System.out.println(today);
        System.out.printf("%d년/%d월/%d일/ 주의%d번째 요일%n", year, month, day, yoil);
    }
}

