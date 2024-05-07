package exam02;

import java.util.Calendar;

public class Ex02 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        printDate(cal);

        cal.set(Calendar.MONTH, 0); // 1월 // void -> 원객체의 값을 변경

        printDate(cal); // 불변성 유지가 안되는 반환값 확인
    }
        public static void printDate(Calendar cal) {
            // int get(int field) 메서드 사용
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH); // 0 ~ 11
            int day = cal.get(Calendar.DAY_OF_MONTH);

            System.out.printf("year=%d, month=%d, day=%d%n", year, month +1 , day);
        }

}
