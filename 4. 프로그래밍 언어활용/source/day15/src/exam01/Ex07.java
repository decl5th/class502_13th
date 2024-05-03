package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex07 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","pear","orange","mango","melon");

        String[] selected = fruits.stream()
                .peek(System.out::println) // 중간연산이고 peek = 확인 용도
                .skip(2)
                .limit(2)
                .toArray(String[]::new);
                //.toArray(i -> new String[i])

        System.out.println(Arrays.toString(selected));
    }
}
