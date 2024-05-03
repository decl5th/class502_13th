package exam01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex05 {
    public static void main(String[] args) {
        int[] nums = IntStream.generate(() -> 1)/*매개 변수 없는 상태, 1로 꽉채운 상태 = 무제한 스트림*/
                .limit(10)/*무제한 생성이 되다 보면 다운이 되기 때문에 그에대 한 방지 차원*/
                .toArray();// 배열로 반환
        System.out.println(Arrays.toString(nums));
    }
}
