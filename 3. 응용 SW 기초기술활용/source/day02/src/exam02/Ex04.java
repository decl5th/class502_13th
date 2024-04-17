package exam02;

public class Ex04 {
    public static void main(String[] args) {
        String[] strs = {"ab", "cd", "ef"};
        for (String str : strs) { // 향상된 for 문 아래구문과 같다
            System.out.println(str);
        }

        // Arrays.stream(strs).forEach(System.out::println);

        for(int i = 0; i< strs.length; i++) {
            System.out.println(strs[i]);
        }
    }
}
