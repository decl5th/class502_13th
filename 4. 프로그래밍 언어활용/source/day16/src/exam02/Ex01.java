package exam02;

import java.util.Date;

public class Ex01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        int year = date.getYear();
        int month = date.getMonth();
        System.out.printf("year=%d, month=%d%n", year, month + 1 );
        // month=4 출력값의 이유 month 값의 범위가 0~11이기 때문 그래서 +1 을 붙여줘야함
        long epochTime = date.getTime(); // 1970.1.1. 자정, 1000분의 1초 단위로 카운트

        System.out.println(epochTime); // UID(Unique ID)를 만들때 자주 활용


    }

}
