package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex06 {
    public static void main(String[] args) {
        List<String> fruitsw = Arrays.asList("Apple", "Orange", "Melon", "Mango");

        String str = fruitsw.stream().collect(Collectors.joining(","));
        System.out.println(str);

        String str2 = fruitsw.stream().collect(Collectors.joining("#", "**", "^^"));
        System.out.println(str2);
    }
}
