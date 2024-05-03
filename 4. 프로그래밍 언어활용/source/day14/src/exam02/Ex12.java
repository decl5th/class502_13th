package exam02;

import java.util.Arrays;
import java.util.Comparator;

public class Ex12 {
    public static void main(String[] args) {
        int[] nums = { 33, 10, 5, 1, 3, 88, 100, 10};
        int[] nums2 = Arrays.stream(nums).sorted().toArray();
        // sorted() -> stream에 정의된 기능
        System.out.println(Arrays.toString(nums2));
        // Stream<Integer>  //일반 스트림을 통해서 정렬 바꾸기
        int[] nums3 = Arrays.stream(nums).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(x -> x)
                .toArray();
        System.out.println(Arrays.toString(nums3));
    }
}