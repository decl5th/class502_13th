package exam02;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex03 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Month month = today.getMonth();
        System.out.println(month);

        Locale locale = new Locale("ko", "kr"); // Locale 클래스의 기본 생성자 문법
        String yoilstr = month.getDisplayName(TextStyle.FULL, locale); //Month 클래스의 메서드 사용
        System.out.println(yoilstr);

        String yoilStrEng = month.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println(yoilStrEng);
    }
}
