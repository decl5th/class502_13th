package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex11 {
    public static void main(String[] args) {
        String str = "cat|dog|pig";
        String str2 = "I like a dog";
        Pattern p1 = Pattern.compile("cat|dog|pig");
        Matcher m1 = p1.matcher(str2);

        if (m1.find()){
            System.out.println(m1.group());
        }
    }
}
