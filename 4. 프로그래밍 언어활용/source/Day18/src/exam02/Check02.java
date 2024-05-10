package exam02;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.IsoChronology;

public class Check02 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();

        System.out.printf("%d년 %d월 %d일%n", year, month, day);

    }



}
