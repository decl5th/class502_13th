package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01 {
    public static void main(String[] args) {
        String str = "I hate java and javascript even worse";

        Pattern p1 = Pattern.compile("java");
        Matcher m1 = p1.matcher(str); // 다형성 적용하여 str로 해도 문제 없다

        System.out.println(m1.find()); //java
        System.out.println(m1.group()); //패턴에 일치하는 문자열

        System.out.println(m1.find()); // javascript
        System.out.println(m1.group()); // 패턴에 일치하는 문자열

        System.out.println(m1.find()); // 없음 false
        System.out.println(m1.group()); // 패턴에 일치하는 문자열 -> 없음 -> 에러


    }
}
