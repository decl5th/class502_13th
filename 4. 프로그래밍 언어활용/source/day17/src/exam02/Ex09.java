package exam02;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Ex09 {
    public static void main(String[] args) {
        ZonedDateTime zdt1 = ZonedDateTime.now();
        System.out.println(zdt1);

        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime londonZdt = zdt1.withZoneSameInstant(london); // ZoneDateTime 클래스 객체 생성후 메서드 적용
        System.out.println(londonZdt);

        ZonedDateTime newYorkZdt = zdt1.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(newYorkZdt);

        // ZoneId.getAvailableZoneIds().forEach(System.out::println); ZoneId 클래스의 메서드 활용 런던 타임존 확인
    }
}
