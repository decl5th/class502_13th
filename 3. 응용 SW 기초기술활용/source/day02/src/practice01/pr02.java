package practice01;

public class pr02 {
    public static void main(String[] args) {
        // 나머지를 이용하여 균등배분
        for (int i = 1; i<=40; i++) {
            int roomNo = i % 10; // 0 ~ 9 나머지 값 반복
            System.out.printf("학생%d, 방번호 %d번%n", i, roomNo);
        }
    }
}
