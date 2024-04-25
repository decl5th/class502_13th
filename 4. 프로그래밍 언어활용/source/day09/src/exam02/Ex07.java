package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex07 {
    public static void main(String[] args) {
        String str = "java I like java and javascript";
        Pattern p1 = Pattern.compile("\\bjava\\b"); // 단어와 단어 사이의 공백이 있을 경우 매칭
        Matcher m1 = p1.matcher(str);

        if (m1.find()) {
            System.out.println(m1.group()); // 첫 java 매칭

        }

        if (m1.find()) {
            System.out.println(m1.group()); // 두번째 like 뒤에 java 와 매칭
        }

        m1.find();
        System.out.println(m1.group());
    }
}
