package exam02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름3","이름4","이름5");
        /*names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s); // forEach의 내부에서 돌아가는 함수(추상메서드)

            }
        });
         */
        names.forEach(s -> System.out.println(s)); // 람다식
    }
}
