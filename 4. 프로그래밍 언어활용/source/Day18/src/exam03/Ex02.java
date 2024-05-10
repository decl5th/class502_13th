package exam03;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex02 {
    public static void main(String[] args) throws ParseException {
        String price = "1,000,000원";

        DecimalFormat df = new DecimalFormat("#,###원");
        Number number = df.parse(price);
        // parse는 형식화된 문자열에서 숫자로 변환 근데 그 숫자는 실수가 될수도 있고 정수가 될 수도 있다
        // 즉, 숫자의 자료형을 정확히 모르기 때문에 작성자가 숫자자료형 명시
        long num = number.longValue();
        System.out.println(num);
    }
}
