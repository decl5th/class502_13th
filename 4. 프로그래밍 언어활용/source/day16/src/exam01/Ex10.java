package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex10 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("name1", "name2", "name3");
        List<String> fruits = Arrays.asList("Apple", "Orange", "Melon");

        // 인위적인 상황의 예제
        Stream<Stream<String>> stm = Stream.of(names.stream(), fruits.stream());


        // 하나의 배열로 병합
        //stm.forEach(System.out::println); // 중첩된 구조의 스트림 객체
        /*
        stm.forEach(st -> {
            st.forEach(System.out::println); // 중첩된 형태로 소스작성해야 문자열로 반환
        });
         */

        // flatmap을 가지고 평탄화 작업; 2차원 배열(중첩된 배열구조)을 1차원적인 배열로 변환
        //stm.flatMap(s -> s).forEach(System.out::println);

        // 평탄화 후 리턴값을 배열로 반환
        String[] strs = stm.flatMap(s -> s).toArray(String[]::new);
        System.out.println(Arrays.toString(strs));


    }
}
