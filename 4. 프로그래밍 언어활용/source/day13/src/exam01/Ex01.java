package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1, 이름2, 이름3");
        System.out.println(names);

        // 변경이 필요한 경우, list의 구현 클래스의 객체 생성시 생성자의 매개변수로 응답
        List<String> names2 = new ArrayList<>(names);
        names2.remove(0);
        System.out.println(names2);
    }
}
