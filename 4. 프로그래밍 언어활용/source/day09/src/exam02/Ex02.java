package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02 {
    public static void main(String[] args) {
        String str = "I hate java and javascript even worse";

        Pattern p1 = Pattern.compile(".*java.*");
        Matcher m1 = p1.matcher(str);
        boolean match = m1.matches(); // 문장 처음부터 패턴(java)이 나오지 않으면 false
        System.out.println(match);
    }
}
