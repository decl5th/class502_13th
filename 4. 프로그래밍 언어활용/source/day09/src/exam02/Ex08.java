package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex08 {
    public static void main(String[] args) {
        String str = "java one\njava two\njava three";
        Pattern p1 = Pattern.compile("^\\w+\\s", Pattern.MULTILINE);
        //java로 시작하는 문자열이면서 뒤에 공백이 하나 있는 것을 찾아내고 문장이 여러줄인것을 인식하겟다
        Matcher m1 = p1.matcher(str);
        if (m1.find()) {
            System.out.println(m1.group());
        }

        if (m1.find()) {
            System.out.println(m1.group());
        }

        if (m1.find()) {
            System.out.println(m1.group());
        }
    }
}
