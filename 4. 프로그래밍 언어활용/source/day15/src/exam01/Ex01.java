package exam01;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        String[] fruits = { "Apple","Orange", "Apple","Banana","Melon" };

    /**
     * 1. 중복 제거
     * 2. 문자열 길이 변경 (String -> int/ MapToInt 변환 메서드
     * 3. int[] 배열로 변경
     */

        int[] nums = Arrays.stream(fruits)
                            .distinct()
                            .mapToInt(String::length)/*중간연산*/
                            .toArray();/*최종연산*/
        System.out.println(Arrays.toString(nums)); // 문자열 길이만 출력


    }
}
