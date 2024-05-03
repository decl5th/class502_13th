package exam02;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "mango","melon");
        fruits.stream().map(s -> "*" + s + "*")
                .map(String::toUpperCase) // 중간 연산
                .forEach(System.out::println); // 최종 연산
    }
}
