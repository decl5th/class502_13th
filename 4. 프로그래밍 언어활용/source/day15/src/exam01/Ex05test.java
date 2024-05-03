package exam01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex05test {
    public static void main(String[] args) {
        IntStream.generate(() -> 1)/*매개 변수 없는 상태, 1로 꽉채운 상태 = 무제한 스트림*/
                .limit(10).forEach(System.out::println);/*무제한 생성이 되다 보면 다운이 되기 때문에 그에대 한 방지 차원*/
    }
}

