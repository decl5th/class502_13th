package exam01;

import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {
        char[] chars = new char[10];
        Arrays.fill(chars, '*'); // 배열이 다 채워진다
        System.out.println(Arrays.toString(chars));

        // user01 -> use*** ; 앞에 세글자만 표시 처리
        String userId = "user01";
        char[] char2 = userId.toCharArray();
        Arrays.fill(char2, 3, userId.length(), '*');
        System.out.println(Arrays.toString(char2));
        userId = String.valueOf(char2);
        System.out.println(userId);



    }
}
