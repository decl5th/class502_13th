package exam02;

import java.time.LocalDate;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // new LocalDate 안됨 대신 정적 메서드 now 사용
        System.out.println(today);

        LocalDate date = LocalDate.of(2023, 5, 8);
        System.out.println(date);
    }
}
