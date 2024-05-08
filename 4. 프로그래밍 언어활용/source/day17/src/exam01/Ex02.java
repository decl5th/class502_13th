package exam01;

import java.util.Calendar;

public class Ex02 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        //cal.add(Calendar.MONTH, 30); // 전체 날짜의 값이 변경
        cal.roll(Calendar.MONTH, 30); // Month의 값만 독자적으로 변경
        printDate(cal);
    }

    public static void printDate(Calendar cal) { // 함수 생성
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.printf("%d년/%d월/%d일%n", year, month + 1, day);
    }
}
