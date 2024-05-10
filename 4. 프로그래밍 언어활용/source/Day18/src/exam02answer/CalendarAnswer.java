package exam02answer;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CalendarAnswer {
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
                System.out.println(" S   M   T   W   T   F   S");

                int[] days = getCalendar(year, month);
                for (int i = 0; i < days.length; i++) {
                    int day = days[i];
                    if (day > 0) {
                        System.out.printf("%02d  ", day);
                    } else {
                        System.out.print("    ");
                    }

                    //7마다 줄개행
                    if ((i+1) % 7 == 0 ) {
                        System.out.println();
                    }
                }
                System.out.println();
            } catch (Exception e) { // 숫자 형식 오류가 발생한 경우
                System.out.println("입력 형식이 잘못되었습니다. 입력 예) 2024 05");

            }

        }
    }

    public static int[] getCalendar(int year, int month) {
        /*
         * 1. 매월의 1일이 어떤 요일에 시작하는지
         * 1-1. 매월의 1일이 어떤 요일에 시작하는지 확인 Ex01 참조
         * 2. 매월의 종료일이 무엇인지(30, 31, 28, 29)
         */

        LocalDate startDate = LocalDate.of(year, month, 1);
        LocalDate endDate = startDate.plusMonths(1).minusDays(1);

        int yoil = startDate.getDayOfWeek().getValue() % 7; // 1(월) ~ 7(일) -> % 7 => 0(일) ~ 6(토)  상수 이기에 value 사용
        int start = yoil * -1 + 1;
        /*
        * 6월 기준

        6월의 1일은 토요일 => 토요일의 숫자 값은 6

        7월 기준
        월 1일은 월요일 => 숫자 1이 월요일 값

        5월 기준
        5월 1일은 수요일 => 숫자 3이 수요일 숫자값이고 그 주의 시작일은 일요일인데 전달이니까
        음수로 카운트 하면 1일 기준 뒤로가서 화요일은 0 월요일 -1 일요일은 -2

        이런 식인데 모든 달에 이러한 규칙이 적용되어 보니
        그 달의 첫째주의 시작날의 숫자값 구하는 로직이
        그 달의 1일의 숫자값 * -1 (음수 곱하기) +1 이 되는 것
        => 결국 시작날은 요일의 숫자값 * -1 + 1;
        * */

        int[] days = IntStream.rangeClosed(start, endDate.getDayOfMonth()).toArray();

        return days;
    }
}
