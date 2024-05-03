package exam01;

import java.util.function.Function;

public class Ex05 {
    public static void main(String[] args) {
        Function<String, Integer> func1 = s -> s.length();
        Function<Integer, Integer> func2 = x -> x * x;
        Function<String, Integer> func3 = func1.andThen(func2);
        Function<String, Integer> func4 = func2.compose(func1); // func1 다음에 func2

        int result = func4.apply("가나다"); //가나다 -> 3 -> 제곱되서 9
        System.out.println(result);

        //int len = func1.apply("가나다");
        //System.out.println(len);
    }
}
