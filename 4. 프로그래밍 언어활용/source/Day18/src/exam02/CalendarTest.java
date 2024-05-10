package exam02;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("년 월 입력:");
            String input = sc.nextLine(); // 2024 5 -> 연과 월 쪼개야됨

            if (input.equals("exit")) {
                System.out.println("종료 합니다");
                break;
            }

            try {
                String[] data = input.split("\\s+"); // 정규표현식 연도와 월을 쪼갠 형태?
                int year = Integer.parseInt(data[0]);
                int month = Integer.parseInt(data[1]);
                System.out.printf("---- %d년 %d월 ----%n", year, month);
                System.out.println("일  월  화  수  목  금  토");
                getCalendar(year, month);

            } catch (Exception e) { // 숫자 형식 오류가 발생한 경우
                System.out.println("입력 형식이 잘못되었습니다. 입력 예) 2024 05");

            }

        }
    }

    public static Object getCalendar(int year, int month) {
        /*
        * 1. 매월의 1일이 어떤 요일에 시작하는지
        * 1-1. 매월의 1일이 어떤 요일에 시작하는지 확인 Ex01 참조
        * 2. 매월의 종료일이 무엇인지(30, 31, 28, 29)
         */
        LocalDate today = LocalDate.now();
        LocalDate startDate = LocalDate.of(today.getYear(), today.getMonth(), 1);

        int yoil = startDate.getDayOfWeek().getValue(); // 1(월) ~ 7(일)
        // 요일을 0(일) ~ 6(토) -> yoil % 7 나머지


        LocalDate endDate = startDate.plusMonths(1).minusDays(1);

        Duration daysOfMonth = Duration.between(startDate, endDate);



        /*
        SimpleDateFormat today = new SimpleDateFormat("YYYY.MM.dd");
        String strDate1 = today.format(startDate);
        System.out.println(strDate1);
         */

        return null;
    }
}
