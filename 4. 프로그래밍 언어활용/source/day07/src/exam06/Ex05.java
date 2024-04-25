package exam06;

public class Ex05 {
    // 문자열도 하나의 객체
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = new String("ABC"); // 문자열의 객체

        boolean result = isSame(str1, str2);
        System.out.printf("result : %s%n", result);
        System.out.println("str1 : " + System.identityHashCode(str1));
        System.out.println("str2 : " + System.identityHashCode(str2));
        System.out.printf("str1.equals(str2): %s%n", str1.equals(str2));

    }

    public static boolean isSame(String str1, String str2) {
         return str1 == str2;
        // return str1.equals(str2);

    }
}
