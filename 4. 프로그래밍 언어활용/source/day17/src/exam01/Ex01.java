package exam01;

import java.util.Calendar;

public class Ex01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); // 캘린더 객체가 변경됨
        printDate(cal);

        //cal.set(Calendar.MONTH, 11); // 12월
        cal.add(Calendar.DAY_OF_MONTH, 150); // 150일 후

        printDate(cal);

        cal.add(Calendar.DAY_OF_MONTH, -100); // 100일 전

        printDate(cal);
    }

    public static void printDate(Calendar cal) { // 함수 생성
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.printf("%d년/%d월/%d일%n", year, month + 1, day);
    }
}

