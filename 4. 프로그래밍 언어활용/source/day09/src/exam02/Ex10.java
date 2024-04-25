package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10 {
    public static void main(String[] args) {
        String mobileNum = "010-3481-2101";
        System.out.println(checkMobile(mobileNum));

    }

    public static boolean checkMobile(String mobileNum) {
        /*
        * 010-0000-0000
        * 011-000-0000
        * 016-000-0000
         */

        Pattern pattern = Pattern.compile("^01[016]\\D*-\\d{3,4}\\D*-\\d{4}$");
        // 01[016] -> 010,011,016
        Matcher matcher = pattern.matcher(mobileNum);

        boolean matched = matcher.find();

        return matched;
    }
}
