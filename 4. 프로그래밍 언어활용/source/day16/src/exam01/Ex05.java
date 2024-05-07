package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex05 {
    public static void main(String[] args) {
        String[] names = {"이름1", "이름1",  "이름2", "이름3", "이름4", "이름5"};
        // 배열을 stream을 이용하여 List로 변환
       // List<String> namesList = Arrays.stream(names).collect(Collectors.toList());
        List<String> namesList = Arrays.stream(names).toList();


        System.out.println(namesList);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.deepToString(names));

        Set<String> namesSet = Arrays.stream(names).collect(Collectors.toSet());
        System.out.println(namesSet); // 중복제거
    }
}
